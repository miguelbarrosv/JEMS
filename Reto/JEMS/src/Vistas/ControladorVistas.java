/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import UML.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Controlador de las vistas.
 *
 * @author Miguel Barros
 * @author Eric Muñoz
 * @author Sergio Zulueta
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class ControladorVistas {

    /**
     * Creacion de los atributos.
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
    private static V_Lista vLista;
    private static V_CrearLiga vCrearLiga;
    private static V_IntroducirResultado vIntroducirResultado;
    private static V_Aviso vAviso;

    /**
     * Funcion que nos dirije a la ventana V_Login para acceder al sistema.
     *
     */
    public static void mostrarVentanaLogin() {
        vLogin = new V_Login();
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
        vRegistrar = new V_Registrar();
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
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public static void mostrarVentanaJugador(String operacion) throws Exception, SQLException {
        vJugador = new V_Jugador(operacion);
        vJugador.setVisible(true);
    }

    /**
     * Funcion para mostrar ventana con la lista de los jugadores,equipos,dueños
     * o usuarios.
     *
     * @param lista (requerido) lista de todos los jugadores, equipos, dueños o
     * usuarios
     * @param sujeto (requerido) opcion del titulo
     */
    public static void mostrarVentanaLista(String lista, String sujeto) {
        vLista = new V_Lista(lista, sujeto);
        vLista.setVisible(true);
    }

    /**
     * Funcion que nos dirije a la ventana V_Equipo para modificar, borrar o dar
     * de alta a un equipo.
     *
     * @param operacion tipo de operacion
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     *
     */
    public static void mostrarVentanaEquipo(String operacion) throws Exception, SQLException {
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
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public static void mostrarVentanaLiga() throws Exception, SQLException {
        vLiga = new V_Liga();
        vLiga.setVisible(true);
    }

    /**
     * Funcion que muestra la ventana V_Jornadas.
     *
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public static void mostrarVentanaJornadas() throws Exception, SQLException {
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
     * Funcion que cierra la ventana vAdminUsuario.
     *
     */
    public static void cerrarVentanaAdminUsuario() {
        vAdminUsuario.dispose();

    }

    /**
     * Funcion que abre la ventana V_Liga para mostrar la clasificacion de la
     * liga.
     *
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     *
     */
    public static void abrirVentanaLiga() throws Exception, SQLException {
        vLiga = new V_Liga();
        vLiga.setVisible(true);
    }

    /**
     * Funcion que muestra la ventana V_Admin.
     *
     */
    public static void mostrarVentanaAdmin() {
        vAdmin = new V_Admin();
        vAdmin.setVisible(true);
    }

    /**
     * Funcion que cierra la ventana v_Admin.
     *
     */
    public static void cerrarVentanaAdmin() {
        vAdmin.dispose();
    }

    /**
     * Funcion que abre la ventana V_Usuario.
     *
     */
    public static void mostrarVentanaUsuario() {
        vUsuario = new V_Usuario();
        vUsuario.setVisible(true);
    }

    /**
     * Funcion que cierra la ventana V_Login.
     *
     */
    public static void cerrarVentanaUsuario() {
        vUsuario.dispose();
    }

    /**
     * Funcion que abre la ventana V_CrearLiga.
     *
     */
    public static void mostrarVentanaCreacion() {
        vCrearLiga = new V_CrearLiga();
        vCrearLiga.setVisible(true);
    }

    /**
     * Funcion que cierra la ventana V_CrearLiga.
     *
     */
    public static void cerrarVentanaCreacion() {
        vCrearLiga.dispose();
    }

    /**
     * Funcion que abre la ventana V_IntroducirResultado.
     *
     * @param jornadas(requerido) todas las jornadas
     * @param numJornada (requerido) numero de la jornada
     */
    public static void mostrarVentanaResultado(ArrayList<Jornada> jornadas, int numJornada) {
        vIntroducirResultado = new V_IntroducirResultado(jornadas, numJornada);
        vIntroducirResultado.setVisible(true);
    }

    /**
     * Funcion que abre cierra la ventana vIntroducirResultado.
     *
     */
    public static void cerrarVentanaResultado() {
        vIntroducirResultado.dispose();
    }

    /**
     * Funcion que abre la ventana V_Aviso.
     *
     * @param mensaje devuelve un mensaje
     *
     */
    public static void abrirVentanaAviso(String mensaje) {
        vAviso = new V_Aviso(mensaje);
        vAviso.setVisible(true);
    }

    /**
     * Funcion que abre la ventana V_Aviso.
     *
     */
    public static void cerrarVentanaAviso() {
        vAviso.dispose();
    }

    /**
     * Funcion para cerrar la ventana Lista.
     *
     */
    static void cerrarVentanaLista() {
        vLista.dispose();
    }

    /**
     * Funcion para ejecutar la funcion para ver la ventana admin personalizada.
     *
     */
    static void mostrarAdministrarMirar() {
        vAdmin.mostrarAdministrarMirar();
    }

    /**
     * Funcon para poner el estado de la liga en offline.
     *
     */
    static void setLigaOffline() {
        vAdmin.setLigaOffline();
    }
}
