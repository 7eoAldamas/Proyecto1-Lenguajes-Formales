package com.gt.vista.GUI;

import com.gt.control.Reportes;
import com.gt.modelo.Token;
import java.util.List;
import javax.swing.JDialog;

public class Tokens extends JDialog {
//--- Ventana Reporte de Tokens - Analizador Léxico
    
    private Principal menu;
    private boolean init;
    
    public Tokens(Principal parent, boolean modal, boolean init, List<Token> listaTokens) {
        super(parent, modal);
        initComponents();
        this.menu = parent;
        this.init = init;
        Reportes.tablaTokens(listaTokens, tablaTokens);
        setSize(600, 350);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTokens = new javax.swing.JPanel();
        scrollPRT = new javax.swing.JScrollPane();
        tablaTokens = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte Tokens");
        setBackground(new java.awt.Color(115, 198, 182));

        panelTokens.setBackground(new java.awt.Color(115, 198, 182));

        tablaTokens.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPRT.setViewportView(tablaTokens);

        javax.swing.GroupLayout panelTokensLayout = new javax.swing.GroupLayout(panelTokens);
        panelTokens.setLayout(panelTokensLayout);
        panelTokensLayout.setHorizontalGroup(
            panelTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTokensLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(scrollPRT, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelTokensLayout.setVerticalGroup(
            panelTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTokensLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(scrollPRT, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTokens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTokens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelTokens;
    private javax.swing.JScrollPane scrollPRT;
    private javax.swing.JTable tablaTokens;
    // End of variables declaration//GEN-END:variables
}