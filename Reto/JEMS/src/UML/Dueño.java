/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 * Creacion de la clase java para el Dueño.
 *
 * @author Sergio Zulueta
 * @author Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class Dueño {

    /**
     * Creacion de los atributos cod_dueño, nombre, apellido, telefono,
     * lista_equipos y equipos.
     *
     */
    private int cod_dueño;
    private String nombre;
    private String apellido;
    private String telefono;

    private ArrayList<Equipo> lista_equipos;

    /**
     * Constructor vacio. (Para invocación por constructores de subclases,
     * típicamente implícito.)
     */
    public Dueño() {
    }

    /**
     * Constructor lleno, solo atributos del dueño.
     *
     * @param cod_dueño (requerido) El codigo del dueño.
     * @param nombre (requerido) El nombre del dueño.
     * @param apellido (requerido) El apellido del dueño.
     * @param telefono (requerido) El telefono del dueño.
     */
    public Dueño(int cod_dueño, String nombre, String apellido, String telefono) {
        this.cod_dueño = cod_dueño;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    /**
     * Constructo lleno, incluyendo relaciones.
     *
     * @param cod_dueño (requerido) El codigo del dueño.
     * @param nombre (requerido) El nombre del dueño.
     * @param apellido (requerido) El apellido del dueño.
     * @param telefono (requerido) El telefono del dueño.
     * @param lista_equipos (requerido) Los equipos del dueño.
     */
    public Dueño(int cod_dueño, String nombre, String apellido, String telefono, ArrayList<Equipo> lista_equipos) {
        this.cod_dueño = cod_dueño;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.lista_equipos = lista_equipos;
    }

    /**
     * Es un Get que devuelve el codigo del dueño.
     *
     * @return cod_dueño devuelve el codigo
     */
    public int getCod_dueño() {
        return cod_dueño;
    }

    /**
     * Es un Set que establece el codigo del dueño.
     *
     * @param cod_dueño establece el codigo del dueño
     */
    public void setCod_dueño(int cod_dueño) {
        this.cod_dueño = cod_dueño;
    }

    /**
     * Es un Get que devuelve el nombre del dueño.
     *
     * @return getNombre devuelve el nombre del dueño
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Es un Set que establece el nombre del dueño.
     *
     * @param nombre establece el nombre del dueño
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Es un Get que devuelve el apellido del dueño.
     *
     * @return apellido devuelve el apellido del dueño
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Es un Set que establece el apellido del dueño.
     *
     * @param apellido establece el apellido del dueño
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Es un Get que devuelve el telefono del dueño.
     *
     * @return telefono devuelve el telefono del dueño
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Es un Set que establece el telefono del dueño.
     *
     * @param telefono establece el telefono del dueño
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Es un Get que devuelve la lista de equipos del dueño.
     *
     * @return lista_equipos devuelve la lista de equipos del dueño
     */
    public ArrayList<Equipo> getLista_equipos() {
        return lista_equipos;
    }

    /**
     * Es un Set que establece la lista de equipos del dueño.
     *
     * @param lista_equipos establece la lista de equipos
     */
    public void setLista_equipos(ArrayList<Equipo> lista_equipos) {
        this.lista_equipos = lista_equipos;
    }

}
