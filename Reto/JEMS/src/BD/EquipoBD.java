/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Equipo;
import UML.Jugador;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 * Clase de equipo de base de datos
 *
 * @author Joel Encinas
 * @author Eric Muñoz
 * @author Sergio Zulueta
 *
 * @see Jugador
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class EquipoBD {

    /**
     * Creacion de los atributos bdr, resultado y listaEquipos.
     */
    private static Bdr bdr;
    private ResultSet resultado;
    private String listaEquipos;

    public EquipoBD() {
        bdr = new Bdr();
    }

    /**
     *
     * @param e objeto de clase Equiipo.
     * @throws Exception hereda excepciones
     */
    public void insertarEquipo(Equipo e) throws Exception {
        bdr.conectar();
        String plantilla = "INSERT INTO EQUIPO (NOMBRE,NACIONALIDAD,PRESUPUESTO,DUEÑO_COD_CUENTA,PUNTUACION)VALUES(?,?,?,?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, e.getNombre());
        sentenciaPre.setString(2, e.getNacionalidad());
        sentenciaPre.setInt(3, e.getPresupuesto());
        //sentenciaPre.setString(4, e.getDueño().getCod_dueño());
        sentenciaPre.setInt(5, e.getPresupuesto());
        bdr.cerrarCon();

    }

    /**
     * Función que borra un equipo de la base de datos.
     *
     * @param e (requerido) objeto de clase Equipo.
     * @throws Exception hereda excepciones.
     */
    public void borrarEquipo(Equipo e) throws Exception {
        bdr.conectar();

        String plantilla = "DELETE FROM EQUIPO WHERE COD_EQUIPO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, e.getCod_equipo());

        sentenciaPre.executeUpdate();

        bdr.cerrarCon();
    }

    /**
     * Función para modificar un equipo.
     *
     * @param e (requerido) objeto de clase Equipo.
     * @throws Exception heredar excepciones
     */
    public void modificarEquipo(Equipo e) throws Exception {
        bdr.conectar();

        String plantilla = "UPDATE EQUIPO SET NOMBRE=?, NACIONALIDAD=?, PRESUPUESTO=?, DUEÑO_COD_CUENTA=?, PUNTUACION=? WHERE COD_EQUIPO=?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, e.getNombre());
        sentenciaPre.setString(2, e.getNacionalidad());
        sentenciaPre.setInt(3, e.getPresupuesto());
        //sentenciaPre.setString(4, e.getDueño().getCod_dueño());
        sentenciaPre.setInt(5, e.getPresupuesto());
        sentenciaPre.setInt(6, e.getCod_equipo());

        sentenciaPre.executeUpdate();

        bdr.cerrarCon();
    }

    /**
     * Función que busca un jugador en la base de datos.
     *
     * @param e objeto de clase Equipo.
     * @return devuelve un objeto de clase Equipo.
     * @throws Exception hereda excepciones.
     */
    public Equipo consultarEquipo(Equipo e) throws Exception {
        bdr.conectar();

        String plantilla = "SELECT * FROM JUGADOR WHERE COD_JUGADOR= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, e.getCod_equipo());

        resultado = sentenciaPre.executeQuery();
        if (resultado.next()) {
            e = crearObjeto();
        } else {
            e = null;
        }

        // Cerrar la conexión
        bdr.cerrarCon();
        return e;
    }

    /**
     * Función que rellena un objeto equipo desde los datos de la base de datos.
     *
     * @return devuelve un objeto de clase Equipo.
     * @throws Exception hereda excepciones.
     */
    public Equipo crearObjeto() throws Exception {
        Equipo e = new Equipo();

        e.setNombre(resultado.getString("NOMBRE"));
        e.setNacionalidad(resultado.getString("NACIONALIDAD"));
        e.setPresupuesto(Integer.parseInt(resultado.getString("PRESUPUESTO")));
        e.setPuntuacion(Integer.parseInt(resultado.getString("PUNTUACION")));
        //e.setDueño(dueño);
        //e.setLista_jugadores(lista_jugadores);
        //e.setLista_partidos(lista_partidos);

        return e;
    }

    /**
     * Función que crea un ArrayList con todos los equipos de la base de datos.
     *
     * @return devuelve un ArrayList de Equipo.
     * @throws Exception hereda excepciones.
     */
    /*    public ArrayList<Equipo> consultaTodosEquipos() throws Exception {
        ArrayList<Equipo> listaEquipos = new ArrayList();

        bdr.conectar();

        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT * FROM EQUIPO");
        while (resultado.next()) {
            listaEquipos.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaEquipos;
    }
     */
    /**
     * Funcion que ejecuta el procedimiento PROC_REF_EQUIPO
     *
     * @return devuelve un string con todos los equipos con el nombre de su
     * dueño y la cantidad de jugadores
     * @throws Exception hereda excepciones
     */
    public String consultarTodosEquipos() throws Exception {
        CallableStatement cStmt = bdr.getCon().prepareCall("{call PROC_REF_EQUIPO(?)}");
        cStmt.registerOutParameter(1, OracleTypes.CURSOR);
        cStmt.executeUpdate();
        ResultSet rs = (ResultSet) cStmt.getObject(1);
        while (rs.next());
        {
            listaEquipos = "Codigo: "+rs.getString("COD_EQUIPO");
            listaEquipos += "Nombre: " + rs.getString("NOMBRE");
            listaEquipos += "Nacionalidad: " + rs.getString("NACIONALIDAD");
            listaEquipos += "Presupuesto: " + rs.getString("PRESUPUESTO");
            listaEquipos += "Puntuacion: " + rs.getString("PUNTUACION");
            listaEquipos += "Codigo dueño: " + rs.getString("CODIGO_DUEÑO");
            listaEquipos += "Nombre dueño: " + rs.getString("NOMBRE_DUEÑO");
            listaEquipos += "Numero jugadores " + rs.getString("NUM_JUGADORES")+"\n";
        }
        rs.close();
        cStmt.close();
        return listaEquipos;
    }
}
