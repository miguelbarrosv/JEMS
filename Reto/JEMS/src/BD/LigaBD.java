/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Liga;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 * Clase de Liga de base de datos
 *
 * @author Eric Muñoz
 *
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class LigaBD {

    private static Bdr bdr;
    private ResultSet resultado;
    private Liga l;

    public LigaBD() {
        bdr = new Bdr();
    }

    /**
     * Funcion que ejecuta el procedimiento GENERAR_CALENDARIO.
     *
     * @param fechaInicioLiga fecha de inicio de la liga
     * @return devuelve un string con el mensaje de la creacion de la liga
     * @throws Exception hereda excepciones
     */
    public static String crearLigaVacia(Date fechaInicioLiga) throws Exception {
        java.sql.Date sDate = convertUtilToSql(fechaInicioLiga);
        bdr.conectar();
        CallableStatement cStmt = bdr.getCon().prepareCall("{call PAQ_PROC_FUN.GENERAR_CALENDARIO(?)}");
        cStmt.setDate(1, sDate);
        cStmt.executeUpdate();
        String mensaje = "";
        ResultSet rs = (ResultSet) cStmt.getResultSet();
        while (rs.next()) {
            mensaje = "Liga vacia creada";
        }
        rs.close();
        cStmt.close();
        bdr.cerrarCon();
        return mensaje;
    }

    /**
     * Transformar java date a sql date.
     *
     * @param fechaInicioLiga fecha del inicio de la liga
     * @return devuelve la fecha en sql date
     */
    private static java.sql.Date convertUtilToSql(java.util.Date fechaInicioLiga) {
        java.sql.Date sDate = new java.sql.Date(fechaInicioLiga.getTime());
        return sDate;
    }

    /**
     * busca en la base de datos la liga.
     *
     * @return devuelve una
     * @throws Exception
     */
    public Liga consultarLiga() throws Exception {
        bdr.conectar();
        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT * FROM LIGA");
        while (resultado.next()) {
            l = crearObjeto();
        }
        bdr.cerrarCon();
        return l;
    }

    /**
     * crear un objeto tipo Liga.
     *
     * @return devuelve un objeto liga
     * @throws Exception hereda excepciones
     */
    public Liga crearObjeto() throws Exception {
        l = new Liga();
        l.setNombre(resultado.getString("NOMBRE"));
        l.setFecha_inicio(resultado.getDate("FECHA_INICIO"));
        l.setFecha_fin(resultado.getDate("FECHA_FIN"));
        l.setEstado(resultado.getBoolean("ESTADO"));
        return l;
    }
}
