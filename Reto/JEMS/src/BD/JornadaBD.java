/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Jornada;
import UML.Partido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase de jornada de base de datos.
 *
 * @author Eric Muñoz
 * @author Sergio Zulueta
 * @author Miguel Barros
 *
 * @see Jornada
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class JornadaBD {

    /**
     * Creacion de los atributos bdr, resultado, j, y jornadas.
     *
     */
    private static Bdr bdr;
    private ResultSet resultado;
    private Jornada j;

    /**
     * Constructor de JornadaBD con el objeto de la conexión a la base de datos.
     *
     */
    public JornadaBD() {
        bdr = new Bdr();
    }

    /**
     * Funcion para consultar todas las Jorandas.
     *
     * @return devuelve todas las jornadas
     * @throws Exception hereda excepciones
     */
    public ArrayList<Jornada> consultarJornadas() throws Exception {
        bdr.conectar();
        ArrayList<Jornada> listaJornadas = new ArrayList();
        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT COD_JORNADA,FECHA_INICIO,FECHA_FIN,LIGA_COD_LIGA FROM JORNADA");
        while (resultado.next()) {
            listaJornadas.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaJornadas;
    }

    /**
     * Funcion que crea un objeto de clase Jornada con los datos de la base de
     * datos.
     *
     * @return devuelve un objeto Jornada
     * @throws Exception hereda excepciones
     */
    public Jornada crearObjeto() throws Exception {
        j = new Jornada();
        j.setCod_jornada(resultado.getInt("COD_JORNADA"));
        j.setFecha_fin(resultado.getDate("FECHA_FIN"));
        j.setFecha_inicio(resultado.getDate("FECHA_INICIO"));
        LigaBD lBD = new LigaBD();        
        j.setLiga(lBD.consultarLiga());
        PartidoBD pBD = new PartidoBD();
        ArrayList<Partido> listaPartidos = pBD.consultarPartidosJornada(resultado.getInt("COD_JORNADA"));
        j.setPartidos(listaPartidos);
        return j;
    }

    /**
     * Funcion que consulta una Jornada mediante su codigo.
     *
     * @param codigo (requerido) codigo de la Jornada
     * @return devuelve un objeto Jornada
     * @throws Exception hereda excepciones
     */
    public Jornada consultarJornada(int codigo) throws Exception {
        bdr.conectar();
        String plantilla = "SELECT * FROM JORNADA WHERE COD_JORNADA = ?;";
        PreparedStatement ps = bdr.getCon().prepareStatement(plantilla);
        ps.setInt(1, codigo);
        resultado = ps.executeQuery();
        while (resultado.next()) {
            j = crearObjeto();
        }
        bdr.cerrarCon();
        return j;
    }
}
