/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
    private ResultSet resultado;

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
    
    /**
     * Función que rellena un objeto administrador desde los datos de la base de
     * datos.
     *
     * @return devuelve un objeto de clase Administrador.
     * @throws Exception hereda excepciones.
     */
    public Administrador crearObjeto() throws Exception {
        Administrador a = new Administrador();

        a.setUsuario(resultado.getString("USUARIO"));
        a.setContraseña(resultado.getString("CONTRASEÑA"));
        return a;
    }
    
    /**
     * Función que crea un ArrayList con todos los administradores de la base de datos.
     *
     * @return devuelve un ArrayList de Administrador.
     * @throws Exception hereda excepciones.
     */
    public ArrayList<Administrador> consultarTodosAdministradores() throws Exception {
        ArrayList<Administrador> listaAdministradores = new ArrayList();

        bdr.conectar();

        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT * FROM ADMINISTRADOR");
        while (resultado.next()) {
            listaAdministradores.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaAdministradores;
    }

}
