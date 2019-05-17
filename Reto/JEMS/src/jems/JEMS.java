/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jems;

/**
 * Controladora de nuestro proyecto JEMS
 * https://www.oracle.com/technetwork/articles/java/index-137868.html
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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        v.setVisible(true);
        
    }
    public static void altaJugador(String nombre, String apellido, String nick, int sueldo, String nacionalidad, String estado,String telefono, int equipo)throws Exception
    {
        JugadorBD jBD = new JugadorBD();
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
    
}
