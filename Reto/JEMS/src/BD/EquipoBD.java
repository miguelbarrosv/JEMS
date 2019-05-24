/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.*;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 * Clase de Equipo de base de datos.
 *
 * @author Joel Encinas
 * @author Eric Muñoz
 * @author Sergio Zulueta
 * @author Miguel Barros
 *
 * @see Equipo
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class EquipoBD {

    /**
     * Creacion de los atributos bdr, resultado y listaEquipos.
     *
     */
    private static Bdr bdr;
    private ResultSet resultado;
    private String stringlistaEquipos;

    /**
     * Constructor de EquipoBD con el objeto de la conexión a la base de datos.
     *
     */
    public EquipoBD() {
        bdr = new Bdr();
    }

    /**
     * Funcion para insertar un Equipo en la base de datos.
     *
     * @param e (requerido) objeto de clase Equipo.
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public void insertarEquipo(Equipo e) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "INSERT INTO EQUIPO (NOMBRE,NACIONALIDAD,PRESUPUESTO,DUEÑO_COD_DUEÑO,PUNTUACION)VALUES(?,?,?,?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, e.getNombre());
        sentenciaPre.setString(2, e.getNacionalidad());
        sentenciaPre.setInt(3, e.getPresupuesto());
        sentenciaPre.setInt(4, e.getDueño().getCod_dueño());
        sentenciaPre.setInt(5, e.getPuntuacion());
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();

    }

    /**
     * Función que borra un Equipo de la base de datos.
     *
     * @param cod_equipo (requerido) codigo del Equipo.
     * @throws Exception hereda excepciones.
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public void borrarEquipo(int cod_equipo) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "DELETE FROM EQUIPO WHERE COD_EQUIPO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_equipo);
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Función para modificar un Equipo.
     *
     * @param e (requerido) objeto de clase Equipo.
     * @throws Exception heredar excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public void modificarEquipo(Equipo e) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "UPDATE EQUIPO SET NOMBRE=?, NACIONALIDAD=?, PRESUPUESTO=?, DUEÑO_COD_DUEÑO=?, PUNTUACION=? WHERE COD_EQUIPO=?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, e.getNombre());
        sentenciaPre.setString(2, e.getNacionalidad());
        sentenciaPre.setInt(3, e.getPresupuesto());
        sentenciaPre.setInt(4, e.getDueño().getCod_dueño());
        sentenciaPre.setInt(5, e.getPuntuacion());
        sentenciaPre.setInt(6, e.getCod_equipo());
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Funcion para buscar un equipo mediante el codigo.
     *
     * @param cod_equipo (requerido)codigo del equipo
     * @return e objeto de clase Equipo
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public Equipo consultarEquipoCodigo(int cod_equipo) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "SELECT COD_EQUIPO,NOMBRE,NACIONALIDAD,PRESUPUESTO,DUEÑO_COD_DUEÑO,PUNTUACION FROM EQUIPO WHERE COD_EQUIPO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_equipo);
        resultado = sentenciaPre.executeQuery();
        Equipo e;
        if (resultado.next()) {
            e = crearObjeto();
        } else {
            e = null;
        }
        bdr.cerrarCon();
        return e;
    }

    /**
     * Función que rellena un objeto Equipo desde los datos de la base de datos.
     *
     * @return devuelve un objeto de clase Equipo.
     * @throws Exception hereda excepciones.
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public Equipo crearObjeto() throws Exception, SQLException {
        Equipo e = new Equipo();
        e.setCod_equipo(resultado.getInt("COD_EQUIPO"));
        e.setNombre(resultado.getString("NOMBRE"));
        e.setNacionalidad(resultado.getString("NACIONALIDAD"));
        e.setPresupuesto(Integer.parseInt(resultado.getString("PRESUPUESTO")));
        e.setPuntuacion(Integer.parseInt(resultado.getString("PUNTUACION")));
        DueñoBD dBD = new DueñoBD();
        Dueño d = dBD.consultarDueñoCodigo(resultado.getInt("DUEÑO_COD_DUEÑO"));
        e.setDueño(d);
        return e;
    }

    /**
     * Función que rellena un objeto Equipo desde los datos de la base de datos
     * y añade jugadores y partidos.
     *
     * @return devuelve un objeto de clase Equipo.
     * @throws Exception hereda excepciones.
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public Equipo crearObjetoConListas() throws Exception, SQLException {
        Equipo e = new Equipo();
        e.setCod_equipo(resultado.getInt("COD_EQUIPO"));
        e.setNombre(resultado.getString("NOMBRE"));
        e.setNacionalidad(resultado.getString("NACIONALIDAD"));
        e.setPresupuesto(Integer.parseInt(resultado.getString("PRESUPUESTO")));
        e.setPuntuacion(Integer.parseInt(resultado.getString("PUNTUACION")));
        DueñoBD dBD = new DueñoBD();
        Dueño d = dBD.consultarDueñoCodigo(resultado.getInt("DUEÑO_COD_DUEÑO"));
        e.setDueño(d);
        JugadorBD jBD = new JugadorBD();
        e.setLista_jugadores(jBD.consultaTodosJugadoresEquipo(e.getCod_equipo()));
        PartidoBD pBD = new PartidoBD();
        e.setLista_partidos(pBD.consultarPartidosEquipo(e.getCod_equipo()));
        return e;
    }

    /**
     * Función que crea un ArrayList con todos los Equipos de la base de datos.
     *
     * @return devuelve un ArrayList de Equipo.
     * @throws Exception hereda excepciones.
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public ArrayList<Equipo> consultaEquipos() throws Exception, SQLException {
        ArrayList<Equipo> listaEquipos = new ArrayList();
        bdr.conectar();
        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT COD_EQUIPO,NOMBRE,NACIONALIDAD,PRESUPUESTO,DUEÑO_COD_DUEÑO,PUNTUACION FROM EQUIPO");
        while (resultado.next()) {
            listaEquipos.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaEquipos;
    }

    /**
     * Función que crea un ArrayList con todos los Equipos de un Dueño de la
     * base de datos.
     *
     * @param cod_dueño (reqUerido) codigo del Dueño
     * @return devuelve un ArrayList de Equipo.
     * @throws Exception hereda excepciones.
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public ArrayList<Equipo> consultaEquiposCodDueño(int cod_dueño) throws Exception, SQLException {
        ArrayList<Equipo> listaEquipos = new ArrayList();
        bdr.conectar();
        String plantilla = "SELECT * FROM EQUIPO WHERE DUEÑO_COD_DUEÑO=?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_dueño);
        resultado = sentenciaPre.executeQuery();
        while (resultado.next()) {
            listaEquipos.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaEquipos;
    }

    /**
     * Funcion que ejecuta el procedimiento PROC_REF_EQUIPO.
     *
     * @return devuelve un string con todos los Equipos con el nombre de su
     * Dueño y la cantidad de Jugadores
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public String consultarTodosEquipos() throws Exception, SQLException {
        bdr.conectar();
        CallableStatement cStmt = bdr.getCon().prepareCall("{call PAQ_PROC_FUN.PROC_REF_EQUIPO(?)}");
        cStmt.registerOutParameter(1, OracleTypes.CURSOR);
        cStmt.executeUpdate();
        ResultSet rs = (ResultSet) cStmt.getObject(1);
        while (rs.next()) {
            stringlistaEquipos += "Codigo: " + rs.getInt("COD_EQUIPO");
            stringlistaEquipos += "Nombre: " + rs.getString("NOMBRE");
            stringlistaEquipos += "Nacionalidad: " + rs.getString("NACIONALIDAD");
            stringlistaEquipos += "Presupuesto: " + rs.getInt("PRESUPUESTO");
            stringlistaEquipos += "Puntuacion: " + rs.getInt("PUNTUACION");
            stringlistaEquipos += "Codigo dueño: " + rs.getInt("CODIGO_DUEÑO");
            stringlistaEquipos += "Nombre dueño: " + rs.getString("NOMBRE_DUEÑO");
            stringlistaEquipos += "Numero jugadores " + rs.getInt("NUM_JUGADORES") + "\n\n";
        }
        rs.close();
        cStmt.close();
        bdr.cerrarCon();
        return stringlistaEquipos;
    }

    /**
     * Función que crea un ArrayList con todos los Equipos de la base de datos
     * ordenador por puntuacion.
     *
     * @return devuelve un ArrayList de Equipo.
     * @throws Exception hereda excepciones.
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public ArrayList<Equipo> consultarEquipoOrderPuntuacion() throws Exception, SQLException {
        ArrayList<Equipo> listaEquipos = new ArrayList();
        bdr.conectar();
        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT COD_EQUIPO,NOMBRE,NACIONALIDAD,PRESUPUESTO,DUEÑO_COD_DUEÑO,PUNTUACION FROM EQUIPO ORDER BY PUNTUACION DESC");
        while (resultado.next()) {
            listaEquipos.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaEquipos;
    }

    /**
     * Funcion para buscar el codigo de Equipo mediante el nombre del Equipo.
     *
     * @param nomEquipo (requerido) nombre del Equipo
     * @return devuelve un codigo del Equipo
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public int buscarCodigoPorNombre(String nomEquipo) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "SELECT COD_EQUIPO FROM EQUIPO WHERE NOMBRE = ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, nomEquipo);
        resultado = sentenciaPre.executeQuery();
        int codigoEquipo;
        if (resultado.next()) {
            codigoEquipo = resultado.getInt("COD_EQUIPO");
        } else {
            codigoEquipo = 0;
        }
        bdr.cerrarCon();
        return codigoEquipo;
    }

    /**
     * Funcion que modifica la puntuacion de un Equipo.
     *
     * @param codigoEquipo (reuqerido) codigo del equipo
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public void modificarPuntuacion(int codigoEquipo) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "UPDATE EQUIPO SET PUNTUACION = PUNTUACION + 3 WHERE COD_EQUIPO = ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, codigoEquipo);
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }
}
