/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Excepciones.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import UML.*;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import jems.JEMS;

/**
 *
 * @author Miguel Barros
 * @author Sergio Zulueta
 * @autor Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class V_Jugador extends javax.swing.JFrame {

    private static ArrayList<Equipo> equipos;

    /**
     * Creates new form V_Jugador
     */
    public V_Jugador() {

        initComponents();

    }

    public void myInitComponents() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
        tfApellido.setBorder(BorderFactory.createCompoundBorder(
                tfApellido.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfCodigoJugador.setBorder(BorderFactory.createCompoundBorder(
                tfCodigoJugador.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfNombre.setBorder(BorderFactory.createCompoundBorder(
                tfNombre.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfTelefono.setBorder(BorderFactory.createCompoundBorder(
                tfTelefono.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfSueldo.setBorder(BorderFactory.createCompoundBorder(
                tfSueldo.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfNacionalidad.setBorder(BorderFactory.createCompoundBorder(
                tfNacionalidad.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfNickname.setBorder(BorderFactory.createCompoundBorder(
                tfNickname.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    /**
     * Constructor para crear la vantana v_Jugador dependiendo de la operacion.
     *
     * @param operacion tipo de operacion
     */
    public V_Jugador(String operacion) throws Exception {
        setUndecorated(true);
        initComponents();
        myInitComponents();
        equipos = JEMS.getListaEquipos();
        for (int i = 0; i < equipos.size(); i++) {
            cbEquipo.insertItemAt(equipos.get(i).getNombre(), i);
        }
        ope = operacion;
        switch (ope) {
            case "modificar":
                tfCodigoJugador.setVisible(true);
                tfNombre.setEditable(false);
                tfApellido.setEditable(false);
                tfNickname.setEditable(false);
                tfNacionalidad.setEditable(false);
                tfSueldo.setEditable(false);
                tfTelefono.setEditable(false);
                rbOcupado.setEnabled(false);
                rbVacante.setEnabled(false);
                cbEquipo.setEnabled(false);
                bAceptar.setEnabled(false);
                break;
            case "baja":
                tfCodigoJugador.setVisible(true);
                tfNombre.setEditable(false);
                tfApellido.setEditable(false);
                tfNickname.setEditable(false);
                tfNacionalidad.setEditable(false);
                tfSueldo.setEditable(false);
                tfTelefono.setEditable(false);
                rbOcupado.setEnabled(false);
                rbVacante.setEnabled(false);
                cbEquipo.setEnabled(false);
                bAceptar.setEnabled(false);
                break;
            case "alta":
                tfCodigoJugador.setVisible(false);
                bAceptar.setEnabled(true);
                break;
            case "consulta":
                tfCodigoJugador.setVisible(true);
                tfNombre.setEditable(false);
                tfApellido.setEditable(false);
                tfNickname.setEditable(false);
                tfNacionalidad.setEditable(false);
                tfSueldo.setEditable(false);
                tfTelefono.setEditable(false);
                rbOcupado.setEnabled(false);
                rbVacante.setEnabled(false);
                cbEquipo.setEnabled(false);
                bAceptar.setEnabled(false);

        }
    }

    private boolean validarDatos() {

        try {
            validarNombre();
            validarApellido();
            validarNickName();
            validarNacionalidad();
            validarSueldo();
            validarTelefono();
            validarEstado();
            validarEquipo();
            return true;
        } catch (Exception e) {

        }
        return true;
    }

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

    private void validarNickName() throws Exception {
        if (tfNickname.getText().isEmpty()) {
            throw new CampoVacio("El nick del jugador es obligatorio*");
        }

        //En la bdd tenemos el nick como varchar 20
        //Consideramos que no deba ser mayor a 20
        if (tfNickname.getText().length() > 20) {
            throw new DatoNoValido("El Nick no puede ser superior a 20 caracteres.");
        }
    }

    private void validarNacionalidad() throws Exception {
        if (tfNacionalidad.getText().isEmpty()) {
            throw new CampoVacio("La nacionalidad del jugador es obligatoria*");
        }

        //En la bdd tenemos la nacionalidad como varchar 20
        //Consideramos que no deba ser mayor a 20
        if (tfNacionalidad.getText().length() > 20) {
            throw new DatoNoValido("La nacionalidad no puede ser superior a 20 datos");
        }
    }

    private void validarSueldo() throws Exception {
        if (tfNacionalidad.getText().isEmpty()) {
            throw new CampoVacio("El sueldo del jugador es obligatorio*.");
        }
        //En la bdd tenemos el sueldo como number 6
        //Consideramos que no deba ser mayor a 6
        if (tfNacionalidad.getText().length() > 6) {
            throw new DatoNoValido("El sueldo no puede ser mayor a 6 digitos");
        }
    }

    private void validarTelefono() throws Exception {
        String cadena = null;
        if (tfTelefono.getText().isEmpty()) {
            throw new CampoVacio("El telefono del jugador es obligatorio");
        }

        //En la bdd tenemos el telefono como varchar 9
        //Consideramos que no deba ser mayor a 9
        if (tfNacionalidad.getText().length() > 6) {
            throw new DatoNoValido("El sueldo no puede ser mayor a 6 digitos");
        }

        Pattern pat = Pattern.compile("^[6,7,8,9]");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
        } else {
            throw new DatoNoValido("El numero de telefono solo puede empezar por 6, 7 8 o 9.");
        }
    }

    private boolean validarEstado() {
        return false;

    }

    private boolean validarEquipo() {
        return false;
    }

    public void validarJugador() {
        try {
            boolean mensaje = JEMS.consultarJugadorLista(Integer.parseInt(tfCodigoJugador.getText()));
            if (mensaje = false) {
                JOptionPane.showMessageDialog(this, "Jugador no existe");
            } else {
                jugador = JEMS.consultarJugador(Integer.parseInt(tfCodigoJugador.getText()));
            }
            JOptionPane.showMessageDialog(this, mensaje);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getClass());
        }
    }
    private static String ope;
    private static String estado;
    private static Jugador jugador;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        bSalir = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        lbSubtitulo = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbApellido = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        lbNickname = new javax.swing.JLabel();
        tfNickname = new javax.swing.JTextField();
        lbNacionalidad = new javax.swing.JLabel();
        tfNacionalidad = new javax.swing.JTextField();
        lbSueldo = new javax.swing.JLabel();
        tfSueldo = new javax.swing.JTextField();
        rbVacante = new javax.swing.JRadioButton();
        rbOcupado = new javax.swing.JRadioButton();
        lbTelefono = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        lbEquipo = new javax.swing.JLabel();
        cbEquipo = new javax.swing.JComboBox<>();
        lbJugador = new javax.swing.JLabel();
        tfCodigoJugador = new javax.swing.JTextField();
        lbBorde = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        lbRiot = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        lbBackgroundJugador = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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

        bAceptar.setBackground(new java.awt.Color(252, 124, 0));
        bAceptar.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bAceptar.setText("Aceptar");
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
        bVolver.setText("Volver");
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

        lbSubtitulo.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(86, 88, 149));
        lbSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtitulo.setText("JUGADOR");
        getContentPane().add(lbSubtitulo);
        lbSubtitulo.setBounds(530, 70, 240, 60);

        lbNombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbNombre.setText("Nombre");
        getContentPane().add(lbNombre);
        lbNombre.setBounds(170, 310, 150, 40);

        tfNombre.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfNombre.setBorder(null);
        getContentPane().add(tfNombre);
        tfNombre.setBounds(170, 350, 280, 30);

        lbApellido.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbApellido.setText("Apellido");
        getContentPane().add(lbApellido);
        lbApellido.setBounds(170, 400, 150, 40);

        tfApellido.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfApellido.setBorder(null);
        getContentPane().add(tfApellido);
        tfApellido.setBounds(170, 440, 280, 30);

        lbNickname.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbNickname.setText("Nickname");
        getContentPane().add(lbNickname);
        lbNickname.setBounds(840, 220, 150, 40);

        tfNickname.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfNickname.setBorder(null);
        getContentPane().add(tfNickname);
        tfNickname.setBounds(840, 260, 280, 30);

        lbNacionalidad.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbNacionalidad.setText("Nacionalidad");
        getContentPane().add(lbNacionalidad);
        lbNacionalidad.setBounds(500, 220, 150, 40);

        tfNacionalidad.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfNacionalidad.setBorder(null);
        getContentPane().add(tfNacionalidad);
        tfNacionalidad.setBounds(500, 260, 280, 30);

        lbSueldo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbSueldo.setText("Sueldo");
        getContentPane().add(lbSueldo);
        lbSueldo.setBounds(500, 310, 150, 40);

        tfSueldo.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfSueldo.setBorder(null);
        getContentPane().add(tfSueldo);
        tfSueldo.setBounds(500, 350, 280, 30);

        buttonGroup1.add(rbVacante);
        rbVacante.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        rbVacante.setText("Vacante");
        rbVacante.setBorder(null);
        rbVacante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(rbVacante);
        rbVacante.setBounds(870, 350, 100, 30);

        buttonGroup1.add(rbOcupado);
        rbOcupado.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        rbOcupado.setText("Ocupado");
        rbOcupado.setBorder(null);
        rbOcupado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(rbOcupado);
        rbOcupado.setBounds(1010, 350, 110, 30);

        lbTelefono.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbTelefono.setText("Telefono");
        getContentPane().add(lbTelefono);
        lbTelefono.setBounds(500, 400, 150, 40);

        tfTelefono.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfTelefono.setBorder(null);
        getContentPane().add(tfTelefono);
        tfTelefono.setBounds(500, 440, 280, 30);

        lbEstado.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbEstado.setText("Estado");
        getContentPane().add(lbEstado);
        lbEstado.setBounds(840, 310, 150, 40);

        lbEquipo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbEquipo.setText("Equipo");
        getContentPane().add(lbEquipo);
        lbEquipo.setBounds(840, 400, 150, 40);

        cbEquipo.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        cbEquipo.setBorder(null);
        cbEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cbEquipo);
        cbEquipo.setBounds(840, 440, 280, 30);

        lbJugador.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbJugador.setText("Codigo Jugador");
        getContentPane().add(lbJugador);
        lbJugador.setBounds(170, 220, 150, 40);

        tfCodigoJugador.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfCodigoJugador.setBorder(null);
        tfCodigoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(tfCodigoJugador);
        tfCodigoJugador.setBounds(170, 260, 280, 30);

        lbBorde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/blur.png"))); // NOI18N
        lbBorde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 88, 149), 1, true));
        getContentPane().add(lbBorde);
        lbBorde.setBounds(150, 210, 990, 280);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 680, 180, 30);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 670, 100, 50);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Jax.jpg"))); // NOI18N
        getContentPane().add(lbFiller);
        lbFiller.setBounds(0, 0, 1280, 720);

        lbBackgroundJugador.setBackground(new java.awt.Color(13, 9, 32));
        lbBackgroundJugador.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundJugador);
        lbBackgroundJugador.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Funcion para saber que ocurre a la hora de pulsar el boton aceptar.
     *
     * @param evt accion de pulsar
     */
    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        if (rbOcupado.isSelected()) {
            estado = "ocupado";
        } else if (rbVacante.isSelected()) {
            estado = "vacante";
        }
        if (validarDatos()) {
            try {
                switch (ope) {
                    case "modificar":
                        JEMS.modificarJugador(tfNombre.getText(), tfApellido.getText(), tfNickname.getText(), Integer.parseInt(tfSueldo.getText()), tfNacionalidad.getText(), estado, tfTelefono.getText(), equipos.get(cbEquipo.getSelectedIndex()).getCod_equipo());
                        break;
                    case "alta":
                        JEMS.altaJugador(tfNombre.getText(), tfApellido.getText(), tfNickname.getText(), Integer.parseInt(tfSueldo.getText()), tfNacionalidad.getText(), estado, tfTelefono.getText(), equipos.get(cbEquipo.getSelectedIndex()).getCod_equipo());
                        break;
                    case "baja":
                        JEMS.borrarJugador(Integer.parseInt(tfCodigoJugador.getText()));
                        break;
                    case "consulta":
                        JEMS.consultarJugador(Integer.parseInt(tfCodigoJugador.getText()));
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getClass());
            }
        }
    }//GEN-LAST:event_bAceptarActionPerformed
    /**
     * Funcion para sabes que pasa a la hora de pulsar el boton volver.
     *
     * @param evt accion de pulsar
     */
    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaJugador();
    }//GEN-LAST:event_bVolverActionPerformed
    /**
     * Funcion para saber que pasa cuando se pulsa enter en codigo jugador
     *
     * @param evt accion de pulsar enter
     */
    private void tfCodigoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoJugadorActionPerformed
        validarJugador();
        switch (ope) {
            case "modificar":
                tfNombre.setEditable(true);
                tfApellido.setEditable(true);
                tfNacionalidad.setEditable(true);
                tfSueldo.setEditable(true);
                tfTelefono.setEditable(true);
                rbOcupado.setEnabled(true);
                rbVacante.setEnabled(true);
                cbEquipo.setEnabled(true);
                bAceptar.setEnabled(true);
                tfCodigoJugador.setEditable(false);
                tfNombre.setText(jugador.getNombre());
                tfApellido.setText(jugador.getApellido());
                tfNickname.setText(jugador.getNickname());
                tfNacionalidad.setText(jugador.getNacionalidad());
                tfSueldo.setText(String.valueOf(jugador.getSueldo()));
                tfTelefono.setText(jugador.getTelefono());
                //mirar todos los nombres de los equipos en la combobox
                cbEquipo.setSelectedItem(jugador.getEquipo().getNombre());
                //otra posible solucion
                /*for (int x = 0; x < cbEquipo.getItemCount(); x++) {
                    //si el nombre del equipo del jugador es igual al nombre del equipo de la combobox en esa posicion
                    if (jugador.getEquipo().getNombre().compareToIgnoreCase(cbEquipo.getItemAt(x)) != 0) {
                        //se pone como principal el nombre del equipo de esa posicion
                        cbEquipo.setSelectedIndex(x);
                    }
                }*/
                if (jugador.getEstado().compareToIgnoreCase("vacante") != 0) {
                    rbVacante.isSelected();
                } else {
                    rbOcupado.isSelected();
                }
                break;
            case "baja":
                bAceptar.setEnabled(true);
                tfNombre.setText(jugador.getNombre());
                tfApellido.setText(jugador.getApellido());
                tfNickname.setText(jugador.getNickname());
                tfNacionalidad.setText(jugador.getNacionalidad());
                tfSueldo.setText(String.valueOf(jugador.getSueldo()));
                tfTelefono.setText(jugador.getTelefono());
                cbEquipo.setSelectedItem(jugador.getEquipo().getNombre());
                if (jugador.getEstado().compareToIgnoreCase("vacante") != 0) {
                    rbVacante.isSelected();
                } else {
                    rbOcupado.isSelected();
                }
                break;
            case "consulta":
                tfNombre.setText(jugador.getNombre());
                tfApellido.setText(jugador.getApellido());
                tfNickname.setText(jugador.getNickname());
                tfNacionalidad.setText(jugador.getNacionalidad());
                tfSueldo.setText(String.valueOf(jugador.getSueldo()));
                tfTelefono.setText(jugador.getTelefono());
                cbEquipo.setSelectedItem(jugador.getEquipo().getNombre());
                if (jugador.getEstado().compareToIgnoreCase("vacante") != 0) {
                    rbVacante.isSelected();
                } else {
                    rbOcupado.isSelected();
                }
                break;
        }
    }//GEN-LAST:event_tfCodigoJugadorActionPerformed

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
            java.util.logging.Logger.getLogger(V_Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Jugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbEquipo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbBackgroundJugador;
    private javax.swing.JLabel lbBorde;
    private javax.swing.JLabel lbEquipo;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbJugador;
    private javax.swing.JLabel lbNacionalidad;
    private javax.swing.JLabel lbNickname;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbSueldo;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JRadioButton rbOcupado;
    private javax.swing.JRadioButton rbVacante;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCodigoJugador;
    private javax.swing.JTextField tfNacionalidad;
    private javax.swing.JTextField tfNickname;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfSueldo;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
