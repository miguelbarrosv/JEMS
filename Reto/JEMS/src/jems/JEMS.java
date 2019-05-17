/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jems;

/**
 * Controladora de nuestro proyecto JEMS
 * https://www.oracle.com/technetwork/articles/java/index-137868.html
 *
 * @author Sergio Zulueta
 * @author Miguel Barros
 * @author Joel Encinas
 * @author Eric Muñoz
 *
 * @see JEMS
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
import Vistas.*;
import BD.*;
import UML.*;
import java.util.ArrayList;

public class JEMS {

    static V_Registrar v = new V_Registrar();
    private static ArrayList<Equipo> listaEquipos;
    
    private static DueñoBD dBD;
    private static JugadorBD jBD;
    private static EquipoBD eBD;
    private static UsuarioBD uBD;

    private V_Registrar v = new V_Registrar();
    private static ArrayList<Dueño> dueños;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dBD = new DueñoBD();
        jBD = new JugadorBD();
        eBD = new EquipoBD();
        dBD = new DueñoBD();
        uBD = new UsuarioBD();
        v.setVisible(true);

    }

    /**
     * Funcion que nos dirije a la clase altaJugador situado en JugadorBD para
     * pasarle los`parametros recogidos de la ventana V_Jugador y asi dar de
     * alta a un jugador nuevo
     *
     */
    public static void altaJugador(String nombre, String apellido, String nick, int sueldo, String nacionalidad, String estado, String telefono, int equipo) throws Exception {
        Jugador j = new Jugador();
        j.setNombre(nombre);
        j.setApellido(apellido);
        j.setNickname(nick);
        j.setSueldo(sueldo);
        j.setNacionalidad(nacionalidad);
        j.setEstado(estado);
        j.setTelefono(telefono);
        j.setEquipo(equipo);
        jBD.insertarJugador(j);
    }
    public static int getNumeroEquipos()
    {
        return listaEquipos.size();
    }
    public static String getNombreEquipo(int x)
    {
        return listaEquipos.get(x).getNombre();
    }

    public static ArrayList<Equipo> rellenarListaEquipos()throws Exception {
        EquipoBD e= new EquipoBD();
        listaEquipos= e.consultaEquipos();
        return listaEquipos;
    }
    
    public static ArrayList<Dueño> getListaDueños() throws Exception {
        dueños = new ArrayList<Dueño>();
        dueños = dBD.consultaTodosDueños();
        return dueños;
    }

    /**
     * Funcion que nos dirije a la clase modificacionJugador situado en
     * JugadorBD para pasarle los`parametros recogidos de la ventana V_Jugador y
     * asi modificar aun jugador ya existente
     *
     */
    public static void modificarJugador(String nombre, String apellido, String nick, int sueldo, String nacionalidad, String estado, String telefono, int equipo) throws Exception {
        Jugador j = new Jugador();
        j.setNombre(nombre);
        j.setApellido(apellido);
        j.setNickname(nick);
        j.setSueldo(sueldo);
        j.setNacionalidad(nacionalidad);
        j.setEstado(estado);
        j.setTelefono(telefono);
        j.setEquipo(equipo);
        jBD.modificarJugador(j);
    }

    /**
     * Funcion que nos dirije a la clase bajaJugador situado en JugadorBD para
     * pasarle los`parametros recogidos de la ventana V_Jugador y asi dar de
     * baja a un jugador
     *
     */
    public static void borrarJugador(String codJugador) throws Exception {
        jBD.borrarJugador(codJugador);
    }

    /**
     * Funcion que nos dirije a la clase modificacionEquipo situado en EquipoBD
     * para pasarle los parametros de la ventana V_Equipo y asi modificar un
     * equipo
     *
     */
    public static void modificarEquipo(String nombre, String nacionalidad, int presupuesto, int puntuacion, int dueño) {
        Dueño d = new Dueño();
        d = dBD.consultarDueño(dueño);
        Equipo e = new Equipo(nombre, nacionalidad, presupuesto, puntuacion, d);
        eBD.modificacionEquipo();
    }

    /**
     * Funcion que nos dirije a la clase altaEquipo situada en EquipoBDl para
     * pasarle los parametros de la ventana V_Equipo y asi añadir un equipo
     * nuevo
     *
     */
    public static void altaEquipo(String nombre, String nacionalidad, int presupuesto, int puntuacion, int dueño) {
        eBD.altaEquipo(nombre, nacionalidad, presupuesto, puntuacion, dueño);
    }

    /**
     * Funcion que nos dirije a la clase borrarEquipo situada en EquipoBD para
     * pasarle los parametros de la ventana V_Equipo y asi borrar a un equipo ya
     * existente
     *
     */
    public static void bajaEquipo(String codJugador) {
        eBD.borrarEquipo(codJugador);
    }

    /**
     * Funcion que nos dirije a la clase modificacionDueño situada en DueñoBD
     * para pasarle los parametros de la ventana V_Dueño y asi modificar un
     * dueño ya existente
     *
     */
    public static void modificarDueño(String nombre, String apellido, String telefono) {
        dBD.modificacionDueño(nombre, apellido, telefono);
    }

    /**
     * Funcion que nos dirije a la clase altaDueño situada en DueñoBD para
     * pasarle los parametros de la ventana V_Dueño y asi dar de alta a un nuevo
     * dueño
     *
     */
    public static void altaDueño(String nombre, String apellido, String telefono) {
        dBD.altaDueño(nombre, apellido, telefono);
    }

    /**
     * Funcion que nos dirije a la clase borrarDueño situada en DueñoBD para
     * pasarle los parametros de la ventana V_Dueño y asi borrar a un dueño ya
     * existente
     *
     */
    public static void bajaDueño(String codDueño) {
        dBD.borrarDueño(codDueño);
    }

    /**
     * Funcion que nos dirije a la clase modificacionUsuario situada en
     * UsuarioBD para pasarle los parametros de la ventana V_Usuario y asi
     * modificar un usuario ya existente
     *
     */
    public static void modificarUsuario(String usuario, String contraseña) {
        uBD.modificacionUsuario(usuario, contraseña);
    }

    /**
     * Funcion que nos dirije a la clase altaUsuario situada en UsuarioBD para
     * pasarle los parametros de la ventana V_Dueño y asi dar de alta a un nuevo
     * usuario
     *
     */
    public static void altaUsuario(String usuario, String contraseña) {
        uBD.altaUsuario(usuario, contraseña);
    }

    /**
     * Funcion que nos dirije a la clase borrarUsuario situada en UsuarioBD para
     * pasarle los parametros de la ventana V_Usuario y asi borrar a un usuario
     * ya existente
     *
     */
    public static void bajaUsuario(String codUsuario) {
        uBD.borrarUsuario(codUsuario);
    }    
    public static ArrayList<Usuario> conseguirDatosUsuarios() throws Exception {
        UsuarioBD ubd = new UsuarioBD();
        ArrayList<Usuario> listaUsuariosTemp = ubd.consultaTodosUsuarios();
        return listaUsuariosTemp;
    }  

}
