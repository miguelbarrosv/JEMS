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
 * Clase de Usuario de base de datos.
 *
 * @author Joel Encinas
 * @author Eric Muñoz
 * @author Sergio Zulueta
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
     *
     */
    private static Bdr bdr;
    private ResultSet resultado;

    /**
     * Constructor de UsuarioBD con el objeto de la conexión a la base de datos.
     *
     */
    public UsuarioBD() {
        bdr = new Bdr();
    }

    /**
     * Funcion que inserta un Usuario en la base de datos.
     *
     * @param u (requerido) objeto de clase Usuario
     * @throws Exception hereda excepciones
     * @throws SQLException hereda excepciones de sql
     */
    public void insertarUsuario(Usuario u) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "INSERT INTO USUARIO (USUARIO,CONTRASEÑA)VALUES(?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, u.getUsuario());
        sentenciaPre.setString(2, u.getContraseña());
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Función que busca un Usuario en la base de datos mediante su codigo.
     *
     * @param codUsuario (requerido) codigo del Usuario
     * @return devuelve un objeto clase Usuario
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public Usuario consultarUsuarioCodigo(int codUsuario) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "SELECT COD_USUARIO,USUARIO,CONTRASEÑA FROM USUARIO WHERE COD_USUARIO= ?";
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
     * Función que busca un usuario especifico en la base de datos.
     *
     * @param usuario (requerido) usuario del Usuario
     * @return devuelve un objeto clase usuario
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public Usuario consultarUsuarioNombre(String usuario) throws Exception, SQLException {
        bdr.conectar();

        String plantilla = "SELECT COD_USUARIO,USUARIO,CONTRASEÑA FROM USUARIO WHERE USUARIO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, usuario);
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
     * Función que busca un Usuario en la base de datos mediante usuario y
     * contraseña.
     *
     * @param usuario (requerido) usuario del Usuario
     * @param contraseña (requerido ) contraseña de Usuario
     * @return devuelve un objeto clase Usuario
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public Boolean consultarUsuario(String usuario, String contraseña) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "SELECT COD_USUARIO,USUARIO,CONTRASEÑA FROM USUARIO WHERE USUARIO=UPPER(?) AND CONTRASEÑA=UPPER(?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, usuario);
        sentenciaPre.setString(2, contraseña);
        Boolean existe;
        resultado = sentenciaPre.executeQuery();
        existe = resultado.next();
        bdr.cerrarCon();
        return existe;
    }

    /**
     * Función que busca un Usuario en la base de datos por usuario.
     *
     * @param usuario (requerido) usuario del Usuario
     * @return devuelve un booleano de si existe ese Usuario
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public Boolean consultarUsuario(String usuario) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "SELECT COD_USUARIO,USUARIO,CONTRASEÑA FROM USUARIO WHERE USUARIO=UPPER(?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, usuario);
        Boolean existe;
        resultado = sentenciaPre.executeQuery();
        existe = resultado.next();
        bdr.cerrarCon();
        return existe;
    }

    /**
     * Función que rellena un objeto Usuario desde los datos de la base de
     * datos.
     *
     * @return devuelve un objeto de clase Usuario
     * @throws Exception herada excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public Usuario crearObjeto() throws Exception, SQLException {
        Usuario u = new Usuario();
        u.setCod_usuario(resultado.getInt("COD_USUARIO"));
        u.setUsuario(resultado.getString("USUARIO"));
        u.setContraseña(resultado.getString("CONTRASEÑA"));
        return u;
    }

    /**
     * Función que crea un ArrayList con todos los Usuarios de la base de datos.
     *
     * @return devuelve un ArrayList de Usuario
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public ArrayList<Usuario> consultaTodosUsuarios() throws Exception, SQLException {
        bdr.conectar();
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT COD_USUARIO,USUARIO,CONTRASEÑA FROM usuario");
        while (resultado.next()) {
            listaUsuarios.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaUsuarios;
    }

    /**
     * Función que borra un Usuario de la base de datos.
     *
     * @param codUsuario (requerido) codigo del Usuario.
     * @throws Exception hereda excepciones.
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public void borrarUsuario(int codUsuario) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "DELETE FROM USUARIO WHERE COD_USUARIO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, codUsuario);
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Función para modificar un Usuario.
     *
     * @param u (requerido) objeto de clase Usuario.
     * @throws Exception heredar excepciones
     * @throws java.sql.SQLException hereda Excepciones SQL
     */
    public void modificarUsuario(Usuario u) throws Exception, SQLException {
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
