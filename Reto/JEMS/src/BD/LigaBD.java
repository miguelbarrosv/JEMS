/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.CallableStatement;
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

    public LigaBD() {
        bdr = new Bdr();
    }

    /**
     * Funcion que ejecuta el procedimiento PROC_REF_EQUIPO
     *
     * @return devuelve un string con todos los equipos con el nombre de su
     * dueño y la cantidad de jugadores
     * @throws Exception hereda excepciones
     */
    public String consultarTodosEquipos(Date fechaInicioLiga) throws Exception {
        java.sql.Date sDate = convertUtilToSql(fechaInicioLiga);
        bdr.conectar();
        CallableStatement cStmt = bdr.getCon().prepareCall("{call PAQ_PROC_FUN.GENERAR_CALENDARIO(?)}");
        cStmt.setDate(1, sDate);
        cStmt.executeUpdate();
        ResultSet rs = (ResultSet) cStmt.getObject(1);

        rs.close();
        cStmt.close();
        bdr.cerrarCon();
        return listaEquipos;
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
}
