package com.gt.control;

import com.gt.vista.GUI.Principal;
import java.awt.EventQueue;

public class Main {
//---     
    public static void main(String[] args) {
        //--- Código Ejecutable
        System.out.println("Hola Git");
        EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
    
}