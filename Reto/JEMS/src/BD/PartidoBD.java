/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Partido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase de Partido de base de datos.
 *
 * @author Joel Encinas
 * @author Eric Muñoz
 * @author Miguel Barros
 *
 * @see Partido
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class PartidoBD {

    /**
     * Creacion de los atributos p, resultado, bdr y partidos.
     *
     */
    private Partido p;
    private ResultSet resultado;
    private static Bdr bdr;

    /**
     * Constructor de PartidoBD con el objeto de la conexión a la base de datos.
     *
     */
    public PartidoBD() {
        bdr = new Bdr();
    }

    /**
     * Funcion que consulta todos los Partidos.
     *
     * @return devuelve todos los Partidos
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public ArrayList<Partido> consultarPartidos() throws Exception, SQLException {
        bdr.conectar();
        ArrayList<Partido> listaPartidos = new ArrayList();
        String plantilla = "SELECT EQUIPO_COD_EQUIPO,JORNADA_COD_JORNADA,RESULTADO,FECHA_PARTIDO,EQUIPO_VISITANTE FROM PARTIDO";
        PreparedStatement ps = bdr.getCon().prepareStatement(plantilla);
        resultado = ps.executeQuery();
        while (resultado.next()) {
            listaPartidos.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaPartidos;
    }

    /**
     * Funcion que consultado todos los Partidos de una Jornada.
     *
     * @param cod_jornada (requerido) codigo de la jornada
     * @return devuelve todos los partidos de ese Equipo
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public ArrayList<Partido> consultarPartidosJornada(int cod_jornada) throws Exception, SQLException {
        bdr.conectar();
        ArrayList<Partido> listaPartidos = new ArrayList();
        String plantilla = "SELECT EQUIPO_COD_EQUIPO,JORNADA_COD_JORNADA,RESULTADO,FECHA_PARTIDO,EQUIPO_VISITANTE FROM PARTIDO WHERE JORNADA_COD_JORNADA=?";
        PreparedStatement ps = bdr.getCon().prepareStatement(plantilla);
        ps.setInt(1, cod_jornada);
        resultado = ps.executeQuery();
        while (resultado.next()) {
            listaPartidos.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaPartidos;
    }

    /**
     * Funcion que consultado todos los Partidos de un Equipo.
     *
     * @param cod_equipo (requerido) codigo del Equipo
     * @return devuelve todos los partidos de ese Equipo
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public ArrayList<Partido> consultarPartidosEquipo(int cod_equipo) throws Exception, SQLException {
        bdr.conectar();
        ArrayList<Partido> listaPartidos = new ArrayList();
        String plantilla = "SELECT EQUIPO_COD_EQUIPO,JORNADA_COD_JORNADA,RESULTADO,FECHA_PARTIDO,EQUIPO_VISITANTE FROM PARTIDO WHERE EQUIPO_COD_EQUIPO=? OR EQUIPO_VISITANTE=?";
        PreparedStatement ps = bdr.getCon().prepareStatement(plantilla);
        ps.setInt(1, cod_equipo);
        ps.setInt(2, cod_equipo);
        resultado = ps.executeQuery();
        while (resultado.next()) {
            listaPartidos.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaPartidos;
    }

    /**
     * Funcion que crea un objeto Partido.
     *
     * @return devuelve un objeto Partido
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public Partido crearObjeto() throws Exception, SQLException {
        p = new Partido();
        p.setResultado(resultado.getInt("RESULTADO"));
        p.setFecha_partido(resultado.getDate("FECHA_PARTIDO"));
        EquipoBD eBD = new EquipoBD();
        p.setEquipo_local(eBD.consultarEquipoCodigo(resultado.getInt("EQUIPO_COD_EQUIPO")));
        p.setEquipo_visitante(eBD.consultarEquipoCodigo(resultado.getInt("EQUIPO_VISITANTE")));
        JornadaBD jBD = new JornadaBD();
        p.setJornada(jBD.consultarJornada(resultado.getInt("JORNADA_COD_JORNADA")));
        return p;
    }

    public void insertarPartido(int cod_local, int cod_visitante, Date fecha, int cod_jornada) throws Exception, SQLException {
        bdr.conectar();
        ArrayList<Partido> listaPartidos = new ArrayList();
        java.sql.Date sDate = convertUtilToSql(fecha);
        String plantilla = "INSERT INTO PARTIDO (EQUIPO_COD_EQUIPO,JORNADA_COD_JORNADA,FECHA_PARTIDO,EQUIPO_VISITANTE,RESULTADO)VALUES(?,?,?,?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_local);
        sentenciaPre.setInt(2, cod_jornada);
        sentenciaPre.setDate(3, sDate);
        sentenciaPre.setInt(4, cod_visitante);
        sentenciaPre.setInt(5, 0);
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Transformar java date a sql date.
     *
     * @param fechaInicioLiga fecha del inicio de la liga
     * @return devuelve la fecha en sql date
     */
    private java.sql.Date convertUtilToSql(java.util.Date fechaInicioLiga) {
        java.sql.Date sDate = new java.sql.Date(fechaInicioLiga.getTime());
        return sDate;
    }
}
