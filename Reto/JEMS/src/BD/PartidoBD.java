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

/**
 * Clase de partido de base de datos
 *
 * @author Joel Encinas
 * @author Eric Muñoz
 * @author Miguel Barros
 *
 *
 * @version %I%, %G%
 * @since 1.0
 *
 *
 *
 */
public class PartidoBD {
    
    private  Partido p;
    private  ResultSet resultado;
    private  Bdr bdr;
    private  ArrayList<Partido>partidos = new ArrayList<Partido>();
    
    public  ArrayList<Partido> consultarPartidos() throws SQLException, Exception {
        bdr.conectar();
        String plantilla = "SELECT * FROM PARTIDO;";
        PreparedStatement ps = bdr.getCon().prepareStatement(plantilla);
        resultado = ps.executeQuery();
        while (resultado.next()) {
            p = crearObjeto();
            partidos.add(p);
        }
        bdr.cerrarCon();
        return partidos;
    }
    
    public Partido crearObjeto() throws SQLException, Exception {
        Partido p = new Partido();
        p.setResultado(resultado.getInt("RESULTADO"));
        p.setFecha_partido(resultado.getDate("FECHA_PARTIDO"));
        
        EquipoBD eBD = new EquipoBD();
        p.setEquipo_local(eBD.consultarEquipoCodigo(resultado.getInt("EQUIPO_COD_EQUIPO")));
        p.setEquipo_visitante(eBD.consultarEquipoCodigo(resultado.getInt("EQUIPO_VISITANTE")));
        
        JornadaBD jBD = new JornadaBD(); 
        p.setJornada(jBD.consultarJornada(resultado.getInt("JORNADA_COD_JORNADA")));
        return p;
    }
}
