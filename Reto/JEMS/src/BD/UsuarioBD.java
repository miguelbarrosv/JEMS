/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase de usuario de base de datos
 *
 * @author Joel Encinas
 * @author Eric Muñoz
 *
 * @see Usuario
 *
 * @version %I%, %G%
 * @since 1.0
 *
 *
 *
 */
public class UsuarioBD {

    /**
     * Creacion de los atributos bdr y resultado.
     */
    private static Bdr bdr;
    private ResultSet resultado;

    /**
     * Constructor de UsuarioBD con el objeto de la conexión a la base de datos.
     */
    public UsuarioBD() {
        bdr = new Bdr();
    }

    /**
     *
     * @param u (requerido) objeto de clase Usuario.
     * @throws Exception hereda excepciones
     */
    public void insertarUsuario(Usuario u) throws Exception {
        bdr.conectar();
        String plantilla = "INSERT INTO USUARIO (USUARIO,CONTRASEÑA)VALUES(?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, u.getUsuario());
        sentenciaPre.setString(2, u.getContraseña());
        bdr.cerrarCon();
    }

    /**
     * Función que busca un usuario en la base de datos.
     *
     * @param u (requerido) objeto de clase Usuario.
     * @return devuelve un objeto clase usuario.
     * @throws Exception hereda excepciones.
     */
    public Usuario consultarUsuario(Usuario u) throws Exception {
        bdr.conectar();

        String plantilla = "SELECT * FROM USUARIO WHERE COD_USUARIO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, u.getCod_usuario());

        resultado = sentenciaPre.executeQuery();
        if (resultado.next()) {
            u = crearObjeto();
        } else {
            u = null;
        }

        bdr.cerrarCon();
        return u;
    }

    /**
     * Función que busca un usuario en la base de datos.
     *
     * @param codUsuario (requerido) codigo del Usuario.
     * @return devuelve un objeto clase usuario.
     * @throws Exception hereda excepciones.
     */
    public Usuario consultarUsuarioCodigo(int codUsuario) throws Exception {
        bdr.conectar();

        String plantilla = "SELECT * FROM USUARIO WHERE COD_USUARIO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, codUsuario);
        Usuario u;
        resultado = sentenciaPre.executeQuery();
        if (resultado.next()) {
            u = crearObjeto();
        } else {
            u = null;
        }

        bdr.cerrarCon();
        return u;
    }

    /**
     * Función que rellena un objeto usuario desde los datos de la base de
     * datos.
     *
     * @return devuelve un objeto de clase Usuario.
     * @throws Exception herada excepciones.
     */
    public Usuario crearObjeto() throws Exception {
        Usuario u = new Usuario();

        u.setUsuario(resultado.getString("USUARIO"));
        u.setContraseña(resultado.getString("CONTRASEÑA"));
        return u;
    }

    /**
     * Función que crea un ArrayList con todos los usuarios de la base de datos.
     *
     * @return devuelve un ArrayList de Usuario.
     * @throws Exception hereda excepciones.
     */
    public ArrayList<Usuario> consultaTodosUsuarios() throws Exception {
        bdr.conectar();
        
        ArrayList<Usuario> listaUsuarios = new ArrayList();

        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT * FROM usuario");
        while (resultado.next()) {
            listaUsuarios.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaUsuarios;
    }

    /**
     * Función que borra un jugador de la base de datos.
     *
     * @param codUsuario (requerido) codigo del Usuario.
     * @throws Exception hereda excepciones.
     */
    public void borrarUsuario(int codUsuario) throws Exception {
        bdr.conectar();

        String plantilla = "DELETE FROM USUARIO WHERE COD_USUARIO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, codUsuario);

        sentenciaPre.executeUpdate();

        bdr.cerrarCon();
    }

    /**
     * Función para modificar un usuario.
     *
     * @param u (requerido) objeto de clase Usuario.
     * @throws Exception heredar excepciones
     */
    public void modificarUsuario(Usuario u) throws Exception {
        bdr.conectar();

        String plantilla = "UPDATE USUARIO SET USUARIO=?, CONTRASEÑA=? WHERE COD_USUARIO=?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, u.getUsuario());
        sentenciaPre.setString(2, u.getContraseña());
        sentenciaPre.setInt(3, u.getCod_usuario());

        sentenciaPre.executeUpdate();

        bdr.cerrarCon();
    }

}
