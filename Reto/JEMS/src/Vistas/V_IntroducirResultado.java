/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import UML.Jornada;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jems.JEMS;

/**
 *
 * @author migue
 */
public class V_IntroducirResultado extends javax.swing.JFrame {

    /**
     * Creates new form V_IntroducirResultado
     */
    public V_IntroducirResultado() {
        initComponents();
    }
    public V_IntroducirResultado( ArrayList<Jornada>jornadas, int numJornada) {
        initComponents();
        switch (numJornada) {
            case 1:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(0).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(0).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(0).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(0).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(0).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(0).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 2:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(1).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(1).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(1).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(1).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(1).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(1).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 3:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(2).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(2).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(2).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(2).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(2).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(2).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 4:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(3).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(3).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(3).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(3).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(3).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(3).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 5:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(4).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(4).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(4).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(4).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(4).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(4).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 6:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(5).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(5).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(5).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(5).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(5).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(5).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 7:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(6).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(6).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(6).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(6).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(6).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(6).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 8:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(7).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(7).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(7).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(7).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(7).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(7).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 9:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(8).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(8).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(8).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(8).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(8).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(8).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 10:
                tfNumJornada.setText(String.valueOf(numJornada));
                tfEquipoLocal.setText(jornadas.get(9).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(9).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(9).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(9).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(9).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(9).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
                        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        tfNumJornada = new javax.swing.JTextField();
        tfEquipoLocal = new javax.swing.JTextField();
        tfEquipoLocal2 = new javax.swing.JTextField();
        tfEquipoLocal3 = new javax.swing.JTextField();
        tfEquipoVisitante3 = new javax.swing.JTextField();
        tfEquipoVisitante2 = new javax.swing.JTextField();
        tfEquipoVisitante = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        rbGanadorVisitante = new javax.swing.JRadioButton();
        rbGanadorVisitante2 = new javax.swing.JRadioButton();
        rbGanadorVisitante3 = new javax.swing.JRadioButton();
        rbGanadorLocal = new javax.swing.JRadioButton();
        rbGanadorLocal2 = new javax.swing.JRadioButton();
        rbGanadorLocal3 = new javax.swing.JRadioButton();
        bActualizar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Jornada: ");
        jTextField1.setEnabled(false);

        tfNumJornada.setEnabled(false);

        tfEquipoLocal.setEnabled(false);
        tfEquipoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEquipoLocalActionPerformed(evt);
            }
        });

        tfEquipoLocal2.setEnabled(false);

        tfEquipoLocal3.setEnabled(false);

        tfEquipoVisitante3.setEnabled(false);

        tfEquipoVisitante2.setEnabled(false);

        tfEquipoVisitante.setEnabled(false);

        jTextField3.setText("-");

        jTextField4.setText("-");

        jTextField5.setText("-");

        buttonGroup1.add(rbGanadorVisitante);
        rbGanadorVisitante.setText("Ganador");

        buttonGroup2.add(rbGanadorVisitante2);
        rbGanadorVisitante2.setText("Ganador");

        buttonGroup3.add(rbGanadorVisitante3);
        rbGanadorVisitante3.setText("Ganador");

        buttonGroup1.add(rbGanadorLocal);
        rbGanadorLocal.setText("Ganador");

        buttonGroup2.add(rbGanadorLocal2);
        rbGanadorLocal2.setText("Ganador");

        buttonGroup3.add(rbGanadorLocal3);
        rbGanadorLocal3.setText("Ganador");

        bActualizar.setText("Actualizar");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbGanadorLocal2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfEquipoLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbGanadorLocal3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfEquipoLocal3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbGanadorLocal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bActualizar)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfEquipoVisitante2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbGanadorVisitante)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bVolver)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfEquipoVisitante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(tfEquipoVisitante3, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(rbGanadorVisitante2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbGanadorVisitante3))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(tfNumJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEquipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEquipoVisitante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbGanadorVisitante)
                    .addComponent(rbGanadorLocal))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEquipoLocal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEquipoVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbGanadorVisitante2)
                    .addComponent(rbGanadorLocal2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEquipoLocal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEquipoVisitante3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbGanadorVisitante3)
                    .addComponent(rbGanadorLocal3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bActualizar)
                    .addComponent(bVolver))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEquipoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEquipoLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEquipoLocalActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        if (rbGanadorLocal.isSelected()) {
            try {
                JEMS.introducirResultado(tfEquipoLocal.getText());
            } catch (Exception ex) {
                Logger.getLogger(V_IntroducirResultado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (rbGanadorVisitante.isSelected()) {
            try {
                JEMS.introducirResultado(tfEquipoVisitante.getText());
            } catch (Exception ex) {
                Logger.getLogger(V_IntroducirResultado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rbGanadorLocal2.isSelected()) {
            try {
                JEMS.introducirResultado(tfEquipoLocal2.getText());
            } catch (Exception ex) {
                Logger.getLogger(V_IntroducirResultado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(rbGanadorVisitante2.isSelected()) {
            try {
                JEMS.introducirResultado(tfEquipoVisitante2.getText());
            } catch (Exception ex) {
                Logger.getLogger(V_IntroducirResultado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rbGanadorLocal3.isSelected()) {
            try {
                JEMS.introducirResultado(tfEquipoLocal3.getText());
            } catch (Exception ex) {
                Logger.getLogger(V_IntroducirResultado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (rbGanadorVisitante3.isSelected()) {
            try {
                JEMS.introducirResultado(tfEquipoVisitante3.getText());
            } catch (Exception ex) {
                Logger.getLogger(V_IntroducirResultado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
            
    }//GEN-LAST:event_bActualizarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaResultado();
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
            java.util.logging.Logger.getLogger(V_IntroducirResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_IntroducirResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_IntroducirResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_IntroducirResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_IntroducirResultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton rbGanadorLocal;
    private javax.swing.JRadioButton rbGanadorLocal2;
    private javax.swing.JRadioButton rbGanadorLocal3;
    private javax.swing.JRadioButton rbGanadorVisitante;
    private javax.swing.JRadioButton rbGanadorVisitante2;
    private javax.swing.JRadioButton rbGanadorVisitante3;
    private javax.swing.JTextField tfEquipoLocal;
    private javax.swing.JTextField tfEquipoLocal2;
    private javax.swing.JTextField tfEquipoLocal3;
    private javax.swing.JTextField tfEquipoVisitante;
    private javax.swing.JTextField tfEquipoVisitante2;
    private javax.swing.JTextField tfEquipoVisitante3;
    private javax.swing.JTextField tfNumJornada;
    // End of variables declaration//GEN-END:variables
}
