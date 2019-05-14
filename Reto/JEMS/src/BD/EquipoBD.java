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

/**
 * Clase de equipo de base de datos
 *
 * @author Joel Encinas
 * 
 * 
 * @version %I%, %G%
 * @since 1.0
 * 
 * 
 * 
 */

public class EquipoBD {

    private static Bdr bdr;
    private ResultSet resultado;
    
    public EquipoBD(){
        bdr = new Bdr();
    }
    public Equipo consultarEquipo(Equipo e) throws Exception
    {
        bdr.conectar();
        
        String plantilla = "SELECT * FROM JUGADOR WHERE COD_JUGADOR= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,e.getCod_equipo()+"");
      
        resultado = sentenciaPre.executeQuery();
        if (resultado.next())
            e = crearObjeto();
        else
            e = null;
              
        // Cerrar la conexión
        bdr.cerrarCon();
        return e;
    }
    public Equipo crearObjeto() throws Exception{
        Equipo e = new Equipo();
        
        e.setNombre(resultado.getString("NOMBRE"));        
        e.setNacionalidad(resultado.getString("NACIONALIDAD"));
        e.setPresupuesto(Integer.parseInt(resultado.getString("PRESUPUESTO")));
        e.setPuntuacion(Integer.parseInt(resultado.getString("PUNTUACION")));
        
        return e;
    }
    
}
