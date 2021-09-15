package com.gt.vista.GUI;

import com.gt.control.Patron;

public class Insert extends javax.swing.JDialog {
//--- Ventana Ingresar Patrón - Analizador Léxico
    
    private Principal menu;
    private boolean init;
    private Patron patron = new Patron();
    
    public Insert(Principal parent, boolean modal, boolean init) {
        super(parent, modal);
        initComponents();
        this.menu = parent;
        this.init = init;
        setSize(400, 200);
        setLocationRelativeTo(null);
    }
         
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelD = new javax.swing.JPanel();
        txtFPatron = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patrón");

        panelD.setBackground(new java.awt.Color(51, 255, 147));

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDLayout = new javax.swing.GroupLayout(panelD);
        panelD.setLayout(panelDLayout);
        panelDLayout.setHorizontalGroup(
            panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(txtFPatron, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        panelDLayout.setVerticalGroup(
            panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtFPatron, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // Evento Buscar Patrón
        patron.guardarPatron(txtFPatron);
        dispose();
    }//GEN-LAST:event_btnBuscarMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel panelD;
    private javax.swing.JTextField txtFPatron;
    // End of variables declaration//GEN-END:variables
}