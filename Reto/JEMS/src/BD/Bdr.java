/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import jems.JEMS;

/**
 * Creacion de la clase bdr para conectarse a la base de datos relacional.
 *
 * @author Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class Bdr {

    /**
     * Creacion de atributo con.
     *
     */
    private Connection con;

    /**
     * Función para conectarse a la base de datos.
     *
     */
    public void conectar() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //PARA CONECTARSE CON VAGRANT
            String url = "jdbc:oracle:thin:@10.10.10.9:1521:db12102";
            con = DriverManager.getConnection(url, "SCOTT", "oracle");
            //PARA CONECTARSE CON SERVIDOR DE CLASE

            //String url = "jdbc:oracle:thin:@SrvOracle:1521:orcl";
            //con = DriverManager.getConnection(url, "eqdaw02", "eqdaw02");
        } catch (ClassNotFoundException | SQLException e) {
            String mensaje = "Problemas con la base de datos relacional";
            JEMS.errorBdr(mensaje);
            System.exit(0);
        }
    }

    /**
     * Es un Get que que devuelve la conexcion a la base de datos.
     *
     * @return devuelve la conexion
     */
    public Connection getCon() {
        return con;
    }

    /**
     * Funcion para cerrar la conexion a la base de datos.
     *
     * @throws Exception hereda excepciones
     */
    public void cerrarCon() throws Exception {
        con.close();
    }

}
