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
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import jems.JEMS;

/**
 *
 * @author Miguel Barros
 * @author Eric Muñoz
 * @author Joel Encinas
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class V_Admin extends javax.swing.JFrame {

    private int numJornada;
    private ArrayList<Jornada> jornadas;

    /**
     * Creates new form V_Admin
     */
    public V_Admin() {
        setUndecorated(true);
        initComponents();
        myInitComponents();
    }

    /**
     * Metodo para preformatear la ventana especificando tamaño, localizacion
     * dentro de la ventana y otras especificaciones como componentes ocultos.
     */
    public void myInitComponents() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
        tfIntroducirResultadoJornada.setBorder(BorderFactory.createCompoundBorder(
                tfIntroducirResultadoJornada.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        ocultarOpcionesAltaBajaModificarConsultar();
        ocultarCrearEliminar();
        ocultarJornadaClasificacion();
        ocultarIntroducirJornada();       
        bBorrarLiga.setVisible(false);
        bVolverLiga.setVisible(false);
    }

    /**
     * Muestra componentes en la ventana
     *
     */
    public void mostrarOpcionesAltaBajaModificarConsultar() {
        bVolverBase.setVisible(true);
        bAlta.setVisible(true);
        bModificar.setVisible(true);
        bBaja.setVisible(true);
        bConsultarUno.setVisible(true);
        bConsultarMuchos.setVisible(true);
    }

    public void ocultarOpcionesAltaBajaModificarConsultar() {
        bVolverBase.setVisible(false);
        bAlta.setVisible(false);
        bModificar.setVisible(false);
        bBaja.setVisible(false);
        bConsultarUno.setVisible(false);
        bConsultarMuchos.setVisible(false);
    }

    /**
     * Muestra componentes en la ventana
     *
     */
    public void mostrarOpcionesUsuarioDueñoJugadorEquipo() {
        bDueño.setVisible(true);
        bJugador.setVisible(true);
        bEquipo.setVisible(true);
        bUsuario.setVisible(true);
    }

    /**
     * Ocultar componentes en la ventana
     *
     */
    public void ocultarOpcionesUsuarioDueñoJugadorEquipo() {
        bDueño.setVisible(false);
        bJugador.setVisible(false);
        bEquipo.setVisible(false);
        bUsuario.setVisible(false);
    }

    /**
     * Muestra componentes en la ventana
     *
     */
    public void mostrarCrearEliminar() {
        bCrearLiga.setVisible(true);
        bBorrarLiga.setVisible(true);
    }

    /**
     * Ocultar componentes en la ventana
     *
     */
    public void ocultarCrearEliminar() {
        bCrearLiga.setVisible(false);
        bBorrarLiga.setVisible(false);
    }

    /**
     * Muestra componentes en la ventana
     *
     */
    public void mostrarAdministrarMirar() {
        bAdministrarLiga.setVisible(true);
        bMirarLiga.setVisible(true);
    }

    /**
     * Ocultar componentes en la ventana
     *
     */
    public void ocultarAdministrarMirar() {
        bAdministrarLiga.setVisible(false);
        bMirarLiga.setVisible(false);
    }

    /**
     * Muestra componentes en la ventana
     *
     */
    public void mostrarJornadaClasificacion() {
        bJornada.setVisible(true);
        bClasificacion.setVisible(true);
    }

    /**
     * Ocultar componentes en la ventana
     *
     */
    public void ocultarJornadaClasificacion() {
        bJornada.setVisible(false);
        bClasificacion.setVisible(false);
    }

    /**
     * Muestra componentes en la ventana
     *
     */
    public void mostrarIntroducirJornada() {
        bIntroducirResultado.setVisible(true);
        tfIntroducirResultadoJornada.setVisible(true);
        lbIntroducirResultadoJornada.setVisible(true);
    }

    /**
     * Ocultar componentes en la ventana
     *
     */
    public void ocultarIntroducirJornada() {
        bIntroducirResultado.setVisible(false);
        tfIntroducirResultadoJornada.setVisible(false);
        lbIntroducirResultadoJornada.setVisible(false);
    }

    /**
     * Variables para mostrar ventanas dependiendo de los valores
     * en ellas
     *
     */
    private static String operacion;
    private static boolean ligaActivo = false;    
    
    /**
     * Metodo que valida si se han introducido datos
     *
     */
    public boolean validarDatos() {
        if (validarNumero(tfIntroducirResultadoJornada.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que valida si se han introducido datos
     *
     */
    public boolean validarNumero(String nombre) {
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        lbTituloAdmin = new javax.swing.JLabel();
        bEquipo = new javax.swing.JButton();
        bJugador = new javax.swing.JButton();
        bDueño = new javax.swing.JButton();
        bUsuario = new javax.swing.JButton();
        bAlta = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bBaja = new javax.swing.JButton();
        bConsultarUno = new javax.swing.JButton();
        bConsultarMuchos = new javax.swing.JButton();
        bBorrarLiga = new javax.swing.JButton();
        bCrearLiga = new javax.swing.JButton();
        bAdministrarLiga = new javax.swing.JButton();
        bMirarLiga = new javax.swing.JButton();
        bClasificacion = new javax.swing.JButton();
        bJornada = new javax.swing.JButton();
        bIntroducirResultado = new javax.swing.JButton();
        lbIntroducirResultadoJornada = new javax.swing.JLabel();
        tfIntroducirResultadoJornada = new javax.swing.JTextField();
        lbTituloAdmin2 = new javax.swing.JLabel();
        bInsertarPartidos = new javax.swing.JButton();
        lbRiot = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        bVolverBase = new javax.swing.JButton();
        bVolverLiga = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        lbBorde = new javax.swing.JLabel();
        lbBackgroundUsuario = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem15.setText("jMenuItem15");

        jMenuItem16.setText("jMenuItem16");

        jMenuItem10.setText("jMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbTituloAdmin.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        lbTituloAdmin.setForeground(new java.awt.Color(86, 88, 149));
        lbTituloAdmin.setText("<HTML>ADMINISTRAR <BR> BASE DE DATOS</HTML> ");
        lbTituloAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbTituloAdmin);
        lbTituloAdmin.setBounds(80, 30, 300, 90);

        bEquipo.setBackground(new java.awt.Color(86, 88, 149));
        bEquipo.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        bEquipo.setForeground(new java.awt.Color(0, 0, 0));
        bEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/equipo.png"))); // NOI18N
        bEquipo.setText("EQUIPO");
        bEquipo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bEquipo.setBorderPainted(false);
        bEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEquipo.setFocusPainted(false);
        bEquipo.setIconTextGap(45);
        bEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEquipoActionPerformed(evt);
            }
        });
        getContentPane().add(bEquipo);
        bEquipo.setBounds(120, 260, 220, 80);

        bJugador.setBackground(new java.awt.Color(86, 88, 149));
        bJugador.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        bJugador.setForeground(new java.awt.Color(0, 0, 0));
        bJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jugador.png"))); // NOI18N
        bJugador.setText("JUGADOR");
        bJugador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bJugador.setBorderPainted(false);
        bJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bJugador.setFocusPainted(false);
        bJugador.setIconTextGap(20);
        bJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(bJugador);
        bJugador.setBounds(120, 460, 220, 80);

        bDueño.setBackground(new java.awt.Color(86, 88, 149));
        bDueño.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        bDueño.setForeground(new java.awt.Color(0, 0, 0));
        bDueño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/dueño.png"))); // NOI18N
        bDueño.setText("DUEÑO");
        bDueño.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bDueño.setBorderPainted(false);
        bDueño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bDueño.setFocusPainted(false);
        bDueño.setIconTextGap(50);
        bDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDueñoActionPerformed(evt);
            }
        });
        getContentPane().add(bDueño);
        bDueño.setBounds(120, 360, 220, 80);

        bUsuario.setBackground(new java.awt.Color(86, 88, 149));
        bUsuario.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        bUsuario.setForeground(new java.awt.Color(0, 0, 0));
        bUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/usuario.png"))); // NOI18N
        bUsuario.setText("USUARIO");
        bUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bUsuario.setBorderPainted(false);
        bUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bUsuario.setFocusPainted(false);
        bUsuario.setIconTextGap(30);
        bUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(bUsuario);
        bUsuario.setBounds(120, 160, 220, 80);

        bAlta.setBackground(new java.awt.Color(86, 88, 149));
        bAlta.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        bAlta.setForeground(new java.awt.Color(0, 0, 0));
        bAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/añadir.png"))); // NOI18N
        bAlta.setText("AÑADIR");
        bAlta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bAlta.setBorderPainted(false);
        bAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAlta.setFocusPainted(false);
        bAlta.setIconTextGap(35);
        bAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaActionPerformed(evt);
            }
        });
        getContentPane().add(bAlta);
        bAlta.setBounds(90, 150, 290, 80);

        bModificar.setBackground(new java.awt.Color(86, 88, 149));
        bModificar.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        bModificar.setForeground(new java.awt.Color(0, 0, 0));
        bModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/editar.png"))); // NOI18N
        bModificar.setText("EDITAR");
        bModificar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bModificar.setBorderPainted(false);
        bModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bModificar.setFocusPainted(false);
        bModificar.setIconTextGap(40);
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });
        getContentPane().add(bModificar);
        bModificar.setBounds(90, 240, 290, 70);

        bBaja.setBackground(new java.awt.Color(86, 88, 149));
        bBaja.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        bBaja.setForeground(new java.awt.Color(0, 0, 0));
        bBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/eliminar.png"))); // NOI18N
        bBaja.setText("BORRAR");
        bBaja.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bBaja.setBorderPainted(false);
        bBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bBaja.setFocusPainted(false);
        bBaja.setIconTextGap(30);
        bBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBajaActionPerformed(evt);
            }
        });
        getContentPane().add(bBaja);
        bBaja.setBounds(90, 320, 290, 70);

        bConsultarUno.setBackground(new java.awt.Color(86, 88, 149));
        bConsultarUno.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        bConsultarUno.setForeground(new java.awt.Color(0, 0, 0));
        bConsultarUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buscar_uno.png"))); // NOI18N
        bConsultarUno.setText("CONSULTAR UNO");
        bConsultarUno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bConsultarUno.setBorderPainted(false);
        bConsultarUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bConsultarUno.setFocusPainted(false);
        bConsultarUno.setIconTextGap(30);
        bConsultarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarUnoActionPerformed(evt);
            }
        });
        getContentPane().add(bConsultarUno);
        bConsultarUno.setBounds(90, 400, 290, 70);

        bConsultarMuchos.setBackground(new java.awt.Color(86, 88, 149));
        bConsultarMuchos.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        bConsultarMuchos.setForeground(new java.awt.Color(0, 0, 0));
        bConsultarMuchos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/buscar_todos.png"))); // NOI18N
        bConsultarMuchos.setText("CONSULTAR TODOS");
        bConsultarMuchos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bConsultarMuchos.setBorderPainted(false);
        bConsultarMuchos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bConsultarMuchos.setFocusPainted(false);
        bConsultarMuchos.setIconTextGap(10);
        bConsultarMuchos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarMuchosActionPerformed(evt);
            }
        });
        getContentPane().add(bConsultarMuchos);
        bConsultarMuchos.setBounds(90, 480, 290, 70);
        bInsertarPartidos.setText("Insertar Partidos");
        bInsertarPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertarPartidosActionPerformed(evt);
            }
        });
        getContentPane().add(bInsertarPartidos);
        bInsertarPartidos.setBounds(810, 300, 170, 50);

        bBorrarLiga.setBackground(new java.awt.Color(255, 0, 0));
        bBorrarLiga.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bBorrarLiga.setForeground(new java.awt.Color(255, 255, 255));
        bBorrarLiga.setText("ELIMINAR LIGA");
        bBorrarLiga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bBorrarLiga.setBorderPainted(false);
        bBorrarLiga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bBorrarLiga.setFocusPainted(false);
        bBorrarLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarLigaActionPerformed(evt);
            }
        });
        getContentPane().add(bBorrarLiga);
        bBorrarLiga.setBounds(800, 450, 150, 50);

        bCrearLiga.setBackground(new java.awt.Color(252, 124, 0));
        bCrearLiga.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bCrearLiga.setForeground(new java.awt.Color(255, 255, 255));
        bCrearLiga.setText("CREAR LIGA");
        bCrearLiga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bCrearLiga.setBorderPainted(false);
        bCrearLiga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCrearLiga.setFocusPainted(false);
        bCrearLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearLigaActionPerformed(evt);
            }
        });
        getContentPane().add(bCrearLiga);
        bCrearLiga.setBounds(740, 220, 270, 80);

        bAdministrarLiga.setBackground(new java.awt.Color(252, 124, 0));
        bAdministrarLiga.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bAdministrarLiga.setForeground(new java.awt.Color(255, 255, 255));
        bAdministrarLiga.setText("ADMINISTRAR");
        bAdministrarLiga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bAdministrarLiga.setBorderPainted(false);
        bAdministrarLiga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAdministrarLiga.setFocusPainted(false);
        bAdministrarLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdministrarLigaActionPerformed(evt);
            }
        });
        getContentPane().add(bAdministrarLiga);
        bAdministrarLiga.setBounds(750, 380, 250, 70);

        bMirarLiga.setBackground(new java.awt.Color(252, 124, 0));
        bMirarLiga.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bMirarLiga.setForeground(new java.awt.Color(255, 255, 255));
        bMirarLiga.setText("MIRAR");
        bMirarLiga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bMirarLiga.setBorderPainted(false);
        bMirarLiga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bMirarLiga.setFocusPainted(false);
        bMirarLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMirarLigaActionPerformed(evt);
            }
        });
        getContentPane().add(bMirarLiga);
        bMirarLiga.setBounds(750, 250, 250, 70);

        bClasificacion.setBackground(new java.awt.Color(252, 124, 0));
        bClasificacion.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bClasificacion.setForeground(new java.awt.Color(0, 0, 0));
        bClasificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clasificacion.png"))); // NOI18N
        bClasificacion.setText("CLASIFICACION");
        bClasificacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bClasificacion.setBorderPainted(false);
        bClasificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bClasificacion.setFocusPainted(false);
        bClasificacion.setIconTextGap(40);
        bClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClasificacionActionPerformed(evt);
            }
        });
        getContentPane().add(bClasificacion);
        bClasificacion.setBounds(750, 250, 250, 70);

        bJornada.setBackground(new java.awt.Color(252, 124, 0));
        bJornada.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bJornada.setForeground(new java.awt.Color(0, 0, 0));
        bJornada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/versus.png"))); // NOI18N
        bJornada.setText("JORNADAS");
        bJornada.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bJornada.setBorderPainted(false);
        bJornada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bJornada.setFocusPainted(false);
        bJornada.setIconTextGap(70);
        bJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJornadaActionPerformed(evt);
            }
        });
        getContentPane().add(bJornada);
        bJornada.setBounds(750, 380, 250, 70);

        bIntroducirResultado.setBackground(new java.awt.Color(252, 124, 0));
        bIntroducirResultado.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bIntroducirResultado.setForeground(new java.awt.Color(255, 255, 255));
        bIntroducirResultado.setText("IR");
        bIntroducirResultado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bIntroducirResultado.setBorderPainted(false);
        bIntroducirResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bIntroducirResultado.setFocusPainted(false);
        bIntroducirResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIntroducirResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(bIntroducirResultado);
        bIntroducirResultado.setBounds(750, 400, 250, 30);

        lbIntroducirResultadoJornada.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbIntroducirResultadoJornada.setForeground(new java.awt.Color(255, 255, 255));
        lbIntroducirResultadoJornada.setText("<html>Introducir Resultado en<br> la Jornada: [0-10]</html>");
        getContentPane().add(lbIntroducirResultadoJornada);
        lbIntroducirResultadoJornada.setBounds(750, 340, 190, 40);

        tfIntroducirResultadoJornada.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfIntroducirResultadoJornada.setForeground(new java.awt.Color(0, 0, 0));
        tfIntroducirResultadoJornada.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfIntroducirResultadoJornada.setBorder(null);
        getContentPane().add(tfIntroducirResultadoJornada);
        tfIntroducirResultadoJornada.setBounds(960, 350, 20, 30);

        lbTituloAdmin2.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        lbTituloAdmin2.setForeground(new java.awt.Color(252, 124, 0));
        lbTituloAdmin2.setText("LIGA");
        lbTituloAdmin2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbTituloAdmin2);
        lbTituloAdmin2.setBounds(830, 80, 100, 50);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 660, 100, 60);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 670, 180, 40);

        bVolverBase.setBackground(new java.awt.Color(86, 88, 149));
        bVolverBase.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bVolverBase.setForeground(new java.awt.Color(255, 255, 255));
        bVolverBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/volver.png"))); // NOI18N
        bVolverBase.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bVolverBase.setBorderPainted(false);
        bVolverBase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolverBase.setFocusPainted(false);
        bVolverBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverBaseActionPerformed(evt);
            }
        });
        getContentPane().add(bVolverBase);
        bVolverBase.setBounds(200, 580, 50, 40);

        bVolverLiga.setBackground(new java.awt.Color(252, 124, 0));
        bVolverLiga.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bVolverLiga.setForeground(new java.awt.Color(255, 255, 255));
        bVolverLiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/volver.png"))); // NOI18N
        bVolverLiga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bVolverLiga.setBorderPainted(false);
        bVolverLiga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolverLiga.setFocusPainted(false);
        bVolverLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverLigaActionPerformed(evt);
            }
        });
        getContentPane().add(bVolverLiga);
        bVolverLiga.setBounds(840, 530, 60, 40);

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
        lbBorde.setBounds(560, 160, 590, 430);

        lbBackgroundUsuario.setBackground(new java.awt.Color(51, 153, 255));
        lbBackgroundUsuario.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundUsuario);
        lbBackgroundUsuario.setBounds(0, 0, 440, 720);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Nunu.jpg"))); // NOI18N
        getContentPane().add(lbFiller);
        lbFiller.setBounds(0, 0, 1280, 720);
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearLigaActionPerformed
        ControladorVistas.mostrarVentanaCreacion();
        bCrearLiga.setVisible(false);
        bBorrarLiga.setVisible(true);
        mostrarIntroducirJornada();
        ligaActivo = true;
    }//GEN-LAST:event_bCrearLigaActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuarioActionPerformed
        ocultarOpcionesUsuarioDueñoJugadorEquipo();
        mostrarOpcionesAltaBajaModificarConsultar();
        bVolverBase.setVisible(true);
        lbTituloAdmin.setText("USUARIO");
    }//GEN-LAST:event_bUsuarioActionPerformed

    private void bEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEquipoActionPerformed
        ocultarOpcionesUsuarioDueñoJugadorEquipo();
        mostrarOpcionesAltaBajaModificarConsultar();
        bVolverBase.setVisible(true);
        lbTituloAdmin.setText("EQUIPO");
    }//GEN-LAST:event_bEquipoActionPerformed

    private void bDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDueñoActionPerformed
        ocultarOpcionesUsuarioDueñoJugadorEquipo();
        mostrarOpcionesAltaBajaModificarConsultar();
        bVolverBase.setVisible(true);
        lbTituloAdmin.setText("DUEÑO");
    }//GEN-LAST:event_bDueñoActionPerformed

    private void bJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJugadorActionPerformed
        ocultarOpcionesUsuarioDueñoJugadorEquipo();
        mostrarOpcionesAltaBajaModificarConsultar();
        bVolverBase.setVisible(true);
        lbTituloAdmin.setText("JUGADOR");
    }//GEN-LAST:event_bJugadorActionPerformed

    private void bVolverBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverBaseActionPerformed
        mostrarOpcionesUsuarioDueñoJugadorEquipo();
        ocultarOpcionesAltaBajaModificarConsultar();
        bVolverBase.setVisible(false);
        lbTituloAdmin.setText("<HTML>ADMINISTRAR <BR> BASE DE DATOS</HTML>");
    }//GEN-LAST:event_bVolverBaseActionPerformed

    private void bAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaActionPerformed
        if (lbTituloAdmin.getText().equalsIgnoreCase("USUARIO")) {
            operacion = "alta";
            ControladorVistas.mostrarVentanaAdminUsuario(operacion);
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("JUGADOR")) {
            try {
                operacion = "alta";
                ControladorVistas.mostrarVentanaJugador(operacion);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("EQUIPO")) {
            try {
                operacion = "alta";
                ControladorVistas.mostrarVentanaEquipo(operacion);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("DUEÑO")) {
            operacion = "alta";
            ControladorVistas.mostrarVentanaDueño(operacion);
        }

    }//GEN-LAST:event_bAltaActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        if (lbTituloAdmin.getText().equalsIgnoreCase("USUARIO")) {
            operacion = "modificar";
            ControladorVistas.mostrarVentanaAdminUsuario(operacion);
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("JUGADOR")) {
            try {
                operacion = "modificar";
                ControladorVistas.mostrarVentanaJugador(operacion);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("EQUIPO")) {
            try {
                operacion = "modificar";
                ControladorVistas.mostrarVentanaEquipo(operacion);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("DUEÑO")) {
            operacion = "modificar";
            ControladorVistas.mostrarVentanaDueño(operacion);
        }
    }//GEN-LAST:event_bModificarActionPerformed

    private void bBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBajaActionPerformed
        if (lbTituloAdmin.getText().equalsIgnoreCase("USUARIO")) {
            operacion = "baja";
            ControladorVistas.mostrarVentanaAdminUsuario(operacion);
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("JUGADOR")) {
            try {
                operacion = "baja";
                ControladorVistas.mostrarVentanaJugador(operacion);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("EQUIPO")) {
            try {
                operacion = "baja";
                ControladorVistas.mostrarVentanaEquipo(operacion);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("DUEÑO")) {
            operacion = "baja";
            ControladorVistas.mostrarVentanaDueño(operacion);
        }
    }//GEN-LAST:event_bBajaActionPerformed

    private void bConsultarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarUnoActionPerformed
        if (lbTituloAdmin.getText().equalsIgnoreCase("USUARIO")) {
            operacion = "consulta";
            ControladorVistas.mostrarVentanaAdminUsuario(operacion);
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("JUGADOR")) {
            try {
                operacion = "consulta";
                ControladorVistas.mostrarVentanaJugador(operacion);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("EQUIPO")) {
            try {
                operacion = "consulta";
                ControladorVistas.mostrarVentanaEquipo(operacion);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("DUEÑO")) {
            operacion = "consulta";
            ControladorVistas.mostrarVentanaDueño(operacion);
        }
    }//GEN-LAST:event_bConsultarUnoActionPerformed

    private void bConsultarMuchosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarMuchosActionPerformed
        if (lbTituloAdmin.getText().equalsIgnoreCase("USUARIO")) {
            try {
                String listaUsuarios = JEMS.crearListaUsuarios();
                ControladorVistas.mostrarVentanaLista(listaUsuarios);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("JUGADOR")) {
            try {
                String listaJugadores = JEMS.crearListaJugadores();
                ControladorVistas.mostrarVentanaLista(listaJugadores);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("EQUIPO")) {
            try {
                String listaEquipos = JEMS.crearListaEquipos();
                ControladorVistas.mostrarVentanaLista(listaEquipos);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        } else if (lbTituloAdmin.getText().equalsIgnoreCase("DUEÑO")) {
            try {
                String listaDueños = JEMS.crearListaDueños();
                ControladorVistas.mostrarVentanaLista(listaDueños);
            } catch (Exception e) {
                ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
            }
        }
    }//GEN-LAST:event_bConsultarMuchosActionPerformed

    private void bClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClasificacionActionPerformed
        try {
            ControladorVistas.mostrarVentanaLiga();
        } catch (Exception ex) {
            ControladorVistas.abrirVentanaAviso("Error: " + ex.getClass());
        }
    }//GEN-LAST:event_bClasificacionActionPerformed

    private void bJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJornadaActionPerformed
        try {
            ControladorVistas.mostrarVentanaJornadas();
        } catch (Exception e) {
            ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
        }
    }//GEN-LAST:event_bJornadaActionPerformed

    private void bBorrarLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarLigaActionPerformed
        ligaActivo = false;
    }//GEN-LAST:event_bBorrarLigaActionPerformed

    private void bAdministrarLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdministrarLigaActionPerformed
        ocultarAdministrarMirar();
        bVolverLiga.setVisible(true);    
        if(ligaActivo) {
            bCrearLiga.setVisible(false);
            bBorrarLiga.setVisible(true);
            mostrarIntroducirJornada();
        } else if (!ligaActivo) {
            bCrearLiga.setVisible(true);
            bBorrarLiga.setVisible(false);
            ocultarIntroducirJornada();
        }
    }//GEN-LAST:event_bAdministrarLigaActionPerformed

    private void bMirarLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMirarLigaActionPerformed
        ocultarAdministrarMirar();
        bVolverLiga.setVisible(true);
        mostrarJornadaClasificacion();
    }//GEN-LAST:event_bMirarLigaActionPerformed

    private void bVolverLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverLigaActionPerformed
        mostrarAdministrarMirar();
        ocultarJornadaClasificacion();
        ocultarCrearEliminar();
        ocultarIntroducirJornada();
        bVolverLiga.setVisible(false);
    }//GEN-LAST:event_bVolverLigaActionPerformed

    private void bIntroducirResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIntroducirResultadoActionPerformed
        String valorJornada = tfIntroducirResultadoJornada.getText().toString();
        switch (valorJornada) {
            case "1":
                try {
                    jornadas = new ArrayList<>();
                    jornadas = JEMS.buscarJornadas();
                    numJornada = 1;
                    ControladorVistas.mostrarVentanaResultado(jornadas, numJornada);
                } catch (Exception e) {
                    ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
                }
                break;
            case "2":
                try {
                    jornadas = new ArrayList<>();
                    jornadas = JEMS.buscarJornadas();
                    numJornada = 2;
                    ControladorVistas.mostrarVentanaResultado(jornadas, numJornada);
                } catch (Exception e) {
                    ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
                }
                break;
            case "3":
                try {
                    jornadas = new ArrayList<>();
                    jornadas = JEMS.buscarJornadas();
                    numJornada = 3;
                    ControladorVistas.mostrarVentanaResultado(jornadas, numJornada);
                } catch (Exception e) {
                    ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
                }
                break;
            case "4":
                try {
                    jornadas = new ArrayList<>();
                    jornadas = JEMS.buscarJornadas();
                    numJornada = 4;
                    ControladorVistas.mostrarVentanaResultado(jornadas, numJornada);
                } catch (Exception e) {
                    ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
                }
                break;
            case "5":
                try {
                    jornadas = new ArrayList<>();
                    jornadas = JEMS.buscarJornadas();
                    numJornada = 5;
                    ControladorVistas.mostrarVentanaResultado(jornadas, numJornada);
                } catch (Exception e) {
                    ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
                }
                break;
            case "6":
                try {
                    jornadas = new ArrayList<>();
                    jornadas = JEMS.buscarJornadas();
                    numJornada = 6;
                    ControladorVistas.mostrarVentanaResultado(jornadas, numJornada);
                } catch (Exception e) {
                    ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
                }
                break;
            case "7":
                try {
                    jornadas = new ArrayList<>();
                    jornadas = JEMS.buscarJornadas();
                    numJornada = 7;
                    ControladorVistas.mostrarVentanaResultado(jornadas, numJornada);
                } catch (Exception e) {
                    ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
                }
                break;
            case "8":
                try {
                    jornadas = new ArrayList<>();
                    jornadas = JEMS.buscarJornadas();
                    numJornada = 8;
                    ControladorVistas.mostrarVentanaResultado(jornadas, numJornada);
                } catch (Exception e) {
                    ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
                }
                break;
            case "9":
                try {
                    jornadas = new ArrayList<>();
                    jornadas = JEMS.buscarJornadas();
                    numJornada = 9;
                    ControladorVistas.mostrarVentanaResultado(jornadas, numJornada);
                } catch (Exception e) {
                    ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
                }
                break;
            case "10":
                try {
                    jornadas = new ArrayList<>();
                    jornadas = JEMS.buscarJornadas();
                    numJornada = 10;
                    ControladorVistas.mostrarVentanaResultado(jornadas, numJornada);
                } catch (Exception e) {
                    ControladorVistas.abrirVentanaAviso("Error: " + e.getClass());
                }
                break;
        }
    }//GEN-LAST:event_bIntroducirResultadoActionPerformed
    private void bInsertarPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertarPartidosActionPerformed
        try {
            JEMS.insertarEquipos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_bInsertarPartidosActionPerformed

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
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdministrarLiga;
    private javax.swing.JButton bAlta;
    private javax.swing.JButton bBaja;
    private javax.swing.JButton bBorrarLiga;
    private javax.swing.JButton bClasificacion;
    private javax.swing.JButton bConsultarMuchos;
    private javax.swing.JButton bConsultarUno;
    private javax.swing.JButton bCrearLiga;
    private javax.swing.JButton bDueño;
    private javax.swing.JButton bEquipo;
    private javax.swing.JButton bIntroducirResultado;
    private javax.swing.JButton bJornada;
    private javax.swing.JButton bInsertarPartidos;
    private javax.swing.JButton bJugador;
    private javax.swing.JButton bMirarLiga;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bUsuario;
    private javax.swing.JButton bVolverBase;
    private javax.swing.JButton bVolverLiga;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JLabel lbBackgroundUsuario;
    private javax.swing.JLabel lbBorde;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbIntroducirResultadoJornada;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbTituloAdmin;
    private javax.swing.JLabel lbTituloAdmin2;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JTextField tfIntroducirResultadoJornada;
    // End of variables declaration//GEN-END:variables
}
