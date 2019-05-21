/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import UML.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jems.JEMS;

/**
 *
 * @author Miguel Barros
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class V_Jornadas extends javax.swing.JFrame {

    /**
     * Creates new form V_Jornadas Funcion que al iniciar la ventana muestra en
     * la pantalla los datos de una jornada para que el usuario pueda
     * visualizarlo
     */
    public V_Jornadas() throws Exception {
        initComponents();
        jornadas = JEMS.consultarJornadas();

        if (cbJornadas.getSelectedIndex() == 0) {
            tfEquipoLocal.setText(jornadas.get(0).getPartidos().get(0).getEquipo_local().getNombre());
            tfEquipoVisitante.setText(jornadas.get(0).getPartidos().get(0).getEquipo_visitante().getNombre());
            tfEquipoLocal2.setText(jornadas.get(0).getPartidos().get(1).getEquipo_local().getNombre());
            tfEquipoVisitante2.setText(jornadas.get(0).getPartidos().get(1).getEquipo_visitante().getNombre());
            tfEquipoLocal3.setText(jornadas.get(0).getPartidos().get(2).getEquipo_local().getNombre());
            tfEquipoVisitante3.setText(jornadas.get(0).getPartidos().get(2).getEquipo_visitante().getNombre());
        }
        else if (cbJornadas.getSelectedIndex() == 1) {
            tfEquipoLocal.setText(jornadas.get(1).getPartidos().get(0).getEquipo_local().getNombre());
            tfEquipoVisitante.setText(jornadas.get(1).getPartidos().get(0).getEquipo_visitante().getNombre());
            tfEquipoLocal2.setText(jornadas.get(1).getPartidos().get(1).getEquipo_local().getNombre());
            tfEquipoVisitante2.setText(jornadas.get(1).getPartidos().get(1).getEquipo_visitante().getNombre());
            tfEquipoLocal3.setText(jornadas.get(1).getPartidos().get(2).getEquipo_local().getNombre());
            tfEquipoVisitante3.setText(jornadas.get(1).getPartidos().get(2).getEquipo_visitante().getNombre());
        }
        else if (cbJornadas.getSelectedIndex() == 2) {
            tfEquipoLocal.setText(jornadas.get(2).getPartidos().get(0).getEquipo_local().getNombre());
            tfEquipoVisitante.setText(jornadas.get(2).getPartidos().get(0).getEquipo_visitante().getNombre());
            tfEquipoLocal2.setText(jornadas.get(2).getPartidos().get(1).getEquipo_local().getNombre());
            tfEquipoVisitante2.setText(jornadas.get(2).getPartidos().get(1).getEquipo_visitante().getNombre());
            tfEquipoLocal3.setText(jornadas.get(2).getPartidos().get(2).getEquipo_local().getNombre());
            tfEquipoVisitante3.setText(jornadas.get(2).getPartidos().get(2).getEquipo_visitante().getNombre());
        }
        else if (cbJornadas.getSelectedIndex() == 3) {
            tfEquipoLocal.setText(jornadas.get(3).getPartidos().get(0).getEquipo_local().getNombre());
            tfEquipoVisitante.setText(jornadas.get(3).getPartidos().get(0).getEquipo_visitante().getNombre());
            tfEquipoLocal2.setText(jornadas.get(3).getPartidos().get(1).getEquipo_local().getNombre());
            tfEquipoVisitante2.setText(jornadas.get(3).getPartidos().get(1).getEquipo_visitante().getNombre());
            tfEquipoLocal3.setText(jornadas.get(3).getPartidos().get(2).getEquipo_local().getNombre());
            tfEquipoVisitante3.setText(jornadas.get(3).getPartidos().get(2).getEquipo_visitante().getNombre());
        }
        else if (cbJornadas.getSelectedIndex() == 4) {
            tfEquipoLocal.setText(jornadas.get(4).getPartidos().get(0).getEquipo_local().getNombre());
            tfEquipoVisitante.setText(jornadas.get(4).getPartidos().get(0).getEquipo_visitante().getNombre());
            tfEquipoLocal2.setText(jornadas.get(4).getPartidos().get(1).getEquipo_local().getNombre());
            tfEquipoVisitante2.setText(jornadas.get(4).getPartidos().get(1).getEquipo_visitante().getNombre());
            tfEquipoLocal3.setText(jornadas.get(4).getPartidos().get(2).getEquipo_local().getNombre());
            tfEquipoVisitante3.setText(jornadas.get(4).getPartidos().get(2).getEquipo_visitante().getNombre());
        }
        else if (cbJornadas.getSelectedIndex() == 5) {
            tfEquipoLocal.setText(jornadas.get(5).getPartidos().get(0).getEquipo_local().getNombre());
            tfEquipoVisitante.setText(jornadas.get(5).getPartidos().get(0).getEquipo_visitante().getNombre());
            tfEquipoLocal2.setText(jornadas.get(5).getPartidos().get(1).getEquipo_local().getNombre());
            tfEquipoVisitante2.setText(jornadas.get(5).getPartidos().get(1).getEquipo_visitante().getNombre());
            tfEquipoLocal3.setText(jornadas.get(5).getPartidos().get(2).getEquipo_local().getNombre());
            tfEquipoVisitante3.setText(jornadas.get(5).getPartidos().get(2).getEquipo_visitante().getNombre());
        }
        else if (cbJornadas.getSelectedIndex() == 6) {
            tfEquipoLocal.setText(jornadas.get(6).getPartidos().get(0).getEquipo_local().getNombre());
            tfEquipoVisitante.setText(jornadas.get(6).getPartidos().get(0).getEquipo_visitante().getNombre());
            tfEquipoLocal2.setText(jornadas.get(6).getPartidos().get(1).getEquipo_local().getNombre());
            tfEquipoVisitante2.setText(jornadas.get(6).getPartidos().get(1).getEquipo_visitante().getNombre());
            tfEquipoLocal3.setText(jornadas.get(6).getPartidos().get(2).getEquipo_local().getNombre());
            tfEquipoVisitante3.setText(jornadas.get(6).getPartidos().get(2).getEquipo_visitante().getNombre());
        }
        else if (cbJornadas.getSelectedIndex() == 7) {
            tfEquipoLocal.setText(jornadas.get(7).getPartidos().get(0).getEquipo_local().getNombre());
            tfEquipoVisitante.setText(jornadas.get(7).getPartidos().get(0).getEquipo_visitante().getNombre());
            tfEquipoLocal2.setText(jornadas.get(7).getPartidos().get(1).getEquipo_local().getNombre());
            tfEquipoVisitante2.setText(jornadas.get(7).getPartidos().get(1).getEquipo_visitante().getNombre());
            tfEquipoLocal3.setText(jornadas.get(7).getPartidos().get(2).getEquipo_local().getNombre());
            tfEquipoVisitante3.setText(jornadas.get(7).getPartidos().get(2).getEquipo_visitante().getNombre());
        }
        else if (cbJornadas.getSelectedIndex() == 8) {
            tfEquipoLocal.setText(jornadas.get(8).getPartidos().get(0).getEquipo_local().getNombre());
            tfEquipoVisitante.setText(jornadas.get(8).getPartidos().get(0).getEquipo_visitante().getNombre());
            tfEquipoLocal2.setText(jornadas.get(8).getPartidos().get(1).getEquipo_local().getNombre());
            tfEquipoVisitante2.setText(jornadas.get(8).getPartidos().get(1).getEquipo_visitante().getNombre());
            tfEquipoLocal3.setText(jornadas.get(8).getPartidos().get(2).getEquipo_local().getNombre());
            tfEquipoVisitante3.setText(jornadas.get(8).getPartidos().get(2).getEquipo_visitante().getNombre());
        }
        else if (cbJornadas.getSelectedIndex() == 9) {
            tfEquipoLocal.setText(jornadas.get(9).getPartidos().get(0).getEquipo_local().getNombre());
            tfEquipoVisitante.setText(jornadas.get(9).getPartidos().get(0).getEquipo_visitante().getNombre());
            tfEquipoLocal2.setText(jornadas.get(9).getPartidos().get(1).getEquipo_local().getNombre());
            tfEquipoVisitante2.setText(jornadas.get(9).getPartidos().get(1).getEquipo_visitante().getNombre());
            tfEquipoLocal3.setText(jornadas.get(9).getPartidos().get(2).getEquipo_local().getNombre());
            tfEquipoVisitante3.setText(jornadas.get(9).getPartidos().get(2).getEquipo_visitante().getNombre());
        }

    }

    private static Jornada jornada;
    private static ArrayList<Jornada> jornadas = new ArrayList<Jornada>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        tfEquipoLocal = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        tfEquipoVisitante = new javax.swing.JTextField();
        tfEquipoLocal2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        tfEquipoVisitante2 = new javax.swing.JTextField();
        tfEquipoLocal3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        tfEquipoVisitante3 = new javax.swing.JTextField();
        bVolver = new javax.swing.JButton();
        cbJornadas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Jornada: ");
        jTextField1.setEnabled(false);

        tfEquipoLocal.setEnabled(false);

        jTextField2.setText("-");
        jTextField2.setEnabled(false);

        tfEquipoVisitante.setEnabled(false);

        tfEquipoLocal2.setEnabled(false);

        jTextField4.setText("-");
        jTextField4.setEnabled(false);

        tfEquipoVisitante2.setEnabled(false);

        tfEquipoLocal3.setEnabled(false);

        jTextField5.setText("-");
        jTextField5.setEnabled(false);

        tfEquipoVisitante3.setEnabled(false);

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        cbJornadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jornada 1", "Jornada 2", "Jornada 3", "Jornada 4", "Jornada 5", "Jornada 6", "Jornada 7", "Jornada 8", "Jornada 9", "Jornada 10" }));
        cbJornadas.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfEquipoVisitante3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                            .addComponent(tfEquipoVisitante2)
                                            .addComponent(tfEquipoVisitante)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cbJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfEquipoLocal3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(tfEquipoLocal2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(bVolver)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEquipoVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEquipoLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEquipoVisitante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEquipoLocal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEquipoVisitante3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(bVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaJornadas();
    }//GEN-LAST:event_bVolverActionPerformed

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
            java.util.logging.Logger.getLogger(V_Jornadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Jornadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Jornadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Jornadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new V_Jornadas().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(V_Jornadas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVolver;
    private javax.swing.JComboBox<String> cbJornadas;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField tfEquipoLocal;
    private javax.swing.JTextField tfEquipoLocal2;
    private javax.swing.JTextField tfEquipoLocal3;
    private javax.swing.JTextField tfEquipoVisitante;
    private javax.swing.JTextField tfEquipoVisitante2;
    private javax.swing.JTextField tfEquipoVisitante3;
    // End of variables declaration//GEN-END:variables
}
