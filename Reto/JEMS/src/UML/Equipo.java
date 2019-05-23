/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 * Creacion de la clase java para el Equipo
 *
 * @author Sergio Zulueta
 * @author Miguel Barros
 * @author Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class Equipo {

    /**
     * Creacion de los atributos cod_equipo, nombre, nacionalidad, presupuesto,
     * puntuacion, lista_partidos, lista_jugadores, dueño
     */
    private int cod_equipo;
    private String nombre;
    private String nacionalidad;
    private int presupuesto;
    private int puntuacion;
    private ArrayList<Partido> lista_partidos;
    private ArrayList<Jugador> lista_jugadores;
    private Dueño dueño;

    /**
     * Constructor si el codigo del equipo.
     *
     * @param nombre (requerido) El nombre del jugador.
     * @param nacionalidad (requerido) La nacionalidad del equipo.
     * @param presupuesto (requerido) El presupuesto del equipo.
     * @param puntuacion (requerido) La puntuacion del equipo.
     * @param dueño (requerido) el dueño del equipo.
     */
    public Equipo(String nombre, String nacionalidad, int presupuesto, int puntuacion, Dueño dueño) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.presupuesto = presupuesto;
        this.puntuacion = puntuacion;
        this.dueño = dueño;
    }

    /**
     * Constructor vacio.
     */
    public Equipo() {
    }

    /**
     * Constructor lleno, solo atributos del equipo.
     *
     * @param cod_equipo (requerido) El codigo del equipo.
     * @param nombre (requerido) El nombre del jugador.
     * @param nacionalidad (requerido) La nacionalidad del equipo.
     * @param presupuesto (requerido) El presupuesto del equipo.
     * @param puntuacion (requerido) La puntuacion del equipo.
     */
    public Equipo(int cod_equipo, String nombre, String nacionalidad, int presupuesto, int puntuacion) {
        this.cod_equipo = cod_equipo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.presupuesto = presupuesto;
        this.puntuacion = puntuacion;
    }

    /**
     * Constructo lleno, incluyendo relaciones
     *
     * @param cod_equipo (requerido) El codigo del equipo.
     * @param nombre (requerido) El nombre del jugador.
     * @param nacionalidad (requerido) La nacionalidad del equipo.
     * @param presupuesto (requerido) El presupuesto del equipo.
     * @param puntuacion (requerido) La puntuacion del equipo.
     * @param lista_partidos (requerido) La lista de partidos que ha jugado.
     * @param lista_jugadores (requerido) La lista de jugadores que tiene.
     * @param dueño (requerido) El dueño del equipo
     */
    public Equipo(int cod_equipo, String nombre, String nacionalidad, int presupuesto, int puntuacion, ArrayList<Partido> lista_partidos, ArrayList<Jugador> lista_jugadores, Dueño dueño) {
        this.cod_equipo = cod_equipo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.presupuesto = presupuesto;
        this.puntuacion = puntuacion;
        this.lista_partidos = lista_partidos;
        this.lista_jugadores = lista_jugadores;
        this.dueño = dueño;
    }

    /**
     * Es un Get que devuelve el codigo del equipo.
     *
     * @return cod_jugador devuelve el codigo
     */
    public int getCod_equipo() {
        return cod_equipo;
    }

    /**
     * Es un Set que establece el codigo del equipo.
     *
     * @param cod_equipo establece el codigo del equipo
     */
    public void setCod_equipo(int cod_equipo) {
        this.cod_equipo = cod_equipo;
    }

    /**
     * Es un Get que devuelve el nombre del equipo.
     *
     * @return nombre devuelve el nombre del equipo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Es un Set que establece el nombre del equipo.
     *
     * @param nombre establece el nombre del equipo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Es un Get que devuelve la nacionalidad del equipo.
     *
     * @return nacionalidad devuelve la nacionalidad del equipo
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Es un Set que establece la nacionalidad del equipo.
     *
     *
     * @param nacionalidad establece la nacionalidad del equipo
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Es un Get que devuelve el presupuesto del equipo.
     *
     * @return presupuesto devuelve el presupuesto del equipo
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    /**
     * Es un Set que establece el presupuesto del equipo.
     *
     * @param presupuesto establece el presupuesto del equipo
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * Es un Get que devuelve la puntuacion del equipo.
     *
     * @return puntuacion devuelve la puntuacion del equipo
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * Es un Set que establece la puntuacion del equipo.
     *
     * @param puntuacion establece la puntuacion del equipo
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * Es un Get que devuelve la lista de partidos del equipo.
     *
     * @return lista_partidos devuelve la lista de partidos del equipo
     */
    public ArrayList<Partido> getLista_partidos() {
        return lista_partidos;
    }

    /**
     * Es un Set que establece la lista de partidos del equipo.
     *
     * @param lista_partidos establece la lista de partidos del equipo
     */
    public void setLista_partidos(ArrayList<Partido> lista_partidos) {
        this.lista_partidos = lista_partidos;
    }

    /**
     * Es un Get que devuelve lista de jugadores del equipo.
     *
     * @return lista_jugadores devuelve la lista de jugadores del equipo
     */
    public ArrayList<Jugador> getLista_jugadores() {
        return lista_jugadores;
    }

    /**
     * Es un Set que establece la lista de jugadores del equipo.
     *
     * @param lista_jugadores establece la lista de jugadores del equipo
     */
    public void setLista_jugadores(ArrayList<Jugador> lista_jugadores) {
        this.lista_jugadores = lista_jugadores;
    }

    /**
     * Es un Get que devuelve el dueño del equipo.
     *
     * @return dueño devuelve el nombre del dueño del equipo
     */
    public Dueño getDueño() {
        return dueño;
    }

    /**
     * Es un Set que establece el dueño del equipo.
     *
     * @param dueño establece el nombre del dueño del equipo
     */
    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

}
