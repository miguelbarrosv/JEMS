/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Excepciones.*;
import UML.Dueño;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import jems.JEMS;

/**
 *
 * @author Miguel Barros
 * @author Eric Muñoz
 * @author Sergio Zulueta
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class V_Dueño extends javax.swing.JFrame {

    /**
     * Creates new form V_Dueño
     */
    public V_Dueño() {
        setUndecorated(true);
        initComponents();
        myInitComponents();
    }

    public void myInitComponents() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
        tfApellido.setBorder(BorderFactory.createCompoundBorder(
                tfApellido.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfCodigoDueño.setBorder(BorderFactory.createCompoundBorder(
                tfCodigoDueño.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfNombre.setBorder(BorderFactory.createCompoundBorder(
                tfNombre.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfTelefono.setBorder(BorderFactory.createCompoundBorder(
                tfTelefono.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    /**
     * Funcion que al iniciar la ventana recoge el parametro operacion para
     * saber que tipo de operaciones y realizar los cambios necesarios
     *
     *
     * @param operacion (requerido) operacion a realizar
     */
    public V_Dueño(String operacion) {
        setUndecorated(true);
        initComponents();
        myInitComponents();
        ope = operacion;
        switch (ope) {
            case "modificar":
                tfNombre.setEditable(false);
                tfApellido.setEditable(false);
                tfTelefono.setEditable(false);
                bAceptar.setEnabled(false);
                break;
            case "baja":
                tfNombre.setEditable(false);
                tfApellido.setEditable(false);
                tfTelefono.setEditable(false);
                bAceptar.setEnabled(false);
                break;
            case "alta":
                tfCodigoDueño.setVisible(false);
                bAceptar.setEnabled(true);
                break;
            case "consulta":
                tfNombre.setEditable(false);
                tfApellido.setEditable(false);
                tfTelefono.setEditable(false);
                bAceptar.setEnabled(false);
                break;
        }
    }

    /**
     * Funcion para validar los datos del dueño
     *
     * @return True Si las validaciones son correctas
     * @return False Si las validaciones dan error
     */
    private boolean validarDatos() {

        /*
        Introducimos todas las funciones de validar para omprobarlas y llamar solo a validarDatos();
         */
        try {
            validarNombre();
            validarApellido();
            validarTelefono();
            return true;
            /*
            Catch con excepciones personalizadas
             */
        } catch (CampoVacio e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getMensaje());
            return false;
        } catch (DatoNoValido e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getMensaje());
            return false;
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            return false;
        }

    }

    /**
     * Funcion que trata de validar el nombre del dueño, si el nombre esta vacio
     * o es superior a 20 caracteres saltara la excepcion.
     *
     * @throws Exception hereda de la clase Exception
     */
    private void validarNombre() throws Exception {
        if (tfNombre.getText().isEmpty()) {
            throw new CampoVacio("El nombre del jugador es obligatorio*.");
        }

        //En la bdd tenemos el nombre como varchar 20
        //Consideramos que no deba ser mayor a 20 el nombre
        if (tfNombre.getText().length() > 20) {
            throw new DatoNoValido("El nombre no puede ser superior a 20 caracteres.");
        }

    }

    /**
     * Funcion que trata de validar el apellido del dueño, si el apellido esta
     * vacio o es superior a 20 caracteres saltara la excepcion.
     *
     * @throws Exception hereda de la clase Exception
     */
    private void validarApellido() throws Exception {
        if (tfApellido.getText().isEmpty()) {
            throw new CampoVacio("El apellido del jugador es obligatorio*");
        }

        //En la bdd tenemos el apellido como varchar 20
        //Consideramos que no deba ser mayor a 20
        if (tfApellido.getText().length() > 20) {
            throw new DatoNoValido("El apellido no puede ser superior a 20 caracteres.");
        }

    }

    /**
     * Funcion que trata de validar el telefono del dueño, si el telefono esta
     * vacio o es superior a 9 digitos saltara la excepcion, en la misma funcion
     * tenemos un pattern para que el numero de telefono empiece por 6, 7, ,8,
     * 9.
     *
     * @throws Exception hereda de la clase Exception
     */
    private void validarTelefono() throws Exception {
        if (tfTelefono.getText().isEmpty()) {
            throw new CampoVacio("El telefono del jugador es obligatorio");
        }

        //En la bdd tenemos el telefono como varchar 9
        //Consideramos que no deba ser mayor a 9
        if (tfTelefono.getText().length() != 9) {
            throw new DatoNoValido("El telefono tiene que tener 9 digitos");
        }

        Pattern pat = Pattern.compile("^[6-9][0-9]{8}$");
        Matcher mat = pat.matcher(tfTelefono.getText());
        if (!mat.matches()) {
            throw new DatoNoValido("El numero de telefono solo puede empezar por 6, 7, 8 o 9.");
        }
    }

    private static String ope;
    private static Dueño dueño;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSubtitulo = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        lbCodigoDueño = new javax.swing.JLabel();
        tfCodigoDueño = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbApellido = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbBorde = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        lbRiot = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        lbBackgroundEquipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbSubtitulo.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(86, 88, 149));
        lbSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtitulo.setText("DUEÑO");
        getContentPane().add(lbSubtitulo);
        lbSubtitulo.setBounds(520, 70, 260, 60);

        bAceptar.setBackground(new java.awt.Color(252, 124, 0));
        bAceptar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bAceptar.setForeground(new java.awt.Color(255, 255, 255));
        bAceptar.setText("ACEPTAR");
        bAceptar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bAceptar.setBorderPainted(false);
        bAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAceptar.setFocusPainted(false);
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(bAceptar);
        bAceptar.setBounds(500, 540, 280, 50);

        bVolver.setBackground(new java.awt.Color(86, 88, 149));
        bVolver.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bVolver.setForeground(new java.awt.Color(255, 255, 255));
        bVolver.setText("VOLVER");
        bVolver.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bVolver.setBorderPainted(false);
        bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolver.setFocusPainted(false);
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        getContentPane().add(bVolver);
        bVolver.setBounds(560, 630, 170, 30);

        lbCodigoDueño.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbCodigoDueño.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoDueño.setText("Codigo Dueño");
        getContentPane().add(lbCodigoDueño);
        lbCodigoDueño.setBounds(500, 210, 150, 40);

        tfCodigoDueño.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfCodigoDueño.setForeground(new java.awt.Color(0, 0, 0));
        tfCodigoDueño.setBorder(null);
        tfCodigoDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoDueñoActionPerformed(evt);
            }
        });
        getContentPane().add(tfCodigoDueño);
        tfCodigoDueño.setBounds(500, 250, 280, 30);

        lbNombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("Nombre");
        getContentPane().add(lbNombre);
        lbNombre.setBounds(500, 280, 150, 40);

        tfNombre.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(0, 0, 0));
        tfNombre.setBorder(null);
        getContentPane().add(tfNombre);
        tfNombre.setBounds(500, 320, 280, 30);

        lbApellido.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbApellido.setForeground(new java.awt.Color(255, 255, 255));
        lbApellido.setText("Apellido");
        getContentPane().add(lbApellido);
        lbApellido.setBounds(500, 350, 150, 40);

        tfApellido.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfApellido.setForeground(new java.awt.Color(0, 0, 0));
        tfApellido.setBorder(null);
        getContentPane().add(tfApellido);
        tfApellido.setBounds(500, 390, 280, 30);

        tfTelefono.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfTelefono.setForeground(new java.awt.Color(0, 0, 0));
        tfTelefono.setBorder(null);
        getContentPane().add(tfTelefono);
        tfTelefono.setBounds(500, 460, 280, 30);

        lbTelefono.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lbTelefono.setText("Telefono ");
        getContentPane().add(lbTelefono);
        lbTelefono.setBounds(500, 420, 150, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/error.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1230, 10, 40, 40);

        lbBorde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/blur.png"))); // NOI18N
        lbBorde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 88, 149), 1, true));
        getContentPane().add(lbBorde);
        lbBorde.setBounds(470, 200, 340, 310);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 680, 180, 30);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 670, 100, 50);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Blitzcrank.jpg"))); // NOI18N
        getContentPane().add(lbFiller);
        lbFiller.setBounds(0, 0, 1280, 720);

        lbBackgroundEquipo.setBackground(new java.awt.Color(13, 9, 32));
        lbBackgroundEquipo.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundEquipo);
        lbBackgroundEquipo.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Funcion para ver que pasa al accionar el boton aceptar en diferentes
     * operaciones.
     *
     * @param evt accionar el boton
     */
    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        try {
            if (validarDatos()) {
                switch (ope) {
                    case "modificar":
                        JEMS.modificarDueño(tfNombre.getText(), tfApellido.getText(), tfTelefono.getText());
                        ControladorVistas.abrirVentanaAviso("Dueño modificado con exito!");
                        break;
                    case "alta":
                        JEMS.altaDueño(tfNombre.getText(), tfApellido.getText(), tfTelefono.getText());
                        ControladorVistas.abrirVentanaAviso("Dueño dado de alta con exito!");
                        break;
                    case "baja":
                        JEMS.bajaDueño(Integer.parseInt(tfCodigoDueño.getText()));
                        ControladorVistas.abrirVentanaAviso("Dueño dado de baja con exito!");
                        break;
                }
            }
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
        }
    }//GEN-LAST:event_bAceptarActionPerformed
    /**
     * Funcion que al insertar el codigo dueño nos vamos a buscar los datos del
     * dueño introducido para despues mostrar al cliente los datos de este
     *
     *
     * @param evt pulsar enter
     */
    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaDueño();
    }//GEN-LAST:event_bVolverActionPerformed
    /**
     * Funcion que al insertar el codigo dueño nos vamos a buscar los datos del
     * dueño introducido para despues mostrar al cliente los datos de este
     *
     *
     * @param evt pulsar enter
     */
    private void tfCodigoDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoDueñoActionPerformed
        try {
            dueño = JEMS.consultarDueño(Integer.parseInt(tfCodigoDueño.getText()));
            switch (ope) {
                case "modificar":
                    tfNombre.setEditable(true);
                    tfApellido.setEditable(true);
                    tfTelefono.setEditable(true);
                    bAceptar.setEnabled(true);
                    tfNombre.setText(dueño.getNombre());
                    tfApellido.setText(dueño.getApellido());
                    tfTelefono.setText(dueño.getTelefono());
                    tfCodigoDueño.setEditable(false);
                    break;
                case "baja":
                    tfNombre.setEditable(false);
                    tfApellido.setEditable(false);
                    tfTelefono.setEditable(false);
                    bAceptar.setEnabled(true);
                    tfCodigoDueño.setEditable(false);
                    tfNombre.setText(dueño.getNombre());
                    tfApellido.setText(dueño.getApellido());
                    tfTelefono.setText(dueño.getTelefono());
                    break;
                case "consulta":
                    tfNombre.setEditable(false);
                    tfApellido.setEditable(false);
                    tfTelefono.setEditable(false);
                    tfCodigoDueño.setEditable(false);
                    tfNombre.setText(dueño.getNombre());
                    tfApellido.setText(dueño.getApellido());
                    tfTelefono.setText(dueño.getTelefono());
                    break;
            }
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
        }
    }//GEN-LAST:event_tfCodigoDueñoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(V_Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Dueño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbBackgroundEquipo;
    private javax.swing.JLabel lbBorde;
    private javax.swing.JLabel lbCodigoDueño;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCodigoDueño;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
