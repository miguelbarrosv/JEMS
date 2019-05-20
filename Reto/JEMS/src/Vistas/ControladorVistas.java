/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import UML.*;
import java.util.ArrayList;

/**
 *
 * @author Miguel Barros
 * @author Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class ControladorVistas {

    /**
     * Creacion de los atributos
     *
     */
    private static V_Login vLogin;
    private static V_Registrar vRegistrar;
    private static V_Equipo vEquipo;
    private static V_Dueño vDueño;
    private static V_Jugador vJugador;
    private static V_Admin_Usuario vAdminUsuario;
    private static V_Liga vLiga;
    private static V_Jornadas vJornadas; 
    private static V_Admin vAdmin;
    private static V_Usuario vUsuario;
    private static V_Mostrar vMostrar;
    private static V_Mostrar_Jugador vMostrarJugador;
    private static V_Mostrar_Equipo vMostrarEquipo;
    private static V_Mostrar_Dueño vMostrarDueño;
    private static V_Lista vLista;
    
 /**
 * Funcion que nos dirije a la ventana V_Login para acceder al sistema
 * 
 */
    public static void mostrarVentanaLogin() {
        vLogin.setVisible(true);
    }

    /**
     * Funcion que cierra la ventana V_Login.
     *
     */
    public static void cerrarVentanaLogin() {
        vLogin.dispose();
    }

    /**
     * Funcion que nos dirije a la ventana V_Registrar para crear una nueva
     * cuenta.
     *
     */
    public static void mostrarVentanaRegistrar() {
        vRegistrar.setVisible(true);
    }

    /**
     * Funcion que cierra la ventana V_Registrar.
     *
     */
    public static void cerrarVentanaRegistrar() {
        vRegistrar.dispose();
    }

    /**
     * Funcion que nos dirije a la ventana V_Jugador para modificar, borrar o
     * dar de alta a un jugador.
     *
     * @param operacion tipo de operacion
     */
    public static void mostrarVentanaJugador(String operacion) {
        vJugador = new V_Jugador(operacion);
        vJugador.setVisible(true);
    }

    /**
     * Funcion para mostrar ventana con la lista de los jugadores,equipos,dueños
     * o usuarios.
     *
     * @param lista lista de todos los jugadores, equipos, dueños o usuarios
     */
    public static void mostrarVentanaLista(String lista) {
        vLista = new V_Lista(lista);
        vLista.setVisible(true);
    }

    /**
     * Funcion que nos dirije a la ventana V_Equipo para modificar, borrar o dar
     * de alta a un equipo.
     *
     * @param operacion tipo de operacion
     */
    public static void mostrarVentanaEquipo(String operacion) throws Exception {
        vEquipo = new V_Equipo(operacion);
        vEquipo.setVisible(true);
    }

    /**
     * Funcion que nos dirije a la ventana V_Dueño para modificar, borrar o dar
     * de alta a un dueño.
     *
     * @param operacion tipo de operacion
     */
    public static void mostrarVentanaDueño(String operacion) {
        vDueño = new V_Dueño(operacion);
        vDueño.setVisible(true);
    }

    /**
     * Funcion que nos dirije a la ventana V_Admin_Usuario para modificar,
     * borrar o dar de alta a un usuario.
     *
     * @param operacion tipo de operacion
     */
    public static void mostrarVentanaAdminUsuario(String operacion) {

        vAdminUsuario = new V_Admin_Usuario(operacion);
        vAdminUsuario.setVisible(true);
    }

    /**
     * Funcion que muestra la ventana V_Liga.
     *
     */
    public static void mostrarVentanaLiga() {
        vLiga= new V_Liga();
        vLiga.setVisible(true);
    }

    /**
     * Funcion que muestra la ventana V_Jornadas.
     *
     */
    public static void mostrarVentanaJornadas() {
        vJornadas = new V_Jornadas();
        vJornadas.setVisible(true);
    }

    /**
     * Funcion que cierra la ventana vJornadas.
     *
     */
    public static void cerrarVentanaJornadas() {
        vJornadas.dispose();
    }

    /**
     * Funcion que cierra la ventana vLiga.
     *
     */
    public static void cerrarVentanaLiga() {
        vLiga.dispose();
    }

    /**
     * Funcion que cierra la ventana V_Jugador.
     *
     */
    public static void cerrarVentanaJugador() {
        vJugador.dispose();
    }

    /**
     * Funcion que cierra la ventana V_Equipo.
     *
     */
    public static void cerrarVentanaEquipo() {
        vEquipo.dispose();
    }

    /**
     * Funcion que cierra la ventana V_Dueño.
     *
     */
    public static void cerrarVentanaDueño() {
        vDueño.dispose();
    }

    /**

 * Funcion que cierra la ventana vAdminUsuario
 * 
 */
    public static void cerrarVentanaAdminUsuario() {
        vAdminUsuario.dispose();

    }

    /**
     * Funcion que abre la ventana V_Liga para mostrar la clasificacion de la
     * liga.
     *
     * @param liga (requerido) la liga
     * @param equipos (requerido) lista de equipos
     */
    public static void abrirVentanaLiga(Liga liga, ArrayList<Equipo> equipos) {
        vLiga = new V_Liga(liga, equipos);
        vLiga.setVisible(true);
    }
    
        /**
 * Funcion que muestra la ventana V_Admin
 * 
 */
    public static void mostrarVentanaAdmin() {
        vAdmin = new V_Admin();
        vAdmin.setVisible(true);
    }
    /**
 * Funcion que cierra la ventana v_Admin
 * 
 */
    public static void cerrarVentanaAdmin() {
        vAdmin.dispose();
    }
    /**
 * Funcion que abre la ventana V_Usuario
 * 
 */
    public static void mostrarVentanaUsuario() {
        vUsuario.setVisible(true);
    }
    /**
 * Funcion que cierra la ventana V_Login
 * 
 */
    public static void cerrarVentanaUsuario() {
        vUsuario.dispose();
    } 
     /**
 * Funcion que nos dirije a la ventana V_Mostrar para seleccionar que queremos mostrar
 * 
 */
    public static void mostrarVentanaMostrar() {
        vMostrar.setVisible(true);
    }
    /**
 * Funcion que cierra la ventana V_Mostrar
 * 
 */
    public static void cerrarVentanaMostrar() {
        vMostrar.dispose();
    }  
        /**
 * Funcion que abre la ventana V_Jugador
 * 
 */
    public static void mostrarVentanaMostrarJugador() {
        vMostrarJugador.setVisible(true);
    }
    /**
 * Funcion que cierra la ventana V_Jugador
 * 
 */
    public static void cerrarVentanaMostrarJugador() {
        vMostrarJugador.dispose();
    } 
        /**
 * Funcion que abre la ventana V_MostrarEquipo
 * 
 */
    public static void mostrarVentanaMostrarEquipo() {
        vMostrarEquipo.setVisible(true);
    }
    /**
 * Funcion que cierra la ventana V_MostrarEquipo
 * 
 */
    public static void cerrarVentanaMostrarEquipo() {
        vMostrarEquipo.dispose();
    } 
        /**
 * Funcion que abre la ventana V_MostrarDueño
 * 
 */
    public static void mostrarVentanaMostrarDueño() {
        vMostrarDueño.setVisible(true);
    }
    /**
 * Funcion que cierra la ventana V_MostrarDueño
 * 
 */
    public static void cerrarVentanaMostrarDueño() {
        vMostrarDueño.dispose();
    } 
    
}
