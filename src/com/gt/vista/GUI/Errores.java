package com.gt.vista.GUI;

import com.gt.control.Reportes;
import com.gt.modelo.Token;
import java.util.List;

public class Errores extends javax.swing.JDialog {
//--- Ventana Reporte de Errores - Analizador Léxico

    private Principal menu;
    private boolean init;

    public Errores(Principal parent, boolean modal, boolean init, List<Token> listaTokens) {
        super(parent, modal);
        initComponents();
        this.menu = parent;
        this.init = init;
        Reportes.tablaErrores(listaTokens, tablaErrores);
        setSize(600, 350);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelErrores = new javax.swing.JPanel();
        tableRErrores = new javax.swing.JScrollPane();
        tablaErrores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte Errores");
        setBackground(new java.awt.Color(127, 179, 213));

        panelErrores.setBackground(new java.awt.Color(127, 179, 213));

        tablaErrores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableRErrores.setViewportView(tablaErrores);

        javax.swing.GroupLayout panelErroresLayout = new javax.swing.GroupLayout(panelErrores);
        panelErrores.setLayout(panelErroresLayout);
        panelErroresLayout.setHorizontalGroup(
            panelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelErroresLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tableRErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelErroresLayout.setVerticalGroup(
            panelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelErroresLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tableRErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelErrores;
    private javax.swing.JTable tablaErrores;
    private javax.swing.JScrollPane tableRErrores;
    // End of variables declaration//GEN-END:variables
}