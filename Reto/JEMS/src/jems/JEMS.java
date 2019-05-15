/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jems;

/**
 * Controladora de nuestro proyecto JEMS
 * https://www.oracle.com/technetwork/articles/java/index-137868.html
 * @author Sergio Zulueta
 * @author Miguel Barros
 * @author Joel Encinas
 * @author Eric Muñoz
 * 
 * @see JEMS
 * 
 * @version %I%, %G%
 * @since 1.0 
 * 
 */

import Vistas.VLogin;

public class JEMS {

    static VLogin v = new VLogin();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        v.setVisible(true);
        
    }
    
}
