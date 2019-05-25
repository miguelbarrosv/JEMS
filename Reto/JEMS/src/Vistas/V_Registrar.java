/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import jems.JEMS;

/**
 * Ventana para registrarse.
 *
 * @author Joel Encinas
 * @author Eric Muñoz
 * @author Sergio Zulueta
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class V_Registrar extends javax.swing.JFrame {

    /**
     * Creacion de registrar.
     *
     */
    public V_Registrar() {
        setUndecorated(true);
        initComponents();
        myInitComponents();
    }

    /**
     * Formato de la ventana.
     *
     */
    public void myInitComponents() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
        tfUsuarioRegistrase.setBorder(BorderFactory.createCompoundBorder(
                tfUsuarioRegistrase.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        pfContraseñaRegistrase.setBorder(BorderFactory.createCompoundBorder(
                pfContraseñaRegistrase.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        pfContraseñaRepetidaRegistrase.setBorder(BorderFactory.createCompoundBorder(
                pfContraseñaRepetidaRegistrase.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    /**
     * validacion de los datos.
     *
     * @return si los datos don correctos o no
     */
    public boolean validarDatos() {
        return validarUsuario(tfUsuarioRegistrase.getText()) && validarContraseña(convertirContraseña(pfContraseñaRegistrase.getPassword()))
                && validarContraseñaRepetida(convertirContraseña(pfContraseñaRepetidaRegistrase.getPassword())) && cbTerminos.isSelected();
    }

    /**
     * Validar el usuario es correcto.
     *
     * @param usuario (requerido) usuario
     * @return si es correcto o no
     */
    public boolean validarUsuario(String usuario) {
        return true;
    }

    /**
     * Validar si la contraseña es correcta.
     *
     * @param contraseña (requerido) contraseña
     * @return si es correcto o no
     */
    public boolean validarContraseña(String contraseña) {
        return true;
    }

    /**
     * Validar si la Contraseña repetida es la correcta.
     *
     * @param contraseña (requerido) contraseña
     * @return si es correcto o no
     */
    public boolean validarContraseñaRepetida(String contraseña) {
        return true;
    }

    /**
     * Convertir los caracteres de la contraseña en una palabra.
     *
     * @param contraseña (requerido) contraseña
     * @return si es correcto o no
     */
    public String convertirContraseña(char[] contraseña) {
        String contraseñaConvertida = new String(contraseña);
        return contraseñaConvertida;
    }

    /**
     * Comprovar si el usuario y la contraseña ya estan eleguidos y si las
     * contraseñas son iguales.
     *
     * @return si esta todo correcto o no
     * @throws Exception hereda Excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public boolean comprobarDatos() throws Exception, SQLException {
        boolean flag = true;
        try {
            if (JEMS.conseguirDatosUsuariosReg(lbUsuarioRegistrase.getText())) {
                tfUsuarioRegistrase.setForeground(Color.red);
                flag = false;
                // mensaje de que el usuario ya esta cogido
            }

            if (convertirContraseña(pfContraseñaRegistrase.getPassword()).compareToIgnoreCase(convertirContraseña(pfContraseñaRepetidaRegistrase.getPassword())) != 0) {
                pfContraseñaRegistrase.setForeground(Color.red);
                pfContraseñaRepetidaRegistrase.setForeground(Color.red);
                flag = false;
                // mensaje de que la contraseña no es la misma en ambos campos
            }
        } catch (SQLException ex) {
            ControladorVistas.abrirVentanaAviso("Error: " + ex.getMessage());
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getMessage());
        }
        return flag;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBackgroundRegistrarse = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        lbUsuarioRegistrase = new javax.swing.JLabel();
        tfUsuarioRegistrase = new javax.swing.JTextField();
        lbContraseñaRegistrase = new javax.swing.JLabel();
        pfContraseñaRegistrase = new javax.swing.JPasswordField();
        pfContraseñaRepetidaRegistrase = new javax.swing.JPasswordField();
        lbContraseñaRepetidaRegistrase = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();
        bRegistrarse = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        cbTerminos = new javax.swing.JCheckBox();
        lbBorde = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        lbRiot = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        lbFiller2 = new javax.swing.JLabel();
        lbBackgroundRegistro = new javax.swing.JLabel();

        lbBackgroundRegistrarse.setBackground(new java.awt.Color(13, 9, 32));
        lbBackgroundRegistrarse.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbSubtitulo.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(86, 88, 149));
        lbSubtitulo.setText("REGISTRARSE");
        getContentPane().add(lbSubtitulo);
        lbSubtitulo.setBounds(470, 100, 350, 80);

        lbUsuarioRegistrase.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbUsuarioRegistrase.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuarioRegistrase.setText("Usuario");
        getContentPane().add(lbUsuarioRegistrase);
        lbUsuarioRegistrase.setBounds(500, 220, 70, 40);

        tfUsuarioRegistrase.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfUsuarioRegistrase.setForeground(new java.awt.Color(0, 0, 0));
        tfUsuarioRegistrase.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfUsuarioRegistrase.setBorder(null);
        getContentPane().add(tfUsuarioRegistrase);
        tfUsuarioRegistrase.setBounds(500, 260, 280, 30);

        lbContraseñaRegistrase.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbContraseñaRegistrase.setForeground(new java.awt.Color(255, 255, 255));
        lbContraseñaRegistrase.setText("Contraseña");
        getContentPane().add(lbContraseñaRegistrase);
        lbContraseñaRegistrase.setBounds(500, 310, 100, 40);

        pfContraseñaRegistrase.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        pfContraseñaRegistrase.setForeground(new java.awt.Color(0, 0, 0));
        pfContraseñaRegistrase.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pfContraseñaRegistrase.setBorder(null);
        getContentPane().add(pfContraseñaRegistrase);
        pfContraseñaRegistrase.setBounds(500, 350, 280, 30);

        pfContraseñaRepetidaRegistrase.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        pfContraseñaRepetidaRegistrase.setForeground(new java.awt.Color(0, 0, 0));
        pfContraseñaRepetidaRegistrase.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pfContraseñaRepetidaRegistrase.setBorder(null);
        getContentPane().add(pfContraseñaRepetidaRegistrase);
        pfContraseñaRepetidaRegistrase.setBounds(500, 440, 280, 30);

        lbContraseñaRepetidaRegistrase.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbContraseñaRepetidaRegistrase.setForeground(new java.awt.Color(255, 255, 255));
        lbContraseñaRepetidaRegistrase.setText("Repetir Contraseña");
        getContentPane().add(lbContraseñaRepetidaRegistrase);
        lbContraseñaRepetidaRegistrase.setBounds(500, 400, 160, 40);

        bVolver.setBackground(new java.awt.Color(86, 88, 149));
        bVolver.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bVolver.setForeground(new java.awt.Color(255, 255, 255));
        bVolver.setText("VOLVER");
        bVolver.setToolTipText("");
        bVolver.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bVolver.setBorderPainted(false);
        bVolver.setContentAreaFilled(false);
        bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolver.setFocusPainted(false);
        bVolver.setOpaque(true);
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        getContentPane().add(bVolver);
        bVolver.setBounds(560, 630, 170, 30);

        bRegistrarse.setBackground(new java.awt.Color(252, 124, 0));
        bRegistrarse.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        bRegistrarse.setText("REGISTRARSE");
        bRegistrarse.setToolTipText("");
        bRegistrarse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bRegistrarse.setBorderPainted(false);
        bRegistrarse.setContentAreaFilled(false);
        bRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRegistrarse.setFocusPainted(false);
        bRegistrarse.setOpaque(true);
        bRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(bRegistrarse);
        bRegistrarse.setBounds(500, 540, 280, 50);

        bSalir.setBackground(new java.awt.Color(255, 255, 255));
        bSalir.setForeground(new java.awt.Color(255, 255, 255));
        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/error.png"))); // NOI18N
        bSalir.setBorderPainted(false);
        bSalir.setContentAreaFilled(false);
        bSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSalir.setFocusPainted(false);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir);
        bSalir.setBounds(1230, 10, 40, 40);

        cbTerminos.setBackground(new java.awt.Color(13, 9, 32));
        cbTerminos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbTerminos.setForeground(new java.awt.Color(51, 153, 255));
        cbTerminos.setText("Acepto los Terminos y Condiciones");
        cbTerminos.setBorder(null);
        cbTerminos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTerminos.setFocusPainted(false);
        getContentPane().add(cbTerminos);
        cbTerminos.setBounds(510, 490, 260, 20);

        lbBorde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/blur.png"))); // NOI18N
        lbBorde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 88, 149), 1, true));
        getContentPane().add(lbBorde);
        lbBorde.setBounds(480, 210, 320, 310);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 680, 180, 30);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 670, 100, 50);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/constellation2.png"))); // NOI18N
        getContentPane().add(lbFiller);
        lbFiller.setBounds(740, 0, 540, 720);

        lbFiller2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/constellation1.png"))); // NOI18N
        getContentPane().add(lbFiller2);
        lbFiller2.setBounds(30, 0, 500, 720);

        lbBackgroundRegistro.setBackground(new java.awt.Color(13, 9, 32));
        lbBackgroundRegistro.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundRegistro);
        lbBackgroundRegistro.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Salir del programa.
     *
     * @param evt accion de clickar
     */
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed
    /**
     * Volver a la ventana login.
     *
     * @param evt accion de clickar
     */
    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaRegistrar();
        ControladorVistas.mostrarVentanaLogin();
    }//GEN-LAST:event_bVolverActionPerformed
    /**
     * boton para Registrarse.
     *
     * @param evt accion de clickar
     */
    private void bRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarseActionPerformed
        if (validarDatos()) {
            try {
                if (comprobarDatos()) {
                    JEMS.altaUsuario(tfUsuarioRegistrase.getText(), convertirContraseña(pfContraseñaRegistrase.getPassword()));
                    JOptionPane.showMessageDialog(this, "Usuario creado con exito");
                    ControladorVistas.cerrarVentanaRegistrar();
                    ControladorVistas.mostrarVentanaLogin();
                }
            } catch (SQLException ex) {
                ControladorVistas.abrirVentanaAviso("Error: " + ex.getMessage());
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_bRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(V_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegistrarse;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bVolver;
    private javax.swing.JCheckBox cbTerminos;
    private javax.swing.JLabel lbBackgroundRegistrarse;
    private javax.swing.JLabel lbBackgroundRegistro;
    private javax.swing.JLabel lbBorde;
    private javax.swing.JLabel lbContraseñaRegistrase;
    private javax.swing.JLabel lbContraseñaRepetidaRegistrase;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbFiller2;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbUsuarioRegistrase;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JPasswordField pfContraseñaRegistrase;
    private javax.swing.JPasswordField pfContraseñaRepetidaRegistrase;
    private javax.swing.JTextField tfUsuarioRegistrase;
    // End of variables declaration//GEN-END:variables
}
