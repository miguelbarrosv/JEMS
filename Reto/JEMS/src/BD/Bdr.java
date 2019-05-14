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
 * @author 1gdaw06
 */
public class Bdr {
    
    private Connection con;
    
    public void conectar(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/"+"gabinete";
            con = DriverManager.getConnection(url,"root","usbw");
        }
        catch(Exception e)
        {
            System.out.println("Problemas con la base de datos relacional");
            System.exit(0);
        }
    }
    
    public Connection getCon(){
        return con;
    }
    
    public void cerrarCon()throws Exception{
        con.close();
    }
    
}