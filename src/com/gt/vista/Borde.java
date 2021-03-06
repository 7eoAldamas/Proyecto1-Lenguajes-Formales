package com.gt.vista;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.JViewport;
import javax.swing.border.AbstractBorder;

public class Borde extends AbstractBorder {
//---

    private final int alturaLinea = 18; //Altura Fila - Caracteres
    private final int altura = 10; //Altura Num Fila - Borde
    private final int ancho = 8; //Ancho Num Fila - Borde
    private JViewport viewport; //Deslizamiento

    @Override             //Componente -txtArea              Eje X  | Eje Y |  Ancho  |  Altura
    public void paintBorder(Component component, Graphics g, int x, int y, int width, int height) {
        int posY; //Pos - Eje Y
        int posX; //Pos - Eje X      
        int pos = 0; //Posición        
        int tamanio;

        if (this.viewport == null) {
            buscarViewport(component);
        }

        Point point;
        Dimension size = null;
        if (this.viewport != null) {
            point = this.viewport.getViewPosition();
        } else {
            point = new Point();
        }

        int auxFila = (height / alturaLinea);
        int fila = (auxFila + 1);
        String aux = String.valueOf(fila);
        int tamanioMax = aux.length();

        if (point.y > 0) {
            pos = (point.y / alturaLinea);
        }

        if (size != null) {
            auxFila = (size.height / alturaLinea);
            fila = (auxFila + 1);
            fila += pos + 1;
        }

        for (int i = 0; i < fila; i++) {
            aux = String.valueOf(i + 1);
            tamanio = aux.length();
            tamanio = tamanioMax - tamanio;

            posY = (alturaLinea * i + 14);
            posX = (ancho * tamanio + 2);

            g.drawString(aux, posX, posY);
        }

        int iz = ubicacionIz(height) + 5;
        g.drawLine(iz, 0, iz, height);
    }

    @Override
    public Insets getBorderInsets(Component c) { //
        int iz = ubicacionIz(c.getHeight()) + 10; 
        return new Insets(1, iz, 1, 1);
    }

    //--- Búsqueda del Componente
    private void buscarViewport(Component component) {
        Container parent = component.getParent();
        if (parent instanceof JViewport parentViewport) {
            viewport = parentViewport;
        }
    }

    //--- Posicionamineto parte izquierda
    private int ubicacionIz(int height) {
        int auxFila = (height / alturaLinea);
        int fila = (auxFila + 1);
        String aux = String.valueOf(fila);
        int tamanio = aux.length();
        return (altura * tamanio);
    }

}