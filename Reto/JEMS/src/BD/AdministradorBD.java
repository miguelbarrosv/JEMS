/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase de administrador de base de datos.
 *
 * @author Joel Encinas
 * @author Sergio Zulueta
 * @author Eric Muñoz
 *
 * @see Administrador
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class AdministradorBD {

    /**
     * Creacion de los atributos bdr y resultado.
     */
    private static Bdr bdr;
    private ResultSet resultado;

    /**
     * Constructor de DueñoBD con el objeto de la conexión a la base de datos.
     *
     */
    public AdministradorBD() {
        bdr = new Bdr();
    }

    /**
     * Función para insertar un Administrador.
     *
     * @param a (requerido) objeto de clase Administrador
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public void insertarAdministrador(Administrador a) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "INSERT INTO ADMINISTRADOR(USUARIO, CONTRASEÑA) VALUES (?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, a.getUsuario());
        sentenciaPre.setString(2, a.getContraseña());
        bdr.cerrarCon();
    }

    /**
     * Función para borrar un Administrador
     *
     * @param cod_admin (requerido) codigo del Administrador
     * @throws Exception herada excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public void borrarAdministrador(int cod_admin) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "DELETE FROM ADMINISTRADOR WHERE COD_ADMIN =?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_admin);
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Función que rellena un objeto administrador desde los datos de la base de
     * datos.
     *
     * @return devuelve un objeto de clase Administrador
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public Administrador crearObjeto() throws Exception, SQLException {
        Administrador a = new Administrador();
        a.setCod_admin(resultado.getInt("COD_ADMIN"));
        a.setUsuario(resultado.getString("USUARIO"));
        a.setContraseña(resultado.getString("CONTRASEÑA"));
        return a;
    }

    /**
     * Función que busca un Administrador por nombre.
     *
     * @param usuario (requerido) usuario del Adminustrador
     * @return devuelve un objeto clase Administrador
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public Administrador consultarAdministradorNombre(String usuario) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "SELECT COD_ADMIN,USUARIO,CONTRASEÑA FROM ADMINISTRADOR WHERE USUARIO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, usuario);
        Administrador a;
        resultado = sentenciaPre.executeQuery();
        if (resultado.next()) {
            a = crearObjeto();
        } else {
            a = null;
        }
        bdr.cerrarCon();
        return a;
    }

    /**
     * Función que busca un Adminstrador en la base de datos mediante usuario y
     * contraseña.
     *
     * @param usuario (reuqerido) usuario del Administrador
     * @param contraseña (requerido ) contraseña de Administrador
     * @return devuelve un objeto clase Administrador
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public Boolean consultarAdministrador(String usuario, String contraseña) throws Exception, SQLException {
        bdr.conectar();

        String plantilla = "SELECT USUARIO,CONTRASEÑA FROM ADMINISTRADOR WHERE USUARIO=? AND CONTRASEÑA=?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, usuario);
        sentenciaPre.setString(2, contraseña);
        Boolean existe;
        resultado = sentenciaPre.executeQuery();
        existe = resultado.next();
        bdr.cerrarCon();
        return existe;
    }
}
