package com.gt.modelo;

public class TokenE {
//--- 
    
    private String lexema;
    private int fila;
    private int col;    

    public TokenE(String lexema, int fila, int col) {
        this.lexema = lexema;
        this.fila = fila;
        this.col = col;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
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
        return "TokenE = " + ", lexema = " + lexema + ", fila = " + fila + ", col = " + col;
    }
    
}