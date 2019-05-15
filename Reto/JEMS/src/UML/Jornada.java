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
public class Jornada {

    /**
     * Creacion de los atributos cod_jornada, fecha_inicio, fecha_fin, liga y
     * partidos.
     */
    private int cod_jornada;
    private Date fecha_inicio;
    private Date fecha_fin;

    private Liga liga;
    private ArrayList<Partido> partidos;

    /**
     * Constructor vacio. (Para invocación por constructores de subclases,
     * típicamente implícito.)
     */
    public Jornada() {
    }

    /**
     * Constructor lleno, solo atributos de jornada.
     *
     * @param cod_jornada (requerido) El codigo de la jornada.
     * @param fecha_inicio (requerido) La fecha inicio de la jornada.
     * @param fecha_fin (requerido) La fecha fin de la jornada.
     */
    public Jornada(int cod_jornada, Date fecha_inicio, Date fecha_fin) {
        this.cod_jornada = cod_jornada;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    /**
     * Constructor lleno, incluyendo las relaciones.
     *
     * @param cod_jornada (requerido) El codigo de la jornada.
     * @param fecha_inicio (requerido) La fecha inicio de la jornada.
     * @param fecha_fin (requerido) La fecha fin de la jornada.
     * @param liga (requerido) La liga en la que estan las jornadas.
     * @param partidos (requerido) Los partidos que se juegan en la jornada.
     */
    public Jornada(int cod_jornada, Date fecha_inicio, Date fecha_fin, Liga liga, ArrayList<Partido> partidos) {
        this.cod_jornada = cod_jornada;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.liga = liga;
        this.partidos = partidos;
    }

    /**
     * Es un Get que devuelve el codgo de la jornada.
     * 
     * @return cod_jornada devuelve el codigo de la jornada
     */
    public int getCod_jornada() {
        return cod_jornada;
    }

    /**
     * Es un Set que establece el codigo de la jornada.
     * 
     * @param cod_jornada  establece el codigo de la jornada
     */
    public void setCod_jornada(int cod_jornada) {
        this.cod_jornada = cod_jornada;
    }

    /**
     * Es un Get que devuelve la fecha inicio de la jornada.
     * 
     * @return fecha_inicio devuelve la fecha inicio de la jornada
     */
    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * Es un Set que establece la fecha inicio de la jornada.
     * 
     * @param fecha_inicio establece la fecha inicio de la jornada
     */
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * Es un Get que devuelve la fecha final de la jornada.
     * 
     * @return fecha_fin devuelve la fecha final de la jornada
     */
    public Date getFecha_fin() {
        return fecha_fin;
    }

    /**
     * Es un Set que establece la fecha final de la jornada.
     * 
     * @param fecha_fin establece la fecha final de la jornada
     */
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    /**
     * Es un Get que devuelve la liga de la jornada.
     * 
     * @return liga devuelve la liga de la jornada
     */
    public Liga getLiga() {
        return liga;
    }

    /**
     * Es un Set que establece la liga de la jornada.
     * 
     * @param liga establece la liga de la jornada
     */
    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    /**
     * Es un Get que devuelve los partidos de la jornada.
     * 
     * @return partidos devuelve los partidos de la jornada
     */
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    /**
     * Es un Set que establece los partidos de la jornada.
     * 
     * @param partidos establece los partidos de la jornada
     */
    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
    
    

}
