/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

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
    private static V_Usuario vUsuario;
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
 * Funcion que nos dirije a la ventana V_Usuario para modificar, borrar o dar de alta a un usuario
 * 
 */
    public static void mostrarVentanaUsuario(String operacion) {
        vUsuario = new V_Usuario(operacion);
        vUsuario.setVisible(true);
    }
    
    public void modificarJugador() {
       
    }
    /**
 * Funcion que nos dirije a la ventana V_Jugador para añadir a un jugador nuevo
 * 
 */
    public void altaJugador() {
        
    }
    /**
 * Funcion que nos dirije a la ventana V_Jugador para borrar a un Jugador
 * 
 */
    public void borrarJugador() {
        
    }
    /**
 * Funcion que nos dirije a la ventana V_Equipo para modificar su informacion
 * 
 */
    public void modificarEquipo() {
        
    }
    /**
 * Funcion que nos dirije a la ventana V_Equipo para añadir a un nuevo equipo
 * 
 */
    public void altaEquipo() {
         
    }
    /**
 * Funcion que nos dirije a la ventana V_Equipo para borrar a un equipo
 * 
 */
    public void borrarEquipo(){
         
    }
   /**
 * Funcion que nos dirije a la ventana V_Dueño para modificar a un Dueño
 * 
 */ 
    public void modificarDueño() {
         
    }
    /**
 * Funcion que nos dirije a la ventana V_Dueño para añadir a un nuevo dueño
 * 
 */
    public void altaDueño() {
        
    }
    /**
 * Funcion que nos dirije a la ventana V_Dueño para borrar a un dueño
 * 
 */
    public void borrarDueño() {
        
    }
  /**
 * Funcion que nos dirije a la ventana V_Usuario para modificar un usuario
 * 
 */
    public void modificarUsuario() {
        
    }
    /**
 * Funcion que nos dirije a la ventana V_Usuario para añadir un nuevo usuario
 * 
 */
    public void altaUsuario() {
        
    }
    /**
 * Funcion que nos dirije a la ventana V_Usuario para borrar a un usuario
 * 
 */
    public void borrarUsuario() {
        
    }
}
