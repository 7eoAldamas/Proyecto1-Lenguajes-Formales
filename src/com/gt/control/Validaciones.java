package com.gt.control;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class Validaciones {
//---    

    //--- Leer Texto - Separar Cadenas
    public List<String> leerTexto(JTextArea txtArea) {
        String texto = txtArea.getText();
        List<Integer> indice = new ArrayList<>();
        indice.add(0);
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (" ".equals(texto.substring(i, i + 1))) {
                if (i + 1 != texto.length()) {
                    if (" ".equals(texto.substring(i + 1, i + 2))) {
                    } else {
                        indice.add(i);
                        indice.add(i + 1);
                        contador++; //Incremento
                    }
                }
            }
        }
        indice.add(texto.length());

        List<String> cadena = new ArrayList<>(); //Palabras/Texto
        for (int i = 0; i < indice.size(); i++) {
            cadena.add(texto.substring(indice.get(i), indice.get(i + 1)));
            i++;
        }
        return cadena;
    }

    //--- Automata
    public void automata(List<String> cadena) {
        for (String string : cadena) {
            System.out.println(string);
        }
    }

}