/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.*;
import java.sql.PreparedStatement;

/**
 * Clase de administrador de base de datos
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
     * Creacion de los atributos bdr.
     */
    private static Bdr bdr;

    /**
     * Constructor de DueñoBD con el objeto de la conexión a la base de datos.
     */
    public AdministradorBD() {
        bdr = new Bdr();
    }

    /**
     * Función para insertar un Administrador.
     *
     * @param a (requerido) objeto de clase Administrador.
     * @throws Exception hereda excepciones.
     */
    public void insertarAdministrador(Administrador a) throws Exception {
        bdr.conectar();

        String plantilla = "INSERT INTO ADMINISTRADOR(USUARIO, CONTRASEÑA) VALUES (?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, a.getUsuario());
        sentenciaPre.setString(2, a.getContraseña());

        bdr.cerrarCon();
    }

    /**
     * Función para borrar un Administrador.
     *
     * @param cod_admin (requerido) codigo del administrador
     * @throws Exception
     */
    public void borrarAdministrador(int cod_admin) throws Exception {
        bdr.conectar();

        String plantilla = "DELETE FROM ADMINISTRADOR WHERE COD_ADMIN =?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_admin);

        sentenciaPre.executeUpdate();

        bdr.cerrarCon();
    }

}
