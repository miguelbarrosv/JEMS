/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 * @author Sergio Zulueta
 *
 * @see Equipo
 * @version %I%, %G%
 * @since 1.0
 */
public class Equipo {

    private int cod_equipo;
    private String nombre;
    private String nacionalidad;
    private int presupuesto;
    private int puntuacion;
    
    private ArrayList<Partido> lista_partidos;
    private ArrayList<Jugador> lista_jugadores;
    private Dueño dueño;

}
