/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 * @author Sergio Zulueta
 * @author Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class Jugador {

    /**
     * Creacion de los atributos cod_jugador, nombre, apellido, nickname,
     * sueldo, nacionalidad, estado, telefono y equipo.
     */
    private int cod_jugador;
    private String nombre;
    private String apellido;
    private String nickname;
    private int sueldo;
    private String nacionalidad;
    private String estado;
    private String telefono;

    private Equipo equipo;

    /**
     * Constructor vacio. (Para invocación por constructores de subclases,
     * típicamente implícito.)
     */
    public Jugador() {

    }

    /**
     * Constructor lleno, solo atributos del jugador.
     *
     * @param cod_jugador (requerido) El codigo del jugador.
     * @param nombre (requerido) El nombre del jugador.
     * @param apellido (requerido) El apellido del jugador.
     * @param nickname (requerido) El nickname del jugador.
     * @param sueldo (requerido) El sueldo del jugador.
     * @param nacionalidad (requerido) La nacionalidad del jugador.
     * @param estado (requerido) El estado del jugador.
     * @param telefono (requerido) El telefono del jugador.
     */
    public Jugador(int cod_jugador, String nombre, String apellido, String nickname, int sueldo, String nacionalidad, String estado, String telefono) {
        this.cod_jugador = cod_jugador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.sueldo = sueldo;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
        this.telefono = telefono;
    }

    /**
     * Costructor lleno, incluyendo relaciones.
     *
     * @param cod_jugador (requerido) El codigo del jugador.
     * @param nombre (requerido) El nombre del jugador.
     * @param apellido (requerido) El apellido del jugador.
     * @param nickname (requerido) El nickname del jugador.
     * @param sueldo (requerido) El sueldo del jugador.
     * @param nacionalidad (requerido) La nacionalidad del jugador.     * 
     * @param estado (requerido) El estado del jugador.
     * @param telefono (requerido) El telefono del jugador.
     * @param equipo (requerido) El equipo del jugador.
     */
    public Jugador(int cod_jugador, String nombre, String apellido, String nickname, int sueldo, String nacionalidad, String estado, String telefono, Equipo equipo) {
        this.cod_jugador = cod_jugador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.sueldo = sueldo;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
        this.telefono = telefono;
        this.equipo = equipo;
    }

    /**
     * Es un Get que devuelve el codigo del jugador.
     *
     * @return cod_jugador devuelve el codigo jugador
     */
    public int getCod_jugador() {
        return cod_jugador;
    }

    /**
     * Es un Set que establece el codigo del jugador.
     *
     * @param cod_jugador establece el codigo del jugador
     */
    public void setCod_jugador(int cod_jugador) {
        this.cod_jugador = cod_jugador;
    }

    /**
     * Es un Get que devuelve el nombre del jugador.
     *
     * @return nombre devuelve el nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Es un Set que establece el nombre del jugador.
     *
     * @param nombre establece el nombre del jugador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Es un Get que devuelve el apellido del jugador.
     *
     * @return apellido devuelve el apellido del jugador
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Es un Set que establece el apellido del jugador.
     *
     * @param apellido establece el apellido del jugador
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Es un Get que devuelve el nickname del jugador.
     *
     * @return nickname devuelve el nickname del jugador
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Es un Set que establece el nickname del jugador.
     *
     * @param nickname establece el nickname del jugador
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Es un Get que devuelve el sueldo del jugador.
     *
     * @return sueldo devuelve el sueldo del jugador
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * Es un Set que establece el sueldo del jugador.
     *
     * @param sueldo establece el sueldo del jugador
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Es un Get que devuelve la nacionalidad del jugador.
     *
     * @return nacionalidad devuelve la nacionalidad del jugador
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Es un Set que establece la nacionalidad del jugador.
     *
     * @param nacionalidad establece el nacionalidad del jugador
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Es un Get que devuelve el telefono del jugador.
     *
     * @return telefono devuelve el telefono del jugador
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Es un Set que establece el telefono del jugador.
     *
     * @param telefono establece el telefono del jugador
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Es un Get que devuelve el equipo del jugador.
     *
     * @return equipo devuelve el equipo del jugador
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Es un Set que establece el equipo del jugador.
     *
     * @param equipo establece el equipo del jugador
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    /**
     * Es un Get que devuelve el estado del jugador.
     * 
     * @return estado devuelve el estado del jugador
     */
    public String getEstado() {
        return estado;
    }
    /**
     * Es un Set que establece el estado del jugador.
     * 
     * @param estado establece el estado del jugador
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
