package com.gt.control.tokenizer.enums;

public enum Tipos {
//--- Tokens Válidos       
    
    IDENTIFICADOR("Identificador"),
    NUM_ENTERO("Número Entero"),
    NUM_DECIMAL("Número Decimal"),
    SIGNO_PUNTUACION("Signo de Puntuación"),
    OPERADOR("Operadores Aritméticos"),
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