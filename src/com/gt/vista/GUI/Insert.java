package com.gt.vista.GUI;

import com.gt.control.Patron;
import com.gt.vista.Borde;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Insert extends JDialog {
//--- Ventana Ingresar Patrón - Analizador Léxico
    
    private Principal menu;
    private boolean init;    
    private Patron patron;
    
    public Insert(Principal parent, boolean modal, boolean init) {
        super(parent, modal);
        initComponents();
        this.menu = parent;
        this.init = init;
        txtAPatron.setBorder(new Borde());
        txtAPatron.setText(menu.getTxtArea().getText());
        setSize(900, 450);
        setLocationRelativeTo(null);
    }
         
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelD = new javax.swing.JPanel();
        txtFPatron = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblPatron = new javax.swing.JLabel();
        scrollPatron = new javax.swing.JScrollPane();
        txtAPatron = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patrón");

        panelD.setBackground(new java.awt.Color(230, 176, 170));

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        lblPatron.setBackground(new java.awt.Color(0, 0, 0));
        lblPatron.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblPatron.setText("Patrón");

        txtAPatron.setColumns(20);
        txtAPatron.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtAPatron.setLineWrap(true);
        txtAPatron.setRows(5);
        txtAPatron.setWrapStyleWord(true);
        txtAPatron.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtAPatron.setEnabled(false);
        scrollPatron.setViewportView(txtAPatron);

        javax.swing.GroupLayout panelDLayout = new javax.swing.GroupLayout(panelD);
        panelD.setLayout(panelDLayout);
        panelDLayout.setHorizontalGroup(
            panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDLayout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addComponent(scrollPatron, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(panelDLayout.createSequentialGroup()
                .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(txtFPatron, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(lblPatron, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDLayout.setVerticalGroup(
            panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblPatron, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtFPatron, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(scrollPatron, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
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
        String patronTxt = txtFPatron.getText();        
        if (!patronTxt.isBlank()) {
            patron = new Patron(new Color(248, 196, 113));
            patron.resaltarPatron(txtAPatron, patronTxt);
        } else {
            JOptionPane.showMessageDialog(this, "Patrón Incorrecto", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarMouseClicked
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel lblPatron;
    private javax.swing.JPanel panelD;
    private javax.swing.JScrollPane scrollPatron;
    private javax.swing.JTextArea txtAPatron;
    private javax.swing.JTextField txtFPatron;
    // End of variables declaration//GEN-END:variables
}