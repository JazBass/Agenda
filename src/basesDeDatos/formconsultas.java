/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package basesDeDatos;
import java.sql.*;
/**
 *
 * @author JazBass
 */
public class formconsultas extends javax.swing.JFrame {

    public controlbd miagenda;
    public formconsultas() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtPoblacion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnConsulta = new javax.swing.JButton();
        btbCerrar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCampo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre y Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel3.setText("DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel4.setText("Dirección");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel5.setText("Población");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel6.setText("Télefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel7.setText("Correo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel8.setText("Edad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel9.setText("Provincia");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 70, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, -1));
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 110, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 330, -1));
        getContentPane().add(txtPoblacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 100, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 150, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 150, -1));
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 80, -1));
        getContentPane().add(txtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 150, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 400, 10));

        btnConsulta.setText("Hacer consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        btbCerrar.setText("Cerrar");
        btbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 190, -1));

        jLabel10.setText("Escriba valor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel11.setText("Elija campo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nombre", "apellidos", "dni", "direccion", "telefono", "correo", "edad", "provincia", "poblacion" }));
        getContentPane().add(txtCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        try {
            ResultSet r;//Para almacenar resultados de consulta
            r=miagenda.consulta((String)txtCampo.getSelectedItem(), txtValor.getText());
            //En caso de consulta exitosa, mostramos valores en pantalla
            if (r.next()) {
                txtNombre.setText(r.getString("nombre"));
                txtApellido.setText(r.getString("apellidos"));
                txtDNI.setText(r.getString("dni"));
                txtDireccion.setText(r.getString("direccion"));
                txtTelefono.setText(r.getString("telefono"));
                txtCorreo.setText(r.getString("correo"));
                txtEdad.setText(String.valueOf(r.getInt("edad")));
                txtProvincia.setText(r.getString("provincia"));
                txtPoblacion.setText(r.getString("poblacion"));
            }
            //Si la consulta no encuentró ningun resgistro
            else{
                Mensaje CuadroMensaje=new Mensaje("Dato no encontrado");
                CuadroMensaje.setModal(true);
                CuadroMensaje.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btbCerrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbCerrar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JComboBox<String> txtCampo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
