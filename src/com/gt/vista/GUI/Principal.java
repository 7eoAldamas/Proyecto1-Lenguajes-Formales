package com.gt.vista.GUI;

import com.gt.archivos.Archivo;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal extends JFrame {
//--- Ventana Principal - Analizador Léxico        

    private Archivo archivo = new Archivo();
    private File aux;

    public Principal() {
        initComponents();
        setSize(900, 600);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelP = new javax.swing.JPanel();
        scrollPArea = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        scrollPLog = new javax.swing.JScrollPane();
        btnAnalizar = new javax.swing.JButton();
        menuP = new javax.swing.JMenuBar();
        menuArchivos = new javax.swing.JMenu();
        itemAbrir = new javax.swing.JMenuItem();
        itemGuardar = new javax.swing.JMenuItem();
        itemGuardarComo = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        itemRErrores = new javax.swing.JMenuItem();
        itemRTokens = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tokenizer.2");
        setResizable(false);

        panelP.setBackground(new java.awt.Color(218, 247, 166));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        scrollPArea.setViewportView(txtArea);

        btnAnalizar.setText("Analizar");
        btnAnalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnalizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(scrollPArea, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(scrollPLog, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(scrollPArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnAnalizar)
                .addGap(45, 45, 45)
                .addComponent(scrollPLog, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        menuArchivos.setText("Archivos");

        itemAbrir.setText("Abrir");
        itemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirActionPerformed(evt);
            }
        });
        menuArchivos.add(itemAbrir);
        itemAbrir.getAccessibleContext().setAccessibleDescription("");
        itemAbrir.getAccessibleContext().setAccessibleParent(menuArchivos);

        itemGuardar.setText("Guardar");
        itemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarActionPerformed(evt);
            }
        });
        menuArchivos.add(itemGuardar);
        itemGuardar.getAccessibleContext().setAccessibleParent(menuArchivos);

        itemGuardarComo.setText("Guardar Como");
        itemGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarComoActionPerformed(evt);
            }
        });
        menuArchivos.add(itemGuardarComo);

        menuP.add(menuArchivos);

        menuReportes.setText("Reportes");

        itemRErrores.setText("Errores");
        itemRErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRErroresActionPerformed(evt);
            }
        });
        menuReportes.add(itemRErrores);

        itemRTokens.setText("Tokens");
        itemRTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRTokensActionPerformed(evt);
            }
        });
        menuReportes.add(itemRTokens);

        menuP.add(menuReportes);

        menuBuscar.setText("Buscar");
        menuBuscar.setToolTipText("Ingresar Patrón");
        menuBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBuscarMouseClicked(evt);
            }
        });
        menuP.add(menuBuscar);

        setJMenuBar(menuP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBuscarMouseClicked
        // Evento Insertar Patrón de Búsqueda
        new Insert(this, true, true).setVisible(true);
    }//GEN-LAST:event_menuBuscarMouseClicked

    private void itemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarActionPerformed
        // Evento Guargar - Archivo (txt)  
        if (aux != null) {
            File auxPath = aux.getAbsoluteFile();
            archivo.guardarArchivo(auxPath, txtArea);
        } else {
            JOptionPane.showMessageDialog(txtArea, "La acción no se puede ejecutar", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_itemGuardarActionPerformed

    private void itemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirActionPerformed
        // Evento Abrur Archivo 
        JFileChooser file = new JFileChooser();
        file.setApproveButtonText("Abrir");
        aux = archivo.obtenerPath(file, this);
        archivo.abrirArchivo(aux, txtArea);
    }//GEN-LAST:event_itemAbrirActionPerformed

    private void btnAnalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalizarMouseClicked
        // Evento Analizar
    }//GEN-LAST:event_btnAnalizarMouseClicked

    private void itemRErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRErroresActionPerformed
        // Evento Reporte de Errores
        new Errores(this, true, true).setVisible(true);
    }//GEN-LAST:event_itemRErroresActionPerformed

    private void itemRTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRTokensActionPerformed
        // Evento Reportes de Tokens      
        new Tokens(this, true, true).setVisible(true);
    }//GEN-LAST:event_itemRTokensActionPerformed

    private void itemGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarComoActionPerformed
        // Evento Guardar Como - Archivo (txt)
        JFileChooser file = new JFileChooser();
        file.setApproveButtonText("Guardar");
        archivo.guardarComoArchivo(file, txtArea, this);
    }//GEN-LAST:event_itemGuardarComoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JMenuItem itemAbrir;
    private javax.swing.JMenuItem itemGuardar;
    private javax.swing.JMenuItem itemGuardarComo;
    private javax.swing.JMenuItem itemRErrores;
    private javax.swing.JMenuItem itemRTokens;
    private javax.swing.JMenu menuArchivos;
    private javax.swing.JMenu menuBuscar;
    private javax.swing.JMenuBar menuP;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JPanel panelP;
    private javax.swing.JScrollPane scrollPArea;
    private javax.swing.JScrollPane scrollPLog;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
