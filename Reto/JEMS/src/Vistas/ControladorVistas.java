/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import jems.JEMS;

/**
 *
 * @author Miguel Barros
 */

public class ControladorVistas {
    /**
 * Creacion de los atributos
 * 
 */
    private static V_Equipo vEquipo;
    private static V_Dueño vDueño;
    private static V_Jugador vJugador;
    private static V_Admin_Usuario vUsuario;
    private static V_Liga vLiga;
    private static V_Jornadas vJornadas;
 /**
 * Funcion que nos dirije a la ventana V_Jugador para modificar, borrar o dar de alta a un jugador
 * 
 */
    public static void mostrarVentanaJugador(String operacion) {
        vJugador = new V_Jugador(operacion);
        vJugador.setVisible(true);
    }
    /**
 * Funcion que nos dirije a la ventana V_Equipo para modificar, borrar o dar de alta a un equipo
 * 
 */
    public static void mostrarVentanaEquipo(String operacion) {
        vEquipo = new V_Equipo(operacion);
        vEquipo.setVisible(true);
    }
    /**
 * Funcion que nos dirije a la ventana V_Dueño para modificar, borrar o dar de alta a un dueño
 * 
 */
    public static void mostrarVentanaDueño(String operacion) {
        vDueño = new V_Dueño(operacion);
        vDueño.setVisible(true);
    }
    /**
 * Funcion que nos dirije a la ventana V_Admin_Usuario para modificar, borrar o dar de alta a un usuario
 * 
 */
    public static void mostrarVentanaUsuario(String operacion) {
        vUsuario = new V_Admin_Usuario(operacion);
        vUsuario.setVisible(true);
    }
    
    public static void mostrarVentanaLiga() {
        vLiga= new V_Liga();
        vUsuario.setVisible(true);
    }
    
    public static void mostrarVentanaJornadas() {
        vJornadas = new V_Jornadas();
        vUsuario.setVisible(true);
    }
    
    public static void cerrarVentanaJornadas() {
        vJornadas.dispose();
    }
    public static void cerrarVentanaLiga() {
        vLiga.dispose();
    }
    /**
 * Funcion que nos dirije a la clase modificacionJugador situado en el controlador pricipal para pasarle los`parametros recogidos de la ventana V_Jugador y asi modificar aun jugador ya existente
 * 
 */
    public static void modificarJugador(String nombre, String apellido, String nick, int sueldo, String nacionalidad, int estado,String telefono, int equipo) {
       JEMS.modificacionJugador(nombre,apellido,nick,sueldo,nacionalidad,estado,telefono,equipo);
    }
    /**
 * Funcion que nos dirije a la clase altaJugador situado en el controlador pricipal para pasarle los`parametros recogidos de la ventana V_Jugador y asi dar de alta a un jugador nuevo
 * 
 */
    public static void altaJugador(String nombre, String apellido, String nick, int sueldo, String nacionalidad, int estado,String telefono, int equipo) {
        JEMS.altaJugador(nombre,apellido,nick,sueldo,nacionalidad,estado,telefono,equipo);
    }
    /**
 * Funcion que nos dirije a la clase bajaJugador situado en el controlador pricipal para pasarle los`parametros recogidos de la ventana V_Jugador y asi dar de baja a un jugador
 * 
 */
    public static void borrarJugador(String codJugador) {
        JEMS.bajaJugador(codJugador);
    }
    /**
 * Funcion que cierra la ventana V_Jugador
 * 
 */
    public static void cerrarVentanaJugador() {
        vJugador.dispose();
    }
    /**
 * Funcion que nos dirije a la clase modificacionEquipo situado en el controlador general para pasarle los parametros de la ventana V_Equipo y asi modificar un equipo 
 * 
 */
    public static void modificarEquipo(String nombre, String nacionalidad, int presupuesto, int puntuacion,int dueño) {
        JEMS.modificacionEquipo(nombre,nacionalidad,presupuesto,puntuacion,dueño);
    }
    /**
 * Funcion que nos dirije a la clase altaEquipo situada en el controlador general para pasarle los parametros de la ventana V_Equipo y asi añadir un equipo nuevo
 * 
 */
    public static void altaEquipo(String nombre, String nacionalidad, int presupuesto, int puntuacion,int dueño) {
         JEMS.altaEquipo(nombre,nacionalidad,presupuesto,puntuacion,dueño);
    }
    
    /**
 * Funcion que nos dirije a la clase borrarEquipo situada en el controlador general para pasarle los parametros de la ventana V_Equipo y asi borrar a un equipo ya existente
 * 
 */
    public static void bajaEquipo(String codJugador){
         JEMS.borrarEquipo(codJugador);
    }
    /**
 * Funcion que cierra la ventana V_Equipo
 * 
 */
    public static void cerrarVentanaEquipo() {
        vEquipo.dispose();
    }
   /**
 * Funcion que nos dirije a la clase modificacionDueño situada en el controlador general para pasarle los parametros de la ventana V_Dueño y asi modificar un dueño ya existente
 * 
 */ 
    public static void modificarDueño(String nombre, String apellido, String telefono) {
         JEMS.modificacionDueño(nombre,apellido,telefono);
    }
    
    /**
 * Funcion que nos dirije a la clase altaDueño situada en el controlador general para pasarle los parametros de la ventana V_Dueño y asi dar de alta a un nuevo dueño
 * 
 */
    public static void altaDueño(String nombre, String apellido, String telefono) {
        JEMS.altaDueño(nombre,apellido,telefono);
    }
    /**
 * Funcion que nos dirije a la clase borrarDueño situada en el controlador general para pasarle los parametros de la ventana V_Dueño y asi borrar a un dueño ya existente
 * 
 */
    public static void bajaDueño(String codDueño) {
        JEMS.borrarDueño(codDueño);
    }
    /**
 * Funcion que cierra la ventana V_Dueño
 * 
 */
    public static void cerrarVentanaDueño() {
        vDueño.dispose();
    }
  /**
 * Funcion que nos dirije a la clase modificacionUsuario situada en el controlador general para pasarle los parametros de la ventana V_Usuario y asi modificar un usuario ya existente
 * 
 */
    public static void modificarUsuario() {
        JEMS.modificacionUsuario();
    }
    /**
 * Funcion que nos dirije a la clase altaUsuario situada en el controlador general para pasarle los parametros de la ventana V_Dueño y asi dar de alta a un nuevo usuario
 * 
 */
    public static void altaUsuario() {
        JEMS.altaUsuario();
    }
    /**
 * Funcion que nos dirije a la clase borrarDueño situada en el controlador general para pasarle los parametros de la ventana V_Usuario y asi borrar a un usuario ya existente
 * 
 */
    public static void bajaUsuario() {
        JEMS.borrarUsuario();
    }
    public static void cerrarVentanaUsuario() {
        vUsuario.dispose();
    }
}
