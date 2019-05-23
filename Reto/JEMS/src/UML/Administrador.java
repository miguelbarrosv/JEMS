/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 * Creacion de la clase java para el Administrador
 *
 * @author Sergio Zulueta
 * @author Eric Muñoz
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class Administrador {

    /**
     * Creacion de los atributos cod_admin, usuario y contraseña.
     */
    private int cod_admin;
    private String usuario;
    private String contraseña;

    /**
     * Constructor vacio. (Para invocación por constructores de subclases,
     * típicamente implícito.)
     */
    public Administrador() {
    }

    /**
     * Constructor lleno con todos atributos del administrador.
     *
     * @param cod_admin (requerido) El codigo del administrador.
     * @param usuario (requerido) El usuario del administrador.
     * @param contraseña (requerido) La contraseña del administrador.
     */
    public Administrador(int cod_admin, String usuario, String contraseña) {
        this.cod_admin = cod_admin;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    /**
     * Es un Get que devuelve el codigo del administrador.
     *
     * @return cod_admin devuelve el codigo del administrador
     */
    public int getCod_admin() {
        return cod_admin;
    }

    /**
     * Es un Set que establece el codigo del administrador.
     *
     * @param cod_admin establece el codigo del administrador
     */
    public void setCod_admin(int cod_admin) {
        this.cod_admin = cod_admin;
    }

    /**
     * Es un Get que devuelve el usuario del administrador.
     *
     * @return cod_admin devuelve el usuario del administrador
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Es un Set que establece el codigo del administrador.
     *
     * @param usuario establece el usuario del administrador
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Es un Get que devuelve la contraseña del administrador.
     *
     * @return cod_admin devuelve la contraseña del administrador
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Es un Set que establece el codigo del administrador.
     *
     * @param contraseña establece la contraseña del administrador
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
