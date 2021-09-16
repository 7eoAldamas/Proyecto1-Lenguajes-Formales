package com.gt.control;

import static com.gt.control.tokenizer.enums.Tipos.*;
import com.gt.control.tokenizer.enums.Tipos;
import com.gt.modelo.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class Validaciones {
//---    
    
    private List<Token> rTokenValido = new ArrayList<>();
    private List<TokenE> rtokenErroneo = new ArrayList<>();
    private String cadena;
    private int pos = 0;
    private int estadoActual = 0;
        
    //--- Matriz de Transición δ  
    
                              // 0-L 1-D 2-SP 3-OP 4-SA 5-Error 
                              //[0,0][0,1][0,2][0,3][0,4][0,5] 
    private int [][] matrizT = {{1,   4,   7,   8,   9,  -1},
                              //[1,0][1,1][1,2][1,3][1,4][1,5]
                                {2,   -1,  -1,  -1,  -1,  -1},
                              //[2,0][2,1][2,2][2,3][2,4][2,5]  
                                {2,  3,  -1,  -1,  -1,  -1},
                              //[3,0][3,1][3,2][3,3][3,4][3,5]  
                                {-1,  3,  -1,  -1,  -1,  -1},
                              //[4,0][4,1][4,2][4,3][4,4][4,5]  
                                {-1,  4,   5,  -1,  -1,  -1},
                              //[5,0][5,1][5,2][5,3][5,4][5,5]  
                                {-1,  6,  -1,  -1,  -1,  -1},
                              //[6,0][6,1][6,2][6,3][6,4][6,5]  
                                {-1,  6,  -1,  -1,  -1,  -1},
                              //[7,0][7,1][7,2][7,3][7,4][7,5]
                                {-1,  -1,  7,  -1,  -1,  -1},
                              //[8,0][8,1][8,2][8,3][8,4][8,5]
                                {-1,  -1,  -1,  8,  -1,  -1},
                              //[9,0][9,1][9,2][9,3][9,4][9,5]
                                {-1,  -1,  -1,  -1,  9,  -1},};
        
    //--- Inicio
    public void inicio(JTextArea txtArea, JTextArea txtLog) {
        txtLog.selectAll();
        txtLog.replaceSelection(null);
        cadena = txtArea.getText();
        while (pos < cadena.length()) {            
            analizarToken(txtLog);
        }
    }
    
    //--- Validación de Tokens
    public void analizarToken(JTextArea txtLog) {
        boolean siguiente = true;
        char caracter;
        estadoActual = 0;
        String token = "";
        while (siguiente && (pos < cadena.length())) {            
            caracter = cadena.charAt(pos);
            if (isEspacio(caracter)) {
                siguiente = false;
            } else {
                int auxEstado = estadoActual;
                estadoActual = validarSiguienteEstado(estadoActual, caracter);
                token += caracter;   
                txtLog.append("Estado ->  " +auxEstado+ "     |     Transición ->  "+estadoActual+"     |     Caracter [ "+caracter+" ]\n");                
            }
            pos++;
        }
        txtLog.append("\n");
    }
    
    //--- Movimiento en la Matriz de Transición δ 
    public int validarSiguienteEstado(int estadoActual, char caracter) {
        int siguienteEstado = -1;
        if (estadoActual >= 0 && estadoActual <=6) { 
            siguienteEstado = matrizT[estadoActual][evaluarAlfabeto(caracter)];
        }
        return siguienteEstado;
    }
    
    //--- Evaluación de Alfabeto
    public int evaluarAlfabeto(char caracter) {
        int estado = 5;
        
        if (isLetra(caracter)) {
            estado = 0;
        } else if (isNumero(caracter)) {
            estado = 1;
        } else if (isSignoPuntuacion(caracter)) {
            estado = 2;
        } else if (isOperadorAritmetico(caracter)) {
            estado = 3;
        } else if (isSignoAgrupacion(caracter)) {
            estado = 4;
        }        
        return estado;
    }
    
    //--- Tipo Token
    public Tipos getToken() {
        Tipos token = null; 
        switch(estadoActual) {
            case 2, 3 -> {token = IDENTIFICADOR;}
            case 4 -> {token = NUM_ENTERO;}
            case 6 -> {token = NUM_DECIMAL;}
            case 7 -> {token = SIGNO_PUNTUACION;}
            case 8 -> {token = OPERADOR;}
            case 9 -> {token = SIGNO_AGRUPACION;}
            default -> {token = ERROR;}
        }        
        return token;
    }
        
    //--- Alfabeto Permitido
    
    //--- Letras
    public boolean isLetra(char caracter) {
        boolean isValido = false;
        if (((caracter >= 'a') && (caracter <= 'z') || (caracter >= 'A') && (caracter <= 'Z')) && (caracter != 'ñ')) {
            isValido = true;
        }
        return isValido;
    }   
    
    //--- Números
    public boolean isNumero(char caracter) {
        boolean isValido = false;
        if (caracter >= '0' && caracter <= '9') {
            return true;
        }
        return isValido;
    }
    
    //--- Signos de Puntuación
    public boolean isSignoPuntuacion(char caracter) {
        boolean isValido = false;
        switch (caracter) {
            case '.' -> {isValido = true;}
            case ',' -> {isValido = true;}
            case ';' -> {isValido = true;}
            case ':' -> {isValido = true;}
        }
        return isValido;
    }

    //--- Operadores Aritméticos
    public boolean isOperadorAritmetico(char caracter) {
        boolean isValido = false;
        switch(caracter) {
            case '+' -> {isValido = true;}
            case '-' -> {isValido = true;}
            case '*' -> {isValido = true;}
            case '/' -> {isValido = true;}
            case '%' -> {isValido = true;}
        }
        return isValido;
    }
    
    //--- Signos de Agrupación 
    public boolean isSignoAgrupacion(char caracter) {
        boolean isValido = false;
        switch(caracter) {
            case '(' -> {isValido = true;}
            case ')' -> {isValido = true;}
            case '{' -> {isValido = true;}
            case '}' -> {isValido = true;}
            case '[' -> {isValido = true;}
            case ']' -> {isValido = true;}
        }
        return isValido;
    }
    
    //--- Espacio y/o salto de línea
    public boolean isEspacio(char caracter) {
        boolean isValido = false;
        switch(caracter) {
            case '\n' -> {isValido = true;}
            case ' ' -> {isValido = true;}
            case '\t' -> {isValido = true;}
        }
        return isValido;
    }
    
}