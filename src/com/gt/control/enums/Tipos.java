package com.gt.control.enums;

public enum Tipos {
//---      
    
    IDENTIFICADOR("Identificador"),
    NUM_ENTERO("Número Entero"),
    NUM_DECIMAL("Número Decimal"),
    SIGNO_PUNTUACION("Signo de Puntuación"),
    OPERADOR("Operador Aritmético"),
    SIGNO_AGRUPACION("Signo de Agrupación"),
    ERROR("Error");
    
    private String tipoToken;
    
    private Tipos(String tipoToken) {
        this.tipoToken = tipoToken;
    }

    public String getTipoToken() {
        return tipoToken;
    }
    
}