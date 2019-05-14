/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Eric Muñoz
 * 
 * @version %I%, %G%
 * @since 1.0
 * 
 */
public class Bdr {
    
    /**
     * Creacion de atributo con
     */    
    private Connection con;
    /**
     * Función para conectarse a la base de datos
     */
    public void conectar(){
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@SrvOracle:1521:orcl";
            con = DriverManager.getConnection(url,"eqdaw02","eqdaw02");
        }
        catch(Exception e)
        {
            System.out.println("Problemas con la base de datos relacional");
            System.exit(0);
        }
    }
    /**
     * Es un Get que que devuelve la conexcion a la base de datos
     * 
     * @return
     */
    public Connection getCon(){
        return con;
    }
    /**
     * Funcion para cerrar la conexion a la base de datos
     * 
     * @throws Exception hereda excepciones
     */
    public void cerrarCon()throws Exception{
        con.close();
    }
    
}