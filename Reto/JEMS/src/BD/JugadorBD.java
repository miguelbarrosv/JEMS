/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Equipo;
import UML.Jugador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase de Jugador de base de datos.
 *
 * @author Joel Encinas
 * @author Eric Muñoz
 * @author Sergio Zulueta
 *
 * @see Jugador
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class JugadorBD {

    /**
     * Creacion de los atributos resultado y bdr.
     *
     */
    private ResultSet resultado;
    private static Bdr bdr;

    /**
     * Constructor de JugadorBD con el objeto de la conexión a la base de datos.
     *
     */
    public JugadorBD() {
        bdr = new Bdr();
    }

    /**
     * Función para insertar Jugador.
     *
     * @param j (requerido) objeto de clase Jugador.
     * @throws Exception hereda excepciones.
     */
    public void insertarJugador(Jugador j) throws Exception {
        bdr.conectar();
        String plantilla = "INSERT INTO JUGADOR(NOMBRE,APELLIDO,NICKNAME,SUELDO,NACIONALIDAD,ESTADO,TELEFONO,EQUIPO_COD_EQUIPO) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, j.getNombre());
        sentenciaPre.setString(2, j.getApellido());
        sentenciaPre.setString(3, j.getNickname());
        sentenciaPre.setInt(4, j.getSueldo());
        sentenciaPre.setString(5, j.getNacionalidad());
        sentenciaPre.setString(6, j.getEstado());
        sentenciaPre.setString(7, j.getTelefono());
        sentenciaPre.setInt(8, j.getEquipo().getCod_equipo());
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Función para insertar Jugador sin equipo.
     *
     * @param j (requerido) objeto de clase Jugador.
     * @throws Exception hereda excepciones.
     */
    public void insertarJugadorSinEquipo(Jugador j) throws Exception {
        bdr.conectar();
        String plantilla = "INSERT INTO JUGADOR(NOMBRE,APELLIDO,NICKNAME,SUELDO,NACIONALIDAD,ESTADO,TELEFONO) VALUES (?,?,?,?,?,?,?,)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, j.getNombre());
        sentenciaPre.setString(2, j.getApellido());
        sentenciaPre.setString(3, j.getNickname());
        sentenciaPre.setInt(4, j.getSueldo());
        sentenciaPre.setString(5, j.getNacionalidad());
        sentenciaPre.setString(6, j.getEstado());
        sentenciaPre.setString(7, j.getTelefono());
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Función que busca un Jugador en la base de datos mediante su codigo.
     *
     * @param cod_jugador (requerido) codigo de clase Jugador.
     * @return devuelve un objeto clase Jugador.
     * @throws Exception hereda excepciones.
     */
    public Jugador consultarJugadorCodigo(int cod_jugador) throws Exception {
        bdr.conectar();
        String plantilla = "SELECT COD_JUGADOR,NOMBRE,APELLIDO,NICKNAME,SUELDO,NACIONALIDAD,ESTADO,TELEFONO,EQUIPO_COD_EQUIPO FROM JUGADOR WHERE COD_JUGADOR= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_jugador);
        Jugador j;
        resultado = sentenciaPre.executeQuery();
        if (resultado.next()) {
            j = crearObjeto();
        } else {
            j = null;
        }
        bdr.cerrarCon();
        return j;
    }

    /**
     * Función que rellena un objeto Jugador desde los datos de la base de
     * datos.
     *
     * @return devuelve un objeto de clase Jugador.
     * @throws Exception herada excepciones.
     */
    public Jugador crearObjeto() throws Exception {
        Jugador j = new Jugador();
        j.setCod_jugador(resultado.getInt("COD_JUGADOR"));
        j.setNombre(resultado.getString("NOMBRE"));
        j.setApellido(resultado.getString("APELLIDO"));
        j.setNickname(resultado.getString("NICKNAME"));
        j.setSueldo(resultado.getInt("SUELDO"));
        j.setNacionalidad(resultado.getString("NACIONALIDAD"));
        j.setEstado(resultado.getString("ESTADO"));
        j.setTelefono(resultado.getString("TELEFONO"));
        EquipoBD eBD = new EquipoBD();
        Equipo e = eBD.consultarEquipoCodigo(resultado.getInt("EQUIPO_COD_EQUIPO"));
        j.setEquipo(e);
        return j;
    }

    /**
     * Función que crea un ArrayList con todos los Jugadores de la base de
     * datos.
     *
     * @return devuelve un ArrayList de Jugador.
     * @throws Exception hereda excepciones.
     */
    public ArrayList<Jugador> consultaTodosJugadores() throws Exception {
        ArrayList<Jugador> listaJugadores = new ArrayList();
        bdr.conectar();
        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT * FROM JUGADOR");
        while (resultado.next()) {
            listaJugadores.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaJugadores;
    }

    /**
     * Función que crea un ArrayList con todos los Jugadores de un equipo de la
     * base de datos.
     *
     * @param cod_equipo (requerido) codigo del Equipo
     * @return devuelve un ArrayList de Jugador.
     * @throws Exception hereda excepciones.
     */
    public ArrayList<Jugador> consultaTodosJugadoresEquipo(int cod_equipo) throws Exception {
        ArrayList<Jugador> listaJugadoresEquipo = new ArrayList();
        bdr.conectar();
        String plantilla = "DELETE FROM JUGADOR WHERE COD_JUGADOR= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(3, cod_equipo);
        sentenciaPre.executeUpdate();
        while (resultado.next()) {
            listaJugadoresEquipo.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaJugadoresEquipo;
    }

    /**
     * Función que borra un Jugador de la base de datos.
     *
     * @param codJugador (requerido) codigo del Jugador.
     * @throws Exception hereda excepciones.
     */
    public void borrarJugador(int codJugador) throws Exception {
        bdr.conectar();
        String plantilla = "DELETE FROM JUGADOR WHERE COD_JUGADOR= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, codJugador);
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Función para modificar un Jugador.
     *
     * @param j (requerido) objeto de clase Jugador.
     * @throws Exception heredar excepciones
     */
    public void modificarJugador(Jugador j) throws Exception {
        bdr.conectar();
        String plantilla = "UPDATE JUGADOR SET NOMBRE=?, APELLIDO=?, NICKNAME=?, SUELDO=?, NACIONALIDAD=?, ESTADO=?, TELEFONO=?, EQUIPO_COD_EQUIPO=? WHERE COD_JUGADOR=?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, j.getNombre());
        sentenciaPre.setString(2, j.getApellido());
        sentenciaPre.setString(3, j.getNickname());
        sentenciaPre.setInt(4, j.getSueldo());
        sentenciaPre.setString(5, j.getNacionalidad());
        sentenciaPre.setString(6, j.getEstado());
        sentenciaPre.setString(7, j.getTelefono());
        sentenciaPre.setInt(8, j.getEquipo().getCod_equipo());
        sentenciaPre.setInt(9, j.getCod_jugador());
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

}
