/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Sergio Zulueta
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class Liga {
    
    private int cod_liga;
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_fin;
    private boolean estado;
    
    private ArrayList<Jornada>jornadas;
    
}
