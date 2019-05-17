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
public class Usuario {

    /**
     * Creacion de los atributos cod_usuario, usuario y contraseña.
     */
    private int cod_usuario;
    private String usuario;
    private String contraseña;

    /**
     * Constructor vacio. (Para invocación por constructores de subclases,
     * típicamente implícito.)
     */
    public Usuario() {
    }

    /**
     * Constructor lleno con todos atributos del usuario.
     *
     * @param cod_usuario (requerido) El codigo del usuario.
     * @param usuario (requerido) El usuario del usuario.
     * @param contraseña (requerido) La contraseña del usuario.
     */
    public Usuario(int cod_usuario, String usuario, String contraseña) {
        this.cod_usuario = cod_usuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    /**
     * Es un Get que devuelve el codigo del usuario.
     *
     * @return cod_admin devuelve el codigo del usuario
     */
    public int getCod_usuario() {
        return cod_usuario;
    }

    /**
     * Es un Set que establece el codigo del usuario.
     *
     * @param cod_usuario establece el codigo del usuario
     */
    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    /**
     * Es un Get que devuelve el usuario del usuario.
     *
     * @return cod_usuario devuelve el usuario del usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Es un Set que establece el codigo del usuario.
     *
     * @param usuario establece el usuario del usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Es un Get que devuelve la contraseña del usuario.
     *
     * @return cod_usuario devuelve la contraseña del usuario
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Es un Set que establece el codigo del usuario.
     *
     * @param contraseña establece la contraseña del usuario
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
