/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Excepciones.*;
import UML.Dueño;
import UML.Equipo;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
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
public class V_Equipo extends javax.swing.JFrame {

    private String dueño;
    private static String ope;
    private static Equipo equipo;
    private static ArrayList<Dueño> dueños;

    /**
     * Creates new form V_Equipo
     */
    public V_Equipo() {

        initComponents();

    }

    public void myInitComponents() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
        tfCodigoEquipo.setBorder(BorderFactory.createCompoundBorder(
                tfCodigoEquipo.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfNacionalidad.setBorder(BorderFactory.createCompoundBorder(
                tfNacionalidad.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfNombre.setBorder(BorderFactory.createCompoundBorder(
                tfNombre.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfPresupuesto.setBorder(BorderFactory.createCompoundBorder(
                tfPresupuesto.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfPuntuacion.setBorder(BorderFactory.createCompoundBorder(
                tfPuntuacion.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    /**
     * Creacion de la ventana equipo dependiendo de la operacion.
     *
     * @param operacion (requerido) tipo de operacion
     * @throws Exception hereda excepciones
     */
    public V_Equipo(String operacion) throws Exception {
        setUndecorated(true);
        initComponents();
        myInitComponents();
        ope = operacion;
        dueños = JEMS.getListaDueños();
        for (int i = 0; i < dueños.size(); i++) {
            cbDueño.insertItemAt(dueños.get(i).getNombre(), i);
        }
        switch (ope) {
            case "modificar":
                tfCodigoEquipo.setVisible(true);
                tfNombre.setEditable(false);
                tfPuntuacion.setEditable(false);
                tfNacionalidad.setEditable(false);
                tfPresupuesto.setEditable(false);
                cbDueño.setEnabled(false);
                bAceptar.setEnabled(false);
                break;
            case "baja":
                tfCodigoEquipo.setVisible(true);
                tfNombre.setEditable(false);
                tfPuntuacion.setEditable(false);
                tfNacionalidad.setEditable(false);
                tfPresupuesto.setEditable(false);
                cbDueño.setEnabled(false);
                bAceptar.setEnabled(false);
                break;
            case "alta":
                tfCodigoEquipo.setVisible(false);
                tfPuntuacion.setText(0 + "");
                tfPuntuacion.setEditable(false);
                bAceptar.setEnabled(true);
                break;
            case "consulta":
                tfCodigoEquipo.setVisible(true);
                tfNombre.setEditable(false);
                tfPuntuacion.setEditable(false);
                tfNacionalidad.setEditable(false);
                tfPresupuesto.setEditable(false);
                cbDueño.setEnabled(false);
                bAceptar.setEnabled(false);
                break;
        }
    }

    /**
     * Funcion para validar los datos del jugador
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
            validarNacionalidad();
            validarPresupuesto();
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
     * Funcion que trata de validar el nombre del equipo, si el nombre esta
     * vacio o es superior a 20 caracteres saltara la excepcion.
     *
     * @throws Exception hereda de la clase Exception
     */
    private void validarNombre() throws Exception {
        if (tfNombre.getText().isEmpty()) {
            throw new CampoVacio("El nombre del equipo es obligatorio*.");
        }

        //En la bdd tenemos el nombre como varchar 20
        //Consideramos que no deba ser mayor a 20
        //Tambien consideramos que todo se introduzca en mayusculas
        Pattern pat = Pattern.compile("([A-Z]){1,20}$");
        Matcher mat = pat.matcher(tfNombre.getText());
        if (!mat.matches()) {
            throw new DatoNoValido("El nombre del equipo tiene que ser en mayusculas y tener maximo 20 caracteres.");
        }

    }

    /**
     * Funcion que trata de validar la nacionalidad del dequipo, si la
     * nacionalidad esta vacia o es superior a 20 caracteres saltara la
     * excepcion.
     *
     * @throws Exception hereda de la clase Exception
     */
    private void validarNacionalidad() throws Exception {
        if (tfNacionalidad.getText().isEmpty()) {
            throw new CampoVacio("La nacionalidad del jugador es obligatoria*");
        }

        //En la bdd tenemos la nacionalidad como varchar 20
        //Consideramos que no deba ser mayor a 20
        //Tambien consideramos que todo se introduzca en mayusculas
        Pattern pat = Pattern.compile("([A-Z]){1,20}$");
        Matcher mat = pat.matcher(tfNacionalidad.getText());
        if (!mat.matches()) {
            throw new DatoNoValido("La nacionalidad tiene que ser en mayusculas y tener maximo 20 caracteres.");
        }
    }

    /**
     * Funcion que trata de validar el sueldo del equipo, si el sueldo esta
     * vacio o es superior a 6 digitos saltara la excepcion.
     *
     * @throws Exception hereda de la clase Exception
     */
    private void validarPresupuesto() throws Exception {
        if (tfPresupuesto.getText().isEmpty()) {
            throw new CampoVacio("El presupuesto es obligatorio*.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAceptar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        lbNombre = new javax.swing.JLabel();
        lbPresupuesto = new javax.swing.JLabel();
        lbPuntuacion = new javax.swing.JLabel();
        lbNacionalidad = new javax.swing.JLabel();
        lbDueño = new javax.swing.JLabel();
        lbCodigoEquipo = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        tfCodigoEquipo = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfPuntuacion = new javax.swing.JTextField();
        tfNacionalidad = new javax.swing.JTextField();
        tfPresupuesto = new javax.swing.JTextField();
        cbDueño = new javax.swing.JComboBox<>();
        bSalir = new javax.swing.JButton();
        lbBorde = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        lbRiot = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        lbBackgroundEquipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        getContentPane().add(bVolver);
        bVolver.setBounds(560, 630, 170, 30);

        lbNombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("Nombre");
        getContentPane().add(lbNombre);
        lbNombre.setBounds(350, 310, 150, 40);

        lbPresupuesto.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbPresupuesto.setForeground(new java.awt.Color(255, 255, 255));
        lbPresupuesto.setText("Presupuesto");
        getContentPane().add(lbPresupuesto);
        lbPresupuesto.setBounds(690, 310, 150, 40);

        lbPuntuacion.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbPuntuacion.setForeground(new java.awt.Color(255, 255, 255));
        lbPuntuacion.setText("Puntuación");
        getContentPane().add(lbPuntuacion);
        lbPuntuacion.setBounds(350, 400, 150, 40);

        lbNacionalidad.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        lbNacionalidad.setText("Nacionalidad");
        getContentPane().add(lbNacionalidad);
        lbNacionalidad.setBounds(690, 220, 150, 40);

        lbDueño.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbDueño.setForeground(new java.awt.Color(255, 255, 255));
        lbDueño.setText("Dueño");
        getContentPane().add(lbDueño);
        lbDueño.setBounds(690, 400, 150, 40);

        lbCodigoEquipo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbCodigoEquipo.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoEquipo.setText("Codigo Equipo");
        getContentPane().add(lbCodigoEquipo);
        lbCodigoEquipo.setBounds(350, 220, 150, 40);

        lbSubtitulo.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(86, 88, 149));
        lbSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtitulo.setText("EQUIPO");
        getContentPane().add(lbSubtitulo);
        lbSubtitulo.setBounds(550, 70, 220, 40);

        tfCodigoEquipo.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfCodigoEquipo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfCodigoEquipo.setBorder(null);
        tfCodigoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoEquipoActionPerformed(evt);
            }
        });
        getContentPane().add(tfCodigoEquipo);
        tfCodigoEquipo.setBounds(350, 260, 280, 30);

        tfNombre.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfNombre.setBorder(null);
        getContentPane().add(tfNombre);
        tfNombre.setBounds(350, 350, 280, 30);

        tfPuntuacion.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfPuntuacion.setBorder(null);
        getContentPane().add(tfPuntuacion);
        tfPuntuacion.setBounds(350, 440, 280, 30);

        tfNacionalidad.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfNacionalidad.setBorder(null);
        getContentPane().add(tfNacionalidad);
        tfNacionalidad.setBounds(690, 260, 280, 30);

        tfPresupuesto.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfPresupuesto.setBorder(null);
        getContentPane().add(tfPresupuesto);
        tfPresupuesto.setBounds(690, 350, 280, 30);

        cbDueño.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        cbDueño.setBorder(null);
        cbDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDueñoActionPerformed(evt);
            }
        });
        getContentPane().add(cbDueño);
        cbDueño.setBounds(690, 440, 280, 30);

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

        lbBorde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/blur.png"))); // NOI18N
        lbBorde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 88, 149), 1, true));
        getContentPane().add(lbBorde);
        lbBorde.setBounds(330, 210, 670, 280);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 680, 180, 30);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 670, 100, 50);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Yuumi.jpg"))); // NOI18N
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
     * Funcion para saber que opcion escojer dependiendo de la operacion al
     * pulsar aceptar.
     *
     * @param evt pulsar el boton
     */
    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        try {
            if (validarDatos()) {
                if (ope.compareToIgnoreCase("modificar") == 0) {
                    JEMS.modificarEquipo(Integer.parseInt(tfCodigoEquipo.getText()), tfNombre.getText(), tfNacionalidad.getText(), Integer.parseInt(tfPresupuesto.getText()), Integer.parseInt(tfPuntuacion.getText()), dueños.get(cbDueño.getSelectedIndex()).getCod_dueño());
                    ControladorVistas.abrirVentanaAviso("Equipo modificado con exito!");
                } else if (ope.compareToIgnoreCase("alta") == 0) {
                    JEMS.altaEquipo(tfNombre.getText(), tfNacionalidad.getText(), Integer.parseInt(tfPresupuesto.getText()), Integer.parseInt(tfPuntuacion.getText()), dueños.get(cbDueño.getSelectedIndex()).getCod_dueño());
                    ControladorVistas.abrirVentanaAviso("Equipo dado de alta con exito!");
                } else if (ope.compareToIgnoreCase("baja") == 0) {
                    JEMS.bajaEquipo(Integer.parseInt(tfCodigoEquipo.getText()));
                    ControladorVistas.abrirVentanaAviso("Equipo dado de baja con exito!");
                }
            }
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaEquipo();
    }//GEN-LAST:event_bVolverActionPerformed
    /**
     * Funcion para saber que pasa y con que operacion al pulsar enter en
     * codigo_equipo.
     *
     * @param evt pulsar enter
     */
    private void tfCodigoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoEquipoActionPerformed
        try {
            equipo = JEMS.buscarEquipo(Integer.parseInt(tfCodigoEquipo.getText()));
            switch (ope) {
                case "modificar":
                    tfNombre.setEditable(false);
                    tfPuntuacion.setEditable(true);
                    tfNacionalidad.setEditable(true);
                    tfPresupuesto.setEditable(true);
                    cbDueño.setEnabled(true);
                    bAceptar.setEnabled(true);
                    tfCodigoEquipo.setEditable(false);
                    tfCodigoEquipo.setText(String.valueOf(equipo.getCod_equipo()));
                    tfNombre.setText(equipo.getNombre());
                    tfPuntuacion.setText(String.valueOf(equipo.getPuntuacion()));
                    tfNacionalidad.setText(equipo.getNacionalidad());
                    tfPresupuesto.setText(String.valueOf(equipo.getPresupuesto()));
                    cbDueño.setSelectedItem(equipo.getDueño().getNombre());
                    break;
                case "baja":
                    tfNombre.setEditable(false);
                    tfPuntuacion.setEditable(false);
                    tfNacionalidad.setEditable(false);
                    tfPresupuesto.setEditable(false);
                    cbDueño.setEnabled(false);
                    bAceptar.setEnabled(true);
                    tfCodigoEquipo.setEditable(false);
                    tfCodigoEquipo.setText(String.valueOf(equipo.getCod_equipo()));
                    tfNombre.setText(equipo.getNombre());
                    tfPuntuacion.setText(String.valueOf(equipo.getPuntuacion()));
                    tfNacionalidad.setText(equipo.getNacionalidad());
                    tfPresupuesto.setText(String.valueOf(equipo.getPresupuesto()));
                    cbDueño.setSelectedItem(equipo.getDueño().getNombre());
                    break;
                case "consulta":
                    tfCodigoEquipo.setText(String.valueOf(equipo.getCod_equipo()));
                    tfNombre.setText(equipo.getNombre());
                    tfPuntuacion.setText(String.valueOf(equipo.getPuntuacion()));
                    tfNacionalidad.setText(equipo.getNacionalidad());
                    tfPresupuesto.setText(String.valueOf(equipo.getPresupuesto()));
                    cbDueño.setSelectedItem(equipo.getDueño().getNombre());
                    break;
            }
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
        }

    }//GEN-LAST:event_tfCodigoEquipoActionPerformed

    private void cbDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDueñoActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

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
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Equipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bVolver;
    private javax.swing.JComboBox<String> cbDueño;
    private javax.swing.JLabel lbBackgroundEquipo;
    private javax.swing.JLabel lbBorde;
    private javax.swing.JLabel lbCodigoEquipo;
    private javax.swing.JLabel lbDueño;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbNacionalidad;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPresupuesto;
    private javax.swing.JLabel lbPuntuacion;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JTextField tfCodigoEquipo;
    private javax.swing.JTextField tfNacionalidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPresupuesto;
    private javax.swing.JTextField tfPuntuacion;
    // End of variables declaration//GEN-END:variables
}
