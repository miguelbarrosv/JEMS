/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 * Ventana de la lista de los equipos, jugadores, dueños o usuarios.
 *
 * @author Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class V_Lista extends javax.swing.JFrame {

    /**
     * Constructor de lista.
     *
     */
    public V_Lista() {
        setUndecorated(true);
        initComponents();
        myInitComponents();
        taListaJugadores.setEditable(false);
    }

    /**
     * Formato de la ventana.
     *
     */
    public void myInitComponents() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
    }

    /**
     * Crea una ventana con el textArea lleno.
     *
     * @param lista lista de los jugadores, equipos, dueños o usuarios
     */
    public V_Lista(String lista) {
        setUndecorated(true);
        initComponents();
        myInitComponents();
        taListaJugadores.setEditable(false);
        taListaJugadores.setText(lista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taListaJugadores = new javax.swing.JTextArea();
        lbSubtitulo = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        lbBorde = new javax.swing.JLabel();
        lbRiot = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        lbBackgroundLista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        taListaJugadores.setColumns(20);
        taListaJugadores.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        taListaJugadores.setRows(5);
        taListaJugadores.setBorder(null);
        taListaJugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        taListaJugadores.setOpaque(false);
        jScrollPane1.setViewportView(taListaJugadores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 180, 620, 370);

        lbSubtitulo.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(86, 88, 149));
        lbSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtitulo.setText("JUGADORES");
        getContentPane().add(lbSubtitulo);
        lbSubtitulo.setBounds(510, 70, 300, 60);

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
        lbBorde.setBounds(300, 150, 680, 430);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 670, 100, 50);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 680, 180, 30);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Viktor.jpg"))); // NOI18N
        getContentPane().add(lbFiller);
        lbFiller.setBounds(0, 0, 1280, 720);

        lbBackgroundLista.setBackground(new java.awt.Color(13, 9, 32));
        lbBackgroundLista.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundLista);
        lbBackgroundLista.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * volver a la ventana administrador.
     *
     * @param evt accion de clickar
     */
    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaLista();
    }//GEN-LAST:event_bVolverActionPerformed
    /**
     * Salir del programa.
     *
     * @param evt accion de clickar
     */
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
            java.util.logging.Logger.getLogger(V_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBackgroundLista;
    private javax.swing.JLabel lbBorde;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JTextArea taListaJugadores;
    // End of variables declaration//GEN-END:variables
}
