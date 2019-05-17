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
import java.util.logging.Level;
import java.util.logging.Logger;
import jems.JEMS;

/**
 *
 * @author Miguel Barros
 * @author Sergio Zulueta
 *
 */
public class V_Jugador extends javax.swing.JFrame {

    /**
     * Creates new form V_Jugador
     */
    public V_Jugador() {
        initComponents();
    }

    public V_Jugador(String operacion) {
        initComponents();
        operacion = ope;

    private boolean validarDatos() {

        try{
            validarNombre();
            validarApellido();
            validarNickName();
            validarNacionalidad();
            validarSueldo();
            validarTelefono();
            validarEstado();
            validarEquipo();
            
            
            return true;
        }catch(Exception e){
            
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

        if (operacion == "modificar") {
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
        } else if (operacion == "baja") {
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
        } else if (operacion == "alta") {
            tfCodigoJugador.setVisible(false);
            bAceptar.setEnabled(false);
        }
    }
    /**
     * Funcion que se usa para llenar la combobox.
     */
    public void llenarCombo()
    {
        //el numero de equipos presentes
        int numero=JEMS.getNumeroEquipos();
        for(int x=0;x<numero;x++)
            //insertamos todos los equipos en la combobox
            cbEquipo.insertItemAt(JEMS.getNombreEquipo(x), x);
    }
    public boolean validarDatos() {
        if (validarNombre(tfNombre.getText()) && validarApellido(tfApellido.getText()) && validarNacionalidad(tfNacionalidad.getText()) && validarSueldo(tfSueldo.getText()) && validarTelefono(tfTelefono.getText()) && validarEstado(rbEstado.getSelectedIndex()) && validarEquipo(cbEquipo.getSelectedIndex()))
            return true;
        else 
            return false;
    } 
    public boolean validarNombre(String nombre) {
        return true;
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
        bAceptar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfNickname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfNacionalidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfSueldo = new javax.swing.JTextField();
        rbVacante = new javax.swing.JRadioButton();
        rbOcupado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbEquipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        tfCodigoJugador = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Apellido: ");

        jLabel4.setText("Nickname: ");

        jLabel5.setText("Nacionalidad: ");

        jLabel6.setText("Sueldo: ");

        buttonGroup1.add(rbVacante);
        rbVacante.setText("Vacante");

        buttonGroup1.add(rbOcupado);
        rbOcupado.setText("Ocupado");

        jLabel7.setText("Telefono: ");

        jLabel8.setText("Estado: ");

        jLabel9.setText("Equipo: ");

        jLabel10.setText("Codigo Jugador: ");

        tfCodigoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bAceptar)
                            .addComponent(jLabel9))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bVolver)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(121, 121, 121))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCodigoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(tfApellido)
                                    .addComponent(tfNickname)
                                    .addComponent(tfNacionalidad)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbVacante)
                                    .addComponent(rbOcupado))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfCodigoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOcupado)
                        .addGap(18, 18, 18)
                        .addComponent(rbVacante)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVolver)
                    .addComponent(bAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        if (rbOcupado.isSelected()) {
            estado = "ocupado";
        } else if (rbVacante.isSelected()) {
            estado = "vacante";
        }
        if (validarDatos()) {
            if (ope == "modificar") {
                try {
                    
                    JEMS.modificarJugador(tfNombre.getText(), tfApellido.getText(), tfNickname.getText(), Integer.parseInt(tfSueldo.getText()), tfNacionalidad.getText(), estado, tfTelefono.getText(), cbEquipo.getSelectedIndex());
                } catch (Exception e) {
                }
            } else if (ope == "alta") {
                try {
                    JEMS.altaJugador(tfNombre.getText(), tfApellido.getText(), tfNickname.getText(), Integer.parseInt(tfSueldo.getText()), tfNacionalidad.getText(), estado, tfTelefono.getText(), cbEquipo.getSelectedIndex());
                } catch (Exception e) {
                }
            } else if (ope == "baja") {
                try {
                    JEMS.borrarJugador(tfCodigoJugador.getText());
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaJugador();
    }//GEN-LAST:event_bVolverActionPerformed

    private void tfCodigoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoJugadorActionPerformed
        jugador = buscarJugadorPorCodigo(tfCodigoJugador.getText());
        if (ope.compareToIgnoreCase("modificar") == 0) {
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
            cbEquipo.setSelectedItem(jugador.getEquipo().getNombre());
            //mirar todos los nombres de los equipos en la combobox
           /* for (int x=0;x<cbEquipo.getItemCount();x++)
           {
               //si el nombre del equipo del jugador es igual al nombre del equipo de la combobox en esa posicion
              if (jugador.getEquipo().getNombre().compareToIgnoreCase(cbEquipo.getItemAt(x))!=0)
                   {
                        //se pone como principal el nombre del equipo de esa posicion
                        cbEquipo.setSelectedIndex(x);
                   } 
           }        */   
            if (jugador.getEstado() == "vacante")
                rbVacante.isSelected();
            } else {
                rbOcupado.isSelected();
                tfCodigoJugador.setText(String.valueOf(jugador.getCod_jugador()));
            }

        } else if (ope.compareToIgnoreCase("baja") == 0) {
            tfNombre.setEditable(false);
            tfApellido.setEditable(false);
            tfNickname.setEditable(false);
            tfNacionalidad.setEditable(false);
            tfSueldo.setEditable(false);
            tfTelefono.setEditable(false);
            rbOcupado.setEnabled(false);
            rbVacante.setEnabled(false);
            cbEquipo.setEnabled(false);
            tfCodigoJugador.setEditable(false);
            tfNombre.setText(jugador.getNombre());
            tfApellido.setText(jugador.getApellido());
            tfNickname.setText(jugador.getNickname());
            tfNacionalidad.setText(jugador.getNacionalidad());
            tfSueldo.setText(String.valueOf(jugador.getSueldo()));
            tfTelefono.setText(jugador.getTelefono());
            cbEquipo.setSelectedItem(jugador.getEquipo().getNombre());
            if (jugador.getEstado() == "vacante")
                rbVacante.isSelected();
            } else {
                rbOcupado.isSelected();
            }
            tfCodigoJugador.setText(String.valueOf(jugador.getCod_jugador()));
        }

    }//GEN-LAST:event_tfCodigoJugadorActionPerformed

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
    private javax.swing.JButton bVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
