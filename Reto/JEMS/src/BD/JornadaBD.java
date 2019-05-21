/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Jornada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Clase de jornada de base de datos.
 *
 * @author Eric Muñoz
 * @author Sergio Zulueta
 * @author Miguel Barros
 *
 * @see Jornada
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class JornadaBD {

    /**
     * Creacion de los atributos bdr.
     */
    private  Bdr bdr;
    private  ResultSet resultado;
    private Jornada j;
    private  ArrayList<Jornada>jornadas = new ArrayList<Jornada>();
    
    public JornadaBD() {
        bdr = new Bdr();
    }

    public  ArrayList<Jornada> consultarJornadas() throws Exception {
        bdr.conectar();
        
        String plantilla = "SELECT * FROM JORNADA;";
        PreparedStatement ps = bdr.getCon().prepareStatement(plantilla);
        resultado = ps.executeQuery();
        while (resultado.next()) {
             j = crearObjeto();
             jornadas.add(j);
        }
        bdr.cerrarCon();
        return jornadas;
    }
    
    public  Jornada crearObjeto() throws SQLException, Exception {
       Jornada j = new Jornada(); 
       j.setCod_jornada(resultado.getInt("COD_EQUIPO"));
       j.setFecha_fin(resultado.getDate("FECHA_FIN"));
       j.setFecha_inicio(resultado.getDate("FECHA_INICIO"));
       
       PartidoBD pBD = new PartidoBD();
       j.setPartidos(pBD.consultarPartidos());
       j.setLiga(LigaBD.consultarLiga());
       return j;
    }
    
    public Jornada consultarJornada(int codigo) throws SQLException, Exception {
        bdr.conectar();
        
        String plantilla = "SELECT * FROM JORNADA WHERE COD_JORNADA = ?;";
        PreparedStatement ps = bdr.getCon().prepareStatement(plantilla);
        ps.setInt(1, codigo);
        resultado = ps.executeQuery();
        while (resultado.next()) {
             j = crearObjeto();
        }
        bdr.cerrarCon();
        return j;
    }
}
