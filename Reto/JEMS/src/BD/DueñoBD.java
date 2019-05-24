/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.ResultSet;
import UML.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase de Dueño de base de datos.
 *
 * @author Joel Encinas
 * @author Sergio Zulueta
 * @author Eric Muñoz
 * @author Miguel Barros
 *
 * @see Dueño
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class DueñoBD {

    /**
     * Creacion de los atributos resultado y bdr.
     *
     */
    private static ResultSet resultado;
    private static Bdr bdr;

    /**
     * Constructor de DueñoBD con el objeto de la conexión a la base de datos.
     *
     */
    public DueñoBD() {
        bdr = new Bdr();
    }

    /**
     * Función para insertar un Dueño.
     *
     * @param d (requerido) objeto de clase Dueño
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public void insertarDueño(Dueño d) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "INSERT INTO DUEÑO(NOMBRE,APELLIDO,TELEFONO) VALUES (?,?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, d.getNombre());
        sentenciaPre.setString(2, d.getApellido());
        sentenciaPre.setString(3, d.getTelefono());
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Función que rellena un objeto dueño desde los datos de la base de datos.
     *
     * @return devuelve un objeto de clase Dueño
     * @throws Exception herada excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public Dueño crearObjeto() throws Exception, SQLException {
        Dueño d = new Dueño();
        d.setCod_dueño(resultado.getInt("COD_DUEÑO"));
        d.setNombre(resultado.getString("NOMBRE"));
        d.setApellido(resultado.getString("APELLIDO"));
        d.setTelefono(resultado.getString("TELEFONO"));
        return d;
    }

    /**
     * Función que rellena un objeto dueño desde los datos de la base de datos y
     * los equipos que es dueño.
     *
     * @return devuelve un objeto de clase Dueño
     * @throws Exception herada excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public Dueño crearObjetoConListaEquipos() throws Exception, SQLException {
        Dueño d = new Dueño();
        d.setNombre(resultado.getString("NOMBRE"));
        d.setApellido(resultado.getString("APELLIDO"));
        d.setTelefono(resultado.getString("TELEFONO"));
        EquipoBD eBD = new EquipoBD();
        ArrayList<Equipo> listaEquipos = eBD.consultaEquipos();
        d.setLista_equipos(listaEquipos);
        return d;
    }

    /**
     * Funcion para buscar un Dueño mediante el codigo.
     *
     * @param cod_dueño (requerido) codigo del Dueño
     * @return d objeto de clase Dueño
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public Dueño consultarDueñoCodigo(int cod_dueño) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "SELECT COD_DUEÑO,NOMBRE,APELLIDO,TELEFONO FROM DUEÑO WHERE COD_DUEÑO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_dueño);
        resultado = sentenciaPre.executeQuery();
        Dueño d;
        if (resultado.next()) {
            d = crearObjeto();
        } else {
            d = null;
        }
        bdr.cerrarCon();
        return d;
    }

    /**
     * Función que crea un ArrayList con todos los Dueños de la base de datos.
     *
     * @return devuelve un ArrayList de Dueño
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public ArrayList<Dueño> consultaTodosDueños() throws Exception, SQLException {
        ArrayList<Dueño> listaDueños = new ArrayList();
        bdr.conectar();
        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT COD_DUEÑO,NOMBRE,APELLIDO,TELEFONO FROM DUEÑO");
        while (resultado.next()) {
            listaDueños.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaDueños;
    }

    /**
     * Función que borra un Dueño de la base de datos.
     *
     * @param cod_dueño (requerido) codigo del Dueño
     * @throws Exception hereda de excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public void borrarDueño(int cod_dueño) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "DELETE FROM DUEÑO WHERE COD_DUEÑO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_dueño);
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }

    /**
     * Funcion que modifica un Dueño.
     *
     * @param d (requerido) objeto de clase Dueño
     * @throws Exception hereda de excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public void modificarDueño(Dueño d) throws Exception, SQLException {
        bdr.conectar();
        String plantilla = "UPDATE DUEÑO SET NOMBRE=?, APELLIDO=?, TELEFONO=? WHERE COD_DUEÑO=? ";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, d.getNombre());
        sentenciaPre.setString(2, d.getApellido());
        sentenciaPre.setString(3, d.getTelefono());
        sentenciaPre.setInt(4, d.getCod_dueño());
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();
    }
}
