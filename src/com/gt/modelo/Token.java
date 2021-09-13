package com.gt.modelo;

import com.gt.control.tokenizer.enums.Tipos;

public class Token {
//--- 
    
    private Tipos tipoToken;
    private String lexema;
    private int fila;
    private int col;    
    
    public Token(Tipos tipoToken, String lexema) {
        this.tipoToken = tipoToken;
        this.lexema = lexema;        
    }

    public Tipos getTipoToken() {
        return tipoToken;
    }

    public String getLexema() {
        return lexema;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    //--- Información
    @Override
    public String toString() {
        return  "TIpo Token=" + tipoToken + ", lexema = " + lexema + ", fila = " + fila + ", columna = " + col;
    }
    
}