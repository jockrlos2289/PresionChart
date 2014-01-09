/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presionchart;

import BaseDeDatos.GestorBD;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author JoseCarlos
 */
public class EdicionMedicones extends javax.swing.JDialog {

    public static int idPersona = 0;
    public static String nombre = "Desconocido";
    public static String rutaDB;
    private GestorBD baseDeDatos;
    public int indiceMedicion;
    private Date dia;
    private static DecimalFormat deci = new DecimalFormat("0");
    ArrayList<Integer> indices = new ArrayList<>();

    /**
     * Creates new form EdicionMedicones
     */
    public EdicionMedicones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        baseDeDatos = new GestorBD(Interfaz.rutaDB);
        baseDeDatos.conectar();
        idPersona = Interfaz.idPersona;
        dia = new Date();
        tBoxFecha.setDate(dia);
        tBoxFecha.setEnabled(false);
        tBoxFecha.getCalendarButton().setEnabled(true);
        poblarComboBox();

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tBoxPresion = new javax.swing.JTextField();
        tBoxFecha = new com.toedter.calendar.JDateChooser();
        botonActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        comboMediciones = new javax.swing.JComboBox();
        botonSeleccionar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edicion de Mediciones");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Edicion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 11))); // NOI18N
        jPanel2.setLayout(null);

        tBoxPresion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tBoxPresionKeyTyped(evt);
            }
        });
        jPanel2.add(tBoxPresion);
        tBoxPresion.setBounds(10, 40, 150, 30);
        jPanel2.add(tBoxFecha);
        tBoxFecha.setBounds(10, 90, 150, 30);

        botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        botonActualizar.setText("Editar");
        botonActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(botonActualizar);
        botonActualizar.setBounds(200, 30, 140, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel1.setText("Fecha");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 70, 150, 15);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel2.setText("Toma:Sistolico/Diastolico");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 20, 150, 15);

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(botonEliminar);
        botonEliminar.setBounds(200, 80, 140, 40);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 360, 150));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione la Medicion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 11))); // NOI18N

        comboMediciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/select.png"))); // NOI18N
        botonSeleccionar.setText("Seleccionar");
        botonSeleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboMediciones, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(botonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMediciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html>Sistema de Monitoreo<BR>&nbsp;&nbsp;de Presion Arterial</html>");
        jLabel7.setAutoscrolls(true);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 61));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modulo de Edicion de Mediciones");
        jLabel8.setAutoscrolls(true);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 34));

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tBoxPresionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tBoxPresionKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tBoxPresionKeyTyped

    private void poblarComboBox() {
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        ResultSet datos = baseDeDatos.ejecutarQuery("Select * from Mediciones where idPersona = " + String.valueOf(idPersona));
        indices.clear();


        try {
            while (datos.next()) {
                modeloCombo.addElement(FechasParser.parseString2(datos.getString("Fecha")) + " " + deci.format(datos.getObject("Sistolico")) + "/" + deci.format(datos.getObject("Diastolico")));//+ "_" + datos.getString("id"));
                indices.add(datos.getInt("id"));
            }
            datos.close();
            comboMediciones.setModel(modeloCombo);
        } catch (Exception f) {
            JOptionPane.showMessageDialog(rootPane, f.toString() + "\nError en la carga de Datos");
        }


//        String gh = "";
//        for (int i = 0; i < indices.size(); i++) {
//            gh += "indices.get(" + String.valueOf(i) + ") = " + String.valueOf(indices.get(i)) + "\n";
//
//        }
    }

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        // TODO add your handling code here:
        float sis, dias;
        String fecha;
        //int estado;
        Medicion med;
        String presion[];
        //int idMedicion = 0; // lo tomo del arraylist delos indices

        if (!tBoxPresion.getText().equals("") && tBoxFecha.getDate() != null) {

            Pattern pat = Pattern.compile("\\d{2,3}/\\d{2,3}");
            Matcher mat = pat.matcher(tBoxPresion.getText().trim());
            if (mat.matches()) {

                presion = tBoxPresion.getText().split("/");

                sis = Float.parseFloat(presion[0]);
                dias = Float.parseFloat(presion[1]);
                fecha = FechasParser.parseString(tBoxFecha.getDate());
                //estado = Interfaz.determinarEstado(sis, dias);
                med = new Medicion(idPersona, fecha, sis, dias);

                if (baseDeDatos.actualizarMedicion(indiceMedicion, med)) {
                    JOptionPane.showMessageDialog(rootPane, "Actualizacion Exitosa");
                    poblarComboBox();
                    tBoxFecha.setDate(dia);
                    tBoxPresion.setText(" ");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No Se pudo Actualizar.");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Formato de Datos Incorrecto.\nEl formato correcto es: Sistolico/Diastolico.\n ### / ###.\n [0-200] / [0-200].");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Debe Completar todos los campos.");
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        if (0 == JOptionPane.showConfirmDialog(rootPane, "Desea eliminar esta medición?", "SiMPresAr", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
            if (baseDeDatos.eliminarMedicion(indiceMedicion)) {
                JOptionPane.showMessageDialog(rootPane, "Eliminacion Exitosa");
                poblarComboBox();
                tBoxFecha.setDate(dia);
                tBoxPresion.setText(" ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "No Se pudo Actualizar.");
            }
        }

        // TODO add your handling code here:
        //JOption pane para pregusntar si se desea eliminar el registro
        //luego de eliminar, actulizar el combobox y borrar los cuadros de texto
        //y tambien mandar mensaje de exito
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        // String presion[];
        String datos[];
        int indexId;

        indexId = comboMediciones.getSelectedIndex();
        datos = comboMediciones.getSelectedItem().toString().split(" ");
        // presion = datos[1].split("/");

        indiceMedicion = indices.get(indexId);
        tBoxPresion.setText(datos[1]);
        tBoxFecha.setDate(FechasParser.parseDate2(datos[0]));


//        JOptionPane.showMessageDialog(rootPane, String.valueOf(indiceMedicion));
//        JOptionPane.showMessageDialog(rootPane, String.valueOf(datos[0]));
//        JOptionPane.showMessageDialog(rootPane, String.valueOf(presion[0]));
//        JOptionPane.showMessageDialog(rootPane, String.valueOf(presion[1]));

    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        //        SeleccionPaciente h = new SeleccionPaciente((Frame) this.getParent(), rootPaneCheckingEnabled);
        this.setVisible(false);
        // h.setVisible(true);

    }//GEN-LAST:event_botonCancelarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EdicionMedicones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicionMedicones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicionMedicones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicionMedicones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EdicionMedicones dialog = new EdicionMedicones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JComboBox comboMediciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser tBoxFecha;
    private javax.swing.JTextField tBoxPresion;
    // End of variables declaration//GEN-END:variables
}