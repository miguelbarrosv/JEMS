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
 * @author Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class Liga {

    /**
     * Creacion de los atributos cod_liga, nombre, fecha_inicio, fecha_fin y
     * estado.
     */
    private int cod_liga;
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_fin;
    private boolean estado;

    private ArrayList<Jornada> jornadas;

    /**
     * Constructor vacio. (Para invocación por constructores de subclases,
     * típicamente implícito.)
     */
    public Liga() {
    }

    /**
     * Constructor lleno, solo atributos.
     *
     * @param cod_liga (requerido) El codigo de la liga.
     * @param nombre (requerido) El nombre de la liga.
     * @param fecha_inicio (requerido) La fecha inicio de la liga.
     * @param fecha_fin (requerido) La fecha fin de la liga.
     * @param estado (requerido) El estado de la liga.
     */
    public Liga(int cod_liga, String nombre, Date fecha_inicio, Date fecha_fin, boolean estado) {
        this.cod_liga = cod_liga;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
    }

    /**
     * Constructor lleno, incluyendo las relaciones.
     *
     * @param cod_liga (requerido) El codigo de la liga.
     * @param nombre (requerido) El nombre de la liga.
     * @param fecha_inicio (requerido) La fecha inicio de la liga.
     * @param fecha_fin (requerido) La fecha fin de la liga.
     * @param estado (requerido) El estado de la liga.
     * @param jornadas (requerido) Las jornadas de la liga.
     */
    public Liga(int cod_liga, String nombre, Date fecha_inicio, Date fecha_fin, boolean estado, ArrayList<Jornada> jornadas) {
        this.cod_liga = cod_liga;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
        this.jornadas = jornadas;
    }

    /**
     * Es un Get que devuelve el codigo de la liga.
     *
     * @return cod_liga devuelve el codigo de la liga
     */
    public int getCod_liga() {
        return cod_liga;
    }

    /**
     * Es un Set que establece el codigo de la liga.
     *
     * @param cod_liga establece el codigo de la liga
     */
    public void setCod_liga(int cod_liga) {
        this.cod_liga = cod_liga;
    }

    /**
     * Es un Get que devuelve el nombre de la liga.
     *
     * @return nombre devuelve el nombre de la liga
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Es un Set que establece el nombre de la liga.
     *
     * @param nombre establece el nombre de la liga
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Es un Get que devuelve la fecha inicio de la liga.
     *
     * @return fecha_inicio devuelve la fecha de la liga
     */
    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * Es un Set que establece la fecha inicio de la liga.
     *
     * @param fecha_inicio establece la fecha inicio de la liga
     */
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * Es un Get que devuelve la fecha final de la liga.
     *
     * @return fecha_fin devuelve la fecha final de la liga
     */
    public Date getFecha_fin() {
        return fecha_fin;
    }

    /**
     * Es un Set que establece la fecha final de la liga.
     *
     * @param fecha_fin establece la fecha_fin de la liga
     */
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    /**
     * Es un Get que devuelve el estado de la liga.
     *
     * @return estado devuelve el estado de la liga
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Es un Set que establece el estado de la liga.
     *
     * @param estado establece el estado de la liga
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Es un Get que devuelve las jornadas de la liga.
     *
     * @return jornadas devuelve las jornadas de la liga
     */
    public ArrayList<Jornada> getJornadas() {
        return jornadas;
    }

    /**
     * Es un Set que establece las jornadas de la liga.
     *
     * @param jornadas establece las jornadas de la liga
     */
    public void setJornadas(ArrayList<Jornada> jornadas) {
        this.jornadas = jornadas;
    }

}
