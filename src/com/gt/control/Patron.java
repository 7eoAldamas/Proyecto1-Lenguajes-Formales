package com.gt.control;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class Patron extends DefaultHighlighter.DefaultHighlightPainter {
//---

    public Patron(Color c) {
        super(c);
    }

    //--- Resaltar Palabra - Patron
    public void resaltarPatron(JTextComponent txtAPatron, String patron) {
        reiniciar(txtAPatron);
        
        try {
            Highlighter resaltar = txtAPatron.getHighlighter();
            Document doc = txtAPatron.getDocument();
            String txt = doc.getText(0, doc.getLength());
            int pos = 0;

            while ((pos = txt.toUpperCase().indexOf(patron.toUpperCase(), pos)) >= 0) {
                resaltar.addHighlight(pos, (pos + patron.length()), this);
                pos += patron.length();
            }

        } catch (BadLocationException e) {           
            JOptionPane.showMessageDialog(txtAPatron, "No se obtuvo ningún resultado", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //--- Reinicio - Resaltar Nueva Palabra
    private void reiniciar(JTextComponent txtAPatron) {
        Highlighter palabraResaltada = txtAPatron.getHighlighter();
        Highlighter.Highlight[] cadenaResaltos = palabraResaltada.getHighlights();
        
        for (Highlighter.Highlight resalto : cadenaResaltos) {
            if (resalto.getPainter() instanceof Patron) {
                palabraResaltada.removeHighlight(resalto);
            }
        }
    }

}