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
    private static ArrayList<Dueño> dueños ;
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
    public static void mostrarVentanaEquipo(String operacion) throws Exception {
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
    /**
 * Funcion que muestra la ventana V_Liga
 * 
 */
    public static void mostrarVentanaLiga() {
        vLiga= new V_Liga();
        vUsuario.setVisible(true);
    }
    /**
 * Funcion que muestra la ventana V_Jornadas
 * 
 */
    public static void mostrarVentanaJornadas() {
        vJornadas = new V_Jornadas();
        vUsuario.setVisible(true);
    }
    /**
 * Funcion que cierra la ventana vJornadas
 * 
 */
    public static void cerrarVentanaJornadas() {
        vJornadas.dispose();
    }
    /**
 * Funcion que cierra la ventana vLiga
 * 
 */
    public static void cerrarVentanaLiga() {
        vLiga.dispose();
    }
    
    /**
 * Funcion que cierra la ventana V_Jugador
 * 
 */
    public static void cerrarVentanaJugador() {
        vJugador.dispose();
    }
    
    /**
 * Funcion que cierra la ventana V_Equipo
 * 
 */
    public static void cerrarVentanaEquipo() {
        vEquipo.dispose();
    }
    /**
 * Funcion que cierra la ventana V_Dueño
 * 
 */
    public static void cerrarVentanaDueño() {
        vDueño.dispose();
    }
  
    /**
 * Funcion que cierra la ventana vUsuario
 * 
 */
    public static void cerrarVentanaUsuario() {
        vUsuario.dispose();
    }
    /**
 * Funcion que abre la ventana V_Liga para mostrar la clasificacion de la liga
 * 
 */
    public static void abrirVentanaLiga(Liga liga,ArrayList<Equipo>equipos) {
        vLiga = new V_Liga(liga,equipos);
        vLiga.setVisible(true);
    }
}
