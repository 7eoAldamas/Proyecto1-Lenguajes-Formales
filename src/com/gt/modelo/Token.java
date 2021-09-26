package com.gt.modelo;

public class Token {
//--- 
    
    private String tipoToken;
    private String lexema;
    private int fila;
    private int col; 
    private int cantidad;
    
    public Token(String tipoToken, String lexema, int fila, int col) {
        this.tipoToken = tipoToken;
        this.lexema = lexema;        
        this.fila = fila;
        this.col = col;
    }

    public Token(String tipoToken, String lexema, int cantidad) {
        this.tipoToken = tipoToken;
        this.lexema = lexema;
        this.cantidad = cantidad;
    }
    
    public String getTipoToken() {
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }    

}