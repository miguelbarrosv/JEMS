/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.ResultSet;
import UML.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase de dueño de base de datos
 *
 * @author Joel Encinas
 * @author Sergio Zulueta
 *
 * @see Jugador
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class DueñoBD {

    /**
     * Creacion de los atributos resultado y bdr.
     */
    private static ResultSet resultado;
    private static Bdr bdr;

    /**
     * Constructor de DueñoBD con el objeto de la conexión a la base de datos.
     */
    public DueñoBD() {
        bdr = new Bdr();
    }

    /**
     * Función para insertar jugador.
     *
     * @param d (requerido) objeto de clase Dueño.
     * @throws Exception hereda excepciones.
     */
    public void insertarDueño(Dueño d) throws Exception {
        bdr.conectar();
        String plantilla = "INSERT INTO DUEÑO(NOMBRE,APELLIDO,NICKNAME,SUELDO,NACIONALIDAD,ESTADO,TELEFONO,EQUIPO_COD_EQUIPO) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, d.getNombre());
        sentenciaPre.setString(2, d.getApellido());
        sentenciaPre.setString(3, d.getTelefono());
        bdr.cerrarCon();
    }

    /**
     * Función que busca un dueño en la base de datos.
     *
     * @param d (requerido) objeto de clase Dueño.
     * @return devuelve un objeto clase dueño.
     * @throws Exception hewreda excepciones.
     */
    public Dueño consultarDueño(Dueño d) throws Exception {
        bdr.conectar();

        String plantilla = "SELECT * FROM DUEÑO WHERE COD_DUEÑO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, d.getCod_dueño());

        resultado = sentenciaPre.executeQuery();
        if (resultado.next()) {
            d = crearObjeto();
        } else {
            d = null;
        }

        bdr.cerrarCon();
        return d;
    }

    /**
     * Función que rellena un objeto jugador desde los datos de la base de
     * datos.
     *
     * @return devuelve un objeto de clase Jugador.
     * @throws Exception herada excepciones.
     */
    public Dueño crearObjeto() throws Exception {
        ArrayList<Equipo> lista_equipos;
        Dueño d = new Dueño();

        d.setNombre(resultado.getString("NOMBRE"));
        d.setApellido(resultado.getString("APELLIDO"));
        d.setTelefono(resultado.getString("TELEFONO"));
        //lista_equipos = resultado.getObject();

        //d.setLista_equipos(lista_equipos);
        return d;
    }

    /**
     * Función que crea un ArrayList con todos los Dueños de la base de datos.
     *
     * @return devuelve un ArrayList de Dueño.
     * @throws Exception hereda excepciones.
     */
    public ArrayList<Dueño> consultaTodosDueños() throws Exception {
        ArrayList<Dueño> listaDueños = new ArrayList();

        bdr.conectar();

        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT * FROM DUEÑO");
        while (resultado.next()) {
            listaDueños.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaDueños;
    }

    /**
     * Función que borra un Dueño de la base de datos.
     *
     * @param d (requerido) objeto de clase Dueño
     * @throws Exception hereda de excepciones
     */
    public void borrarDueño(Dueño d) throws Exception {
        bdr.conectar();

        String plantilla = "DELETE FROM DUEÑO WHERE COD_DUEÑO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, d.getCod_dueño());

        sentenciaPre.executeUpdate();

        bdr.cerrarCon();
    }

    /**
     * Funcion que modifica un Dueño.
     *
     * @param d (requerido) objeto de clase Dueño
     * @throws Exception hereda de excepciones
     */
    public void modificarDueño(Dueño d) throws Exception {
        bdr.conectar();

        String plantilla = "UPDATE DUEÑO SET NOMBRE=?, APELLIDO=?, TELEFONO=? WHERE COD_DUEÑO=? ";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, d.getNombre());
        sentenciaPre.setString(2, d.getApellido());
        sentenciaPre.setString(3, d.getTelefono());

        bdr.cerrarCon();
    }

}
