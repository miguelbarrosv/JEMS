/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.Date;

/**
 * Creacion de la clase java para el Partido.
 *
 * @author Sergio Zulueta
 * @author Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class Partido {

    /**
     * Creacion de los atributos resultado, fecha_partido, equipo_local,
     * equipo_visitante y jornada.
     */
    private int resultado;
    private Date fecha_partido;

    private Equipo equipo_local;
    private Equipo equipo_visitante;
    private Jornada jornada;

    /**
     * Constructor vacio. (Para invocación por constructores de subclases,
     * típicamente implícito.)
     */
    public Partido() {
    }

    /**
     * Constructor lleno, solo atributos.
     *
     * @param resultado (requerido) El resultado del partido.
     * @param fecha_partido (requerido) La fecha del partido.
     */
    public Partido(int resultado, Date fecha_partido) {
        this.resultado = resultado;
        this.fecha_partido = fecha_partido;
    }

    /**
     * Constructor lleno, incluyendo relacciones.
     *
     * @param resultado (requerido) El resultado del partido.
     * @param fecha_partido (requerido) La fecha del partido.
     * @param equipo_local (requerido) El codigo del equipo local.
     * @param equipo_visitante (requerido) El codigo del equipo visitante.
     * @param jornada (requerido) La jorada en la que se ha jugado el partido.
     */
    public Partido(int resultado, Date fecha_partido, Equipo equipo_local, Equipo equipo_visitante, Jornada jornada) {
        this.resultado = resultado;
        this.fecha_partido = fecha_partido;
        this.equipo_local = equipo_local;
        this.equipo_visitante = equipo_visitante;
        this.jornada = jornada;
    }

    /**
     * Es un Get que devuelve el resultado del partido.
     *
     * @return resultado devuelve el resultado del partido
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * Es un Set que establece el resultado del partido.
     *
     * @param resultado establece el resultado del partido
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    /**
     * Es un Get que devuelve la fecha del partido.
     *
     * @return fecha_partido devuelve la fecha del partido
     */
    public Date getFecha_partido() {
        return fecha_partido;
    }

    /**
     * Es un Set que establece la fecha del partido.
     *
     * @param fecha_partido establece la decha del partido
     */
    public void setFecha_partido(Date fecha_partido) {
        this.fecha_partido = fecha_partido;
    }

    /**
     * Es un Get que devuelve el codigo del equipo local.
     *
     * @return equipo_local devuelve el codigo del equipo local
     */
    public Equipo getEquipo_local() {
        return equipo_local;
    }

    /**
     * Es un Set que establece el codigo del equipo local.
     *
     * @param equipo_local establece el codigo del equipo local
     */
    public void setEquipo_local(Equipo equipo_local) {
        this.equipo_local = equipo_local;
    }

    /**
     * Es un Get que devuelve el codigo del equipo visitante.
     *
     * @return equipo_visitante devuelve el codigo del equipo visitante
     */
    public Equipo getEquipo_visitante() {
        return equipo_visitante;
    }

    /**
     * Es un Set que devuleve el codigo del equipo visitante.
     *
     * @param equipo_visitante establece el codigo del equipo visitante
     */
    public void setEquipo_visitante(Equipo equipo_visitante) {
        this.equipo_visitante = equipo_visitante;
    }

    /**
     * Es un Get que devulve la jornada jugada.
     *
     * @return jornada devuelve en la jornada que juegan
     */
    public Jornada getJornada() {
        return jornada;
    }

    /**
     * Es un Set que establece la jornada jugada.
     *
     * @param jornada establece la jornada en la que juegan
     */
    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

}
