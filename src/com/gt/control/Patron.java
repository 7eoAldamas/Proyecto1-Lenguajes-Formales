package com.gt.control;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Patron {
//---
    
    //--- Guardar Patrón
    public void guardarPatron(JTextField txtFPatron) {        
        if (txtFPatron.getText() != null) {
            String patron = txtFPatron.getText();            
        } else {
            JOptionPane.showMessageDialog(txtFPatron,"Patrón Inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}