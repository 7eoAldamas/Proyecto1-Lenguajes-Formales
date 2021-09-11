package com.gt.vista.GUI;

import com.gt.archivos.LeerArchivo;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal extends JFrame {
//--- Ventana Principal - Analizador Léxico        
    
    private LeerArchivo archivo;
    
    public Principal() {
        initComponents();
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
        itemCargarDatos = new javax.swing.JMenuItem();
        itemGuardar = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        itemRErrores = new javax.swing.JMenuItem();
        itemRTokens = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tokenizer.2");
        setResizable(false);

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
                        .addGap(156, 156, 156)
                        .addComponent(scrollPLog, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(396, 396, 396))
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(scrollPArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnAnalizar)
                .addGap(39, 39, 39)
                .addComponent(scrollPLog, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        menuArchivos.setText("Archivos");

        itemCargarDatos.setText("Cargar Archivo");
        itemCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCargarDatosActionPerformed(evt);
            }
        });
        menuArchivos.add(itemCargarDatos);
        itemCargarDatos.getAccessibleContext().setAccessibleDescription("");
        itemCargarDatos.getAccessibleContext().setAccessibleParent(menuArchivos);

        itemGuardar.setText("Guardar/Exportar");
        itemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarActionPerformed(evt);
            }
        });
        menuArchivos.add(itemGuardar);
        itemGuardar.getAccessibleContext().setAccessibleParent(menuArchivos);

        menuP.add(menuArchivos);

        menuReportes.setText("Reportes");

        itemRErrores.setText("Errores");
        menuReportes.add(itemRErrores);

        itemRTokens.setText("Tokens");
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
        // Evento Guargar/Exportar Archivo (txt)        
    }//GEN-LAST:event_itemGuardarActionPerformed

    private void itemCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCargarDatosActionPerformed
        // Evento Cargar Datos 
        try {
            JFileChooser file = new JFileChooser();   
            int select = file.showOpenDialog(this);
            if (select == JFileChooser.APPROVE_OPTION) {
                File path = file.getSelectedFile();
                archivo = new LeerArchivo(path, txtArea);                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error", "Carga de Archivo", JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_itemCargarDatosActionPerformed

    private void btnAnalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalizarMouseClicked
        // Evento Analizar
    }//GEN-LAST:event_btnAnalizarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JMenuItem itemCargarDatos;
    private javax.swing.JMenuItem itemGuardar;
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