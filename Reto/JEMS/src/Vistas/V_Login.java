/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.BorderFactory;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import jems.JEMS;

/**
 *
 * @author Joel Encinas
 * @author Sergio Zulueta
 *
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class V_Login extends javax.swing.JFrame {

    /**
     * Creates new form VLogin
     */
    public V_Login() {
        setUndecorated(true);
        initComponents();
        myInitComponents();

    }

    public void myInitComponents() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
        tfUsuario.setBorder(BorderFactory.createCompoundBorder(
                tfUsuario.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        pfContraseña.setBorder(BorderFactory.createCompoundBorder(
                pfContraseña.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    public boolean validarDatos() {
        if (validarNombre(tfUsuario.getText()) && validarContraseña(convertirContraseña(pfContraseña.getPassword()))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarNombre(String nombre) {
        return true;
    }

    public boolean validarContraseña(String contraseña) {
        return true;
    }

    public String convertirContraseña(char[] contraseña) {
        String contraseñaConvertida = new String(contraseña);
        return contraseñaConvertida;
    }

    public int comprobarDatos() throws Exception {
        // Login usuario = 1 | Login admin = 2
        int comp = 0;
        if (JEMS.conseguirDatosUsuarios(tfUsuario.getText(), convertirContraseña(pfContraseña.getPassword())) || JEMS.conseguirDatosAdministrador(tfUsuario.getText(), convertirContraseña(pfContraseña.getPassword()))) {
            if (JEMS.conseguirDatosAdministrador(tfUsuario.getText(), convertirContraseña(pfContraseña.getPassword()))) {
                comp = 2;
            } else {
                comp = 1;
            }
        } else {
            tfUsuario.setForeground(Color.red);
            pfContraseña.setForeground(Color.red);
            comp = 0;
        }
        return comp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbRiot = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        bAcceder = new javax.swing.JButton();
        lbTituloJems = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        lbContraseña = new javax.swing.JLabel();
        pfContraseña = new javax.swing.JPasswordField();
        bCrearCuenta = new javax.swing.JButton();
        lbVersion = new javax.swing.JLabel();
        lbBackgroundSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 670, 100, 50);

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_fullsize.jpg"))); // NOI18N
        getContentPane().add(lbBackground);
        lbBackground.setBounds(0, 0, 880, 720);

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

        bAcceder.setBackground(new java.awt.Color(252, 124, 0));
        bAcceder.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bAcceder.setForeground(new java.awt.Color(255, 255, 255));
        bAcceder.setText("ACCEDER");
        bAcceder.setToolTipText("");
        bAcceder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bAcceder.setBorderPainted(false);
        bAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAcceder.setFocusPainted(false);
        bAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAccederActionPerformed(evt);
            }
        });
        getContentPane().add(bAcceder);
        bAcceder.setBounds(940, 550, 280, 50);

        lbTituloJems.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        lbTituloJems.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloJems.setText("JEMS E-SPORTS");
        getContentPane().add(lbTituloJems);
        lbTituloJems.setBounds(940, 110, 300, 60);

        lbUsuario.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setText("Usuario");
        getContentPane().add(lbUsuario);
        lbUsuario.setBounds(940, 310, 220, 40);

        lbSubtitulo.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(86, 88, 149));
        lbSubtitulo.setText("INICIO DE SESION");
        getContentPane().add(lbSubtitulo);
        lbSubtitulo.setBounds(930, 240, 220, 40);

        tfUsuario.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(0, 0, 0));
        tfUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfUsuario.setBorder(null);
        getContentPane().add(tfUsuario);
        tfUsuario.setBounds(940, 350, 280, 30);

        lbContraseña.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lbContraseña.setText("Contraseña");
        getContentPane().add(lbContraseña);
        lbContraseña.setBounds(940, 400, 220, 40);

        pfContraseña.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        pfContraseña.setForeground(new java.awt.Color(0, 0, 0));
        pfContraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pfContraseña.setBorder(null);
        pfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(pfContraseña);
        pfContraseña.setBounds(940, 440, 280, 30);

        bCrearCuenta.setBackground(new java.awt.Color(13, 9, 32));
        bCrearCuenta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        bCrearCuenta.setForeground(new java.awt.Color(51, 153, 255));
        bCrearCuenta.setText("Crear una cuenta →");
        bCrearCuenta.setBorder(null);
        bCrearCuenta.setContentAreaFilled(false);
        bCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCrearCuenta.setFocusPainted(false);
        bCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(bCrearCuenta);
        bCrearCuenta.setBounds(930, 600, 150, 35);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 680, 180, 30);

        lbBackgroundSesion.setBackground(new java.awt.Color(13, 9, 32));
        lbBackgroundSesion.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundSesion);
        lbBackgroundSesion.setBounds(880, 0, 400, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAccederActionPerformed
        if (validarDatos()) {
            try {
                int comp;
                comp = comprobarDatos();

                switch (comp) {
                    case 0:
                        break;
                    case 1:
                        ControladorVistas.cerrarVentanaLogin();
                        ControladorVistas.mostrarVentanaUsuario();
                        break;
                    case 2:
                        ControladorVistas.cerrarVentanaLogin();
                        ControladorVistas.mostrarVentanaAdmin();
                        break;
                }
            } catch (Exception ex) {
                Logger.getLogger(V_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bAccederActionPerformed

    private void bCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearCuentaActionPerformed
        ControladorVistas.cerrarVentanaLogin();
        ControladorVistas.mostrarVentanaRegistrar();
    }//GEN-LAST:event_bCrearCuentaActionPerformed

    private void pfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfContraseñaActionPerformed
        bAcceder.doClick();
    }//GEN-LAST:event_pfContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Login().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAcceder;
    private javax.swing.JButton bCrearCuenta;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBackgroundSesion;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTituloJems;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JPasswordField pfContraseña;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
