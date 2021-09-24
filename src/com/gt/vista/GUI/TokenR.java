package com.gt.vista.GUI;

import com.gt.control.Reportes;
import com.gt.modelo.Token;
import java.util.List;
import javax.swing.JDialog;

public class TokenR extends JDialog {
//--- Ventana Reporte de TokenR - Analizador Léxico
    
    private Principal menu;
    private boolean init;
    
    public TokenR(Principal parent, boolean modal, boolean init, List<Token> listaTokens) {
        super(parent, modal);
        initComponents();
        this.menu = parent;
        this.init = init;
        Reportes.tablaTokens(listaTokens, tablaTokens);
        Reportes.tablaRecuento(listaTokens, tablaRecuentoT);
        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTokens = new javax.swing.JPanel();
        scrollPRT = new javax.swing.JScrollPane();
        tablaTokens = new javax.swing.JTable();
        scrollRecuentoT = new javax.swing.JScrollPane();
        tablaRecuentoT = new javax.swing.JTable();
        lblRecuento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte Tokens");
        setBackground(new java.awt.Color(115, 198, 182));

        panelTokens.setBackground(new java.awt.Color(125, 206, 160));

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

        tablaRecuentoT.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollRecuentoT.setViewportView(tablaRecuentoT);

        lblRecuento.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblRecuento.setForeground(new java.awt.Color(0, 0, 0));
        lblRecuento.setText("Recuento de Tokens");

        javax.swing.GroupLayout panelTokensLayout = new javax.swing.GroupLayout(panelTokens);
        panelTokens.setLayout(panelTokensLayout);
        panelTokensLayout.setHorizontalGroup(
            panelTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTokensLayout.createSequentialGroup()
                .addGroup(panelTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTokensLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollRecuentoT, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPRT, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTokensLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(lblRecuento)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelTokensLayout.setVerticalGroup(
            panelTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTokensLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(scrollPRT, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblRecuento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollRecuentoT, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
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
    private javax.swing.JLabel lblRecuento;
    private javax.swing.JPanel panelTokens;
    private javax.swing.JScrollPane scrollPRT;
    private javax.swing.JScrollPane scrollRecuentoT;
    private javax.swing.JTable tablaRecuentoT;
    private javax.swing.JTable tablaTokens;
    // End of variables declaration//GEN-END:variables
}