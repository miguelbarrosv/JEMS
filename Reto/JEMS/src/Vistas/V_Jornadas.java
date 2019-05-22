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
import javax.swing.BorderFactory;
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
     * @throws Exception hereda excepciones
     */
    public V_Jornadas() throws Exception {
        setUndecorated(true);
        initComponents();
        myInitComponents();
        jornadas = JEMS.consultarJornadasconPartidos();

        switch (cbJornadas.getSelectedIndex()) {
            case 0:
                tfEquipoLocal.setText(jornadas.get(0).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(0).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(0).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(0).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(0).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(0).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 1:
                tfEquipoLocal.setText(jornadas.get(1).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(1).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(1).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(1).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(1).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(1).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 2:
                tfEquipoLocal.setText(jornadas.get(2).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(2).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(2).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(2).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(2).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(2).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 3:
                tfEquipoLocal.setText(jornadas.get(3).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(3).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(3).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(3).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(3).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(3).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 4:
                tfEquipoLocal.setText(jornadas.get(4).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(4).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(4).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(4).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(4).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(4).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 5:
                tfEquipoLocal.setText(jornadas.get(5).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(5).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(5).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(5).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(5).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(5).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 6:
                tfEquipoLocal.setText(jornadas.get(6).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(6).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(6).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(6).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(6).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(6).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 7:
                tfEquipoLocal.setText(jornadas.get(7).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(7).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(7).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(7).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(7).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(7).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 8:
                tfEquipoLocal.setText(jornadas.get(8).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(8).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(8).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(8).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(8).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(8).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            case 9:
                tfEquipoLocal.setText(jornadas.get(9).getPartidos().get(0).getEquipo_local().getNombre());
                tfEquipoVisitante.setText(jornadas.get(9).getPartidos().get(0).getEquipo_visitante().getNombre());
                tfEquipoLocal2.setText(jornadas.get(9).getPartidos().get(1).getEquipo_local().getNombre());
                tfEquipoVisitante2.setText(jornadas.get(9).getPartidos().get(1).getEquipo_visitante().getNombre());
                tfEquipoLocal3.setText(jornadas.get(9).getPartidos().get(2).getEquipo_local().getNombre());
                tfEquipoVisitante3.setText(jornadas.get(9).getPartidos().get(2).getEquipo_visitante().getNombre());
                break;
            default:
                break;
        }
    }
    
    public void myInitComponents() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
        tfEquipoLocal.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoLocal.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoLocal2.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoLocal2.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoLocal3.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoLocal3.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoVisitante.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoVisitante.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoVisitante2.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoVisitante2.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfEquipoVisitante3.setBorder(BorderFactory.createCompoundBorder(
                tfEquipoVisitante3.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
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

        tfEquipoLocal = new javax.swing.JTextField();
        tfEquipoVisitante = new javax.swing.JTextField();
        tfEquipoLocal2 = new javax.swing.JTextField();
        tfEquipoVisitante2 = new javax.swing.JTextField();
        tfEquipoLocal3 = new javax.swing.JTextField();
        tfEquipoVisitante3 = new javax.swing.JTextField();
        cbJornadas = new javax.swing.JComboBox<>();
        bVolver = new javax.swing.JButton();
        lbVS = new javax.swing.JLabel();
        lbVS2 = new javax.swing.JLabel();
        lbVS3 = new javax.swing.JLabel();
        lbRiot = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        lbSubtitulo = new javax.swing.JLabel();
        lbCodigoDueño = new javax.swing.JLabel();
        lbBorde = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        lbBackgroundEquipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tfEquipoLocal.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoLocal.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoLocal.setEnabled(false);
        getContentPane().add(tfEquipoLocal);
        tfEquipoLocal.setBounds(360, 310, 250, 30);

        tfEquipoVisitante.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoVisitante.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoVisitante.setEnabled(false);
        getContentPane().add(tfEquipoVisitante);
        tfEquipoVisitante.setBounds(690, 310, 250, 30);

        tfEquipoLocal2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoLocal2.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoLocal2.setEnabled(false);
        getContentPane().add(tfEquipoLocal2);
        tfEquipoLocal2.setBounds(360, 380, 250, 30);

        tfEquipoVisitante2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoVisitante2.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoVisitante2.setEnabled(false);
        getContentPane().add(tfEquipoVisitante2);
        tfEquipoVisitante2.setBounds(690, 380, 250, 30);

        tfEquipoLocal3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoLocal3.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoLocal3.setEnabled(false);
        getContentPane().add(tfEquipoLocal3);
        tfEquipoLocal3.setBounds(360, 450, 250, 30);

        tfEquipoVisitante3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfEquipoVisitante3.setForeground(new java.awt.Color(0, 0, 0));
        tfEquipoVisitante3.setEnabled(false);
        getContentPane().add(tfEquipoVisitante3);
        tfEquipoVisitante3.setBounds(690, 450, 250, 30);

        cbJornadas.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        cbJornadas.setForeground(new java.awt.Color(0, 0, 0));
        cbJornadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jornada 1", "Jornada 2", "Jornada 3", "Jornada 4", "Jornada 5", "Jornada 6", "Jornada 7", "Jornada 8", "Jornada 9", "Jornada 10" }));
        cbJornadas.setSelectedIndex(-1);
        cbJornadas.setBorder(null);
        cbJornadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cbJornadas);
        cbJornadas.setBounds(510, 250, 280, 30);

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

        lbVS.setForeground(new java.awt.Color(255, 255, 255));
        lbVS.setText("- v -");
        getContentPane().add(lbVS);
        lbVS.setBounds(640, 310, 20, 20);

        lbVS2.setForeground(new java.awt.Color(255, 255, 255));
        lbVS2.setText("- v -");
        getContentPane().add(lbVS2);
        lbVS2.setBounds(640, 450, 20, 30);

        lbVS3.setForeground(new java.awt.Color(255, 255, 255));
        lbVS3.setText("- v -");
        getContentPane().add(lbVS3);
        lbVS3.setBounds(640, 380, 20, 20);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 670, 100, 50);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 680, 180, 30);

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

        lbSubtitulo.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(86, 88, 149));
        lbSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtitulo.setText("JORNADAS");
        getContentPane().add(lbSubtitulo);
        lbSubtitulo.setBounds(510, 70, 290, 60);

        lbCodigoDueño.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbCodigoDueño.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoDueño.setText("Selecciona la Jornada a Visualizar");
        getContentPane().add(lbCodigoDueño);
        lbCodigoDueño.setBounds(510, 210, 280, 40);

        lbBorde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/blur.png"))); // NOI18N
        lbBorde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 88, 149), 1, true));
        getContentPane().add(lbBorde);
        lbBorde.setBounds(320, 190, 680, 330);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jornada_background.jpg"))); // NOI18N
        getContentPane().add(lbFiller);
        lbFiller.setBounds(0, 0, 1280, 720);

        lbBackgroundEquipo.setBackground(new java.awt.Color(13, 9, 32));
        lbBackgroundEquipo.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundEquipo);
        lbBackgroundEquipo.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaJornadas();
    }//GEN-LAST:event_bVolverActionPerformed

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
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bVolver;
    private javax.swing.JComboBox<String> cbJornadas;
    private javax.swing.JLabel lbBackgroundEquipo;
    private javax.swing.JLabel lbBorde;
    private javax.swing.JLabel lbCodigoDueño;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbVS;
    private javax.swing.JLabel lbVS2;
    private javax.swing.JLabel lbVS3;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JTextField tfEquipoLocal;
    private javax.swing.JTextField tfEquipoLocal2;
    private javax.swing.JTextField tfEquipoLocal3;
    private javax.swing.JTextField tfEquipoVisitante;
    private javax.swing.JTextField tfEquipoVisitante2;
    private javax.swing.JTextField tfEquipoVisitante3;
    // End of variables declaration//GEN-END:variables
}
