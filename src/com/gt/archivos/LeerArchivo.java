package com.gt.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class LeerArchivo {
//---
    
    //--- Constructor de Lectura de Archivos
    public LeerArchivo(File path, JTextArea txtArea) { 
        readArchivo(path, txtArea);
    }
    
    //--- Lectura de Archivo
    public void readArchivo(File path, JTextArea txtArea) {
        try (FileReader file = new FileReader(path);
                BufferedReader br = new BufferedReader(file)){
            
            String lineaTxt;
            while ((lineaTxt = br.readLine()) != null) {                
                txtArea.append(lineaTxt);
                txtArea.append("\n");
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(txtArea, "Error", "Lectura de Archivo", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}