/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Jugador; 
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Clase de jugador de base de datos
 *
 * @author Joel Encinas
 * 
 * @see AdministradorBD
 * 
 * @version %I%, %G%
 * @since 1.0
 * 
 * 
 * 
 */
public class JugadorBD {
    private Jugador j;
    private Connection con;
    private PreparedStatement ps;
    // private BaseDatos bd = new BaseDatos();
}
