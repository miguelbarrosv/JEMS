/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.BorderFactory;

/**
 *
 * @author Joel Encinas
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class V_Aviso extends javax.swing.JFrame {

    /**
     * Creates new form V_Aviso
     */
    public V_Aviso() {
        initComponents();
    }

    /**
     * Constructor V_aviso que imprime un mensaje que recibe como parametro
     *
     * @param mensaje (requerido) establece el mensaje a imprimir
     */
    public V_Aviso(String mensaje) {
        setUndecorated(true);
        initComponents();
        myInitComponents();
        String espacio = "<br>";
        lbMensaje.setText(formatearString(formatearString("<html>" + mensaje + "</html>", espacio, 30), espacio, 62));
    }

    /**
     * Metodo para preformatear la ventana especificando tamaño, localizacion
     * dentro de la ventana y otras especificaciones como componentes ocultos.
     */
    public void myInitComponents() {
        setSize(400, 220);
        setLocationRelativeTo(this);
        lbMensaje.setBorder(BorderFactory.createCompoundBorder(
                lbMensaje.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    /**
     * Es un Get que devuelve el codigo del administrador.
     *
     * @param mensaje (requerido) es el mensaje que recibe la ventana como parametro
     * @param espacio (requerido) el espacio a intercalar
     * @param index (requerido) el numero de caracter en el que se inserta el espacio
     * @return temp devuelve el String formateado
     */
    public String formatearString(String mensaje, String espacio, int index) {
        String temp = new String();
        for (int i = 0; i < mensaje.length(); i++) {
            temp += mensaje.charAt(i);
            if (i == index) {
                temp += espacio;
            }
        }
        return temp;
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
        lbAviso = new javax.swing.JLabel();
        lbMensaje = new javax.swing.JLabel();
        lbBorde = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        lbBackgroundAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bAceptar.setBackground(new java.awt.Color(86, 88, 149));
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
        bAceptar.setBounds(130, 170, 140, 35);

        lbAviso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/warning.png"))); // NOI18N
        getContentPane().add(lbAviso);
        lbAviso.setBounds(180, 20, 50, 40);

        lbMensaje.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        lbMensaje.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbMensaje);
        lbMensaje.setBounds(80, 80, 240, 60);

        lbBorde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/blur.png"))); // NOI18N
        lbBorde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 88, 149), 1, true));
        getContentPane().add(lbBorde);
        lbBorde.setBounds(70, 70, 260, 80);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ventana_aviso_morado.jpg"))); // NOI18N
        getContentPane().add(lbFiller);
        lbFiller.setBounds(0, 0, 400, 220);

        lbBackgroundAviso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundAviso);
        lbBackgroundAviso.setBounds(0, 0, 400, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        ControladorVistas.cerrarVentanaAviso();
    }//GEN-LAST:event_bAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(V_Aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Aviso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Aviso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbBackgroundAviso;
    private javax.swing.JLabel lbBorde;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbMensaje;
    // End of variables declaration//GEN-END:variables
}
