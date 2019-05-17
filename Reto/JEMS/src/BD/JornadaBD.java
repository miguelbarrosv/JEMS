/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.ResultSet;

/**
 * Clase de jornada de base de datos.
 *
 * @author Eric Muñoz
 * @author Sergio Zulueta
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
    private static Bdr bdr;

    public JornadaBD() {
        bdr = new Bdr();
    }

}
