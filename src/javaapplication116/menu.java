/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication116;

import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suazo
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_nuevoCampo = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_nombreCampo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcb_tipoCampo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        js_tamanoCampo = new javax.swing.JSpinner();
        jcb_llaveCampo = new javax.swing.JCheckBox();
        jb_aceptarCampo = new javax.swing.JButton();
        jb_cancelarCampo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_file = new javax.swing.JMenu();
        jmi_nuevoArchivo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jm_edit = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nuevo Campo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Tipo");

        jcb_tipoCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "String", "Integer" }));

        jLabel4.setText("Tamaño");

        js_tamanoCampo.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jcb_llaveCampo.setText("Llave Primaria");

        jb_aceptarCampo.setText("Aceptar");
        jb_aceptarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aceptarCampoActionPerformed(evt);
            }
        });

        jb_cancelarCampo.setText("Cancelar");
        jb_cancelarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarCampoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jf_nuevoCampoLayout = new javax.swing.GroupLayout(jf_nuevoCampo.getContentPane());
        jf_nuevoCampo.getContentPane().setLayout(jf_nuevoCampoLayout);
        jf_nuevoCampoLayout.setHorizontalGroup(
            jf_nuevoCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_nuevoCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jf_nuevoCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb_tipoCampo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_nombreCampo)
                    .addComponent(js_tamanoCampo)
                    .addGroup(jf_nuevoCampoLayout.createSequentialGroup()
                        .addGroup(jf_nuevoCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_llaveCampo)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jf_nuevoCampoLayout.createSequentialGroup()
                                .addComponent(jb_aceptarCampo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_cancelarCampo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jf_nuevoCampoLayout.setVerticalGroup(
            jf_nuevoCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_nuevoCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_nombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcb_tipoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(js_tamanoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcb_llaveCampo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jf_nuevoCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_aceptarCampo)
                    .addComponent(jb_cancelarCampo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        jm_file.setText("File");

        jmi_nuevoArchivo.setText("Nuevo Archio");
        jmi_nuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_nuevoArchivoActionPerformed(evt);
            }
        });
        jm_file.add(jmi_nuevoArchivo);

        jMenuItem2.setText("Abrir Archivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jm_file.add(jMenuItem2);

        jMenuItem3.setText("Guardar Archivo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jm_file.add(jMenuItem3);

        jMenuItem5.setText("Cerrar Archivo");
        jm_file.add(jMenuItem5);
        jm_file.add(jSeparator1);

        jMenuItem4.setText("Salir");
        jm_file.add(jMenuItem4);

        jMenuBar1.add(jm_file);

        jm_edit.setText("Edit");

        jMenuItem6.setText("Crear Campo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jm_edit.add(jMenuItem6);

        jMenuItem7.setText("Modificar Campo");
        jm_edit.add(jMenuItem7);

        jMenuItem8.setText("Eliminar Campo");
        jm_edit.add(jMenuItem8);

        jMenuBar1.add(jm_edit);

        jMenu1.setText("Registros");

        jMenuItem9.setText("Agregar Registro");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Eliminar Registro");
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File file;
    boolean openFile = false;
    ArrayList<campo> campos = new ArrayList();
    
    private void actualizarTabla(){
        DefaultTableModel tableModel = new DefaultTableModel();
        for (campo campoActual : campos) {
            tableModel.addColumn(campoActual.getNombre());
        }
        jTable.setModel(tableModel);
    }
    
    private void nuevoArchivo(){
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        jfc.setFileFilter(filter);
        jfc.showOpenDialog(null);
        file = jfc.getSelectedFile();
        try{
            if (file != null) {
                if (file.toPath().toString().endsWith(".txt")) {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    openFile = true;
                }else{
                    JOptionPane.showMessageDialog(this, "El tipo de archivo ingresado es invalido.");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void escribirArchivo(){
        
        try{
            if (!openFile) {
                JOptionPane.showMessageDialog(this, "No hay archivo abierto.");
                return;
            }
            FileWriter writer = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(writer);

            String buffer = "";
            
            for (campo campoActual : campos) {
                buffer += campoActual.toStringFile();
            }
            int spaces = 500 - buffer.length();
            for (int i = 0; i < spaces; i++) {
                buffer += " ";
            }
            bw.write(buffer);
            bw.flush();
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
    }
    
    private void cargarArchivo(){
        try {
            if (openFile) {
                int input = JOptionPane.showConfirmDialog(this, "Desea guardar el archivo antes de cargar?");
                if (input == 0) {
                    
                }else if (input == 2){
                    return;
                }
            }
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
            jfc.setFileFilter(filter);
            jfc.showOpenDialog(null);
            file = jfc.getSelectedFile();
            openFile = true;
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            char[] line = new char[500];
            br.read(line, 0, 500);
            String linestr = new String(line);
            String[] camposstr = linestr.split(":");
            
            ArrayList<campo> tempCampos = new ArrayList();
            
            for (int i = 0; i < camposstr.length-1; i++) {
                String[] camposCampo = camposstr[i].split(";");
                String nombre = camposCampo[0];
                String tipo = camposCampo[1];
                int largo = Integer.parseInt(camposCampo[2]);
                boolean llave = camposCampo[3].equals("true");
                campo tempCampo = new campo(tipo, nombre, largo, llave);
                tempCampos.add(tempCampo);
            }
            campos = tempCampos;
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void jmi_nuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_nuevoArchivoActionPerformed
        nuevoArchivo();
        actualizarTabla();
    }//GEN-LAST:event_jmi_nuevoArchivoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jf_nuevoCampo.pack();
        jf_nuevoCampo.setLocationRelativeTo(this);
        jf_nuevoCampo.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jb_aceptarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_aceptarCampoActionPerformed
        String nombre = jtf_nombreCampo.getText();
        String tipo = (String)jcb_tipoCampo.getSelectedItem();
        int tamano = (int)js_tamanoCampo.getValue();
        boolean llave = jcb_llaveCampo.isSelected();
        if (!nombre.isEmpty()) {
            campo nuevoCampo = new campo(tipo, nombre, tamano, llave);
            campos.add(nuevoCampo);
            jtf_nombreCampo.setText("");
            jcb_tipoCampo.setSelectedItem("String");
            js_tamanoCampo.setValue(1);
            jcb_llaveCampo.setSelected(false);
            
            jf_nuevoCampo.setVisible(false);
            actualizarTabla();
            JOptionPane.showMessageDialog(this, "Campo agregado exitosamente");
        }else{
            JOptionPane.showMessageDialog(this, "El nombre esta vacío.");
        }
    }//GEN-LAST:event_jb_aceptarCampoActionPerformed

    private void jb_cancelarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarCampoActionPerformed
        jtf_nombreCampo.setText("");
        jcb_tipoCampo.setSelectedItem("String");
        js_tamanoCampo.setValue(1);
        jcb_llaveCampo.setSelected(false);

        jf_nuevoCampo.setVisible(false);
    }//GEN-LAST:event_jb_cancelarCampoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        cargarArchivo();
        actualizarTabla();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        escribirArchivo();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jb_aceptarCampo;
    private javax.swing.JButton jb_cancelarCampo;
    private javax.swing.JCheckBox jcb_llaveCampo;
    private javax.swing.JComboBox<String> jcb_tipoCampo;
    private javax.swing.JFrame jf_nuevoCampo;
    private javax.swing.JMenu jm_edit;
    private javax.swing.JMenu jm_file;
    private javax.swing.JMenuItem jmi_nuevoArchivo;
    private javax.swing.JSpinner js_tamanoCampo;
    private javax.swing.JTextField jtf_nombreCampo;
    // End of variables declaration//GEN-END:variables
}
