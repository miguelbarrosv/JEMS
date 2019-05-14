/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Jugador; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase de jugador de base de datos
 *
 * @author Joel Encinas
 * @author Eric Muñoz
 *
 * 
 * @version %I%, %G%
 * @since 1.0
 * 
 * 
 * 
 */
public class JugadorBD {
    
    /**
     * Creacion de los atributos j, resultado, ps y bdr.
     */
    private static Jugador j;   
    private static ResultSet resultado;
    private PreparedStatement ps;
    private static Bdr bdr;
    /**
     * Constructor de JugadorBD con el objeto de la conexión a la base de datos.
     * 
     * 
     */
    public JugadorBD(){
        bdr = new Bdr();
    }
    
    /**
     * Función para inserttar jugador.
     * 
     * @param j (requerido) objeto de clase jugador.
     * @throws Exception hereda excepciones.
     */    
    public void insertarJugador(Jugador j)throws Exception{
        bdr.conectar();
        String plantilla = "INSERT INTO JUGADOR(NOMBRE,APELLIDO,NICKNAME,SUELDO,NACIONALIDAD,ESTADO,TELEFONO,EQUIPO_COD_EQUIPO) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,j.getNombre());
        sentenciaPre.setString(2,j.getApellido());
        sentenciaPre.setString(3,j.getNickname());
        sentenciaPre.setString(4,j.getSueldo()+"");
        sentenciaPre.setString(5,j.getNacionalidad());
        sentenciaPre.setString(6,j.getEstado());
        sentenciaPre.setString(7,j.getTelefono());
        sentenciaPre.setString(8,j.getEquipo().getCod_equipo()+"");
        bdr.cerrarCon();
    }
    
    /**
     * Funcion que busca un jugador en la base de datos.
     * 
     * @param j (requerido) objeto de clase jugador.
     * @return devuelve un objeto clase jugador.
     * @throws Exception hewreda excepciones. 
     */    
    public Jugador consultarJugador(Jugador j) throws Exception
    {
        bdr.conectar();
        
        String plantilla = "SELECT * FROM JUGADOR WHERE COD_JUGADOR= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,j.getCod_jugador()+"");
      
        resultado = sentenciaPre.executeQuery();
        if (resultado.next())
            j = crearObjeto();
        else
            j = null;       

        bdr.cerrarCon();
        return j;
    }
    
    /**
     * Funcion que rellena un objeto jugador desde los datos de la base de datos.
     * 
     * @return devuelve un objeto jugador.
     * @throws Exception herada excepciones.
     */
    public Jugador crearObjeto() throws Exception{
        Jugador j = new Jugador();
        
        j.setNombre(resultado.getString("NOMBRE"));
        j.setApellido(resultado.getString("APELLIDO"));
        j.setNickname(resultado.getString("NICKNAME"));
        j.setSueldo(Integer.parseInt(resultado.getString("SUELDO")));
        j.setNacionalidad(resultado.getString("NACIONALIDAD"));
        j.setEstado(resultado.getString("ESTADO"));
        j.setTelefono(resultado.getString("TELEFONO"));
        int cod_equipo=Integer.parseInt(resultado.getString("EQUIPO_COD_EQUIPO"));
        
        j.setEquipo(resultado.getString("EQUIPO_COD_EQUIPO"));
        
        return j;
    }
    
    /**
     * Funcion que crea un ArrayList con todos los jugadores de la base de datos.
     * 
     * @return devuelve un ArrayList de jugdaores.
     * @throws Exception hereda excepciones.
     */
    public ArrayList<Jugador> consultaTodoSJugadores() throws Exception
    {
        ArrayList<Jugador> listaJugadores = new ArrayList();
        
        bdr.conectar();
        
        Statement sentencia=bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT * FROM JUGADOR");
        while (resultado.next())
            listaJugadores.add(crearObjeto());
              
        // Cerrar la conexión
        bdr.cerrarCon();
        return listaJugadores;
    }
    
    /**
     * Funcion que borra un jugador de la base de datos.
     * 
     * @param j (requerido) objeto de clase jugador.
     * @throws Exception hereda excepciones.
     */
    public void borrarJugador(Jugador j) throws Exception
    {
        bdr.conectar();
        
        String plantilla = "DELETE FROM JUGADOR WHERE COD_JUGADOR= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,j.getCod_jugador()+"");
      
        sentenciaPre.executeUpdate();
       
        bdr.cerrarCon();
    }
    
    public void modificarJugador(Jugador j) throws Exception
    {
        // abro conexión, ejecuto y cierro
        bdr.conectar();
        
        String plantilla = "UPDATE JUGADOR SET NOMBRE=?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,a.getDni());
        sentenciaPre.setString(2,a.getNombre());
        sentenciaPre.setString(3, a.getApellidos());
        sentenciaPre.setString(4, a.getDireccion());
        sentenciaPre.setString(5,a.getDni());
       
        sentenciaPre.executeUpdate();
              
        // Cerrar la conexión
        bdr.cerrarCon();
    }
    
}
