/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jems;

/**
 * Controladora de nuestro proyecto JEMS
 * https://www.oracle.com/technetwork/articles/java/index-137868.html
 *
 * @author Sergio Zulueta
 * @author Miguel Barros
 * @author Joel Encinas
 * @author Eric Muñoz
 *
 * @see JEMS
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
import Vistas.*;
import BD.*;
import UML.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class JEMS {

    /**
     * Creacion de los atributos listaPartidos, listaJugadores, listaEquipos,
     * listaDueños, listaUsiarios, listaJornadas, dBD, JBD, eBD, uBD, aBD, lBD,
     * pBD, jorBD, d, e, j, u, a y l.
     *
     */
    private static ArrayList<Partido> listaPartidos;
    private static ArrayList<Jugador> listaJugadores;
    private static ArrayList<Equipo> listaEquipos;
    private static ArrayList<Dueño> listaDueños;
    private static ArrayList<Usuario> listaUsuarios;
    private static ArrayList<Jornada> listaJornadas;
    private static DueñoBD dBD;
    private static JugadorBD jBD;
    private static EquipoBD eBD;
    private static UsuarioBD uBD;
    private static AdministradorBD aBD;
    private static LigaBD lBD;
    private static PartidoBD pBD;
    private static JornadaBD jorBD;
    private static Dueño d;
    private static Equipo e;
    private static Jugador j;
    private static Usuario u;
    private static Administrador a;
    private static Liga l;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dBD = new DueñoBD();
        jBD = new JugadorBD();
        eBD = new EquipoBD();
        dBD = new DueñoBD();
        uBD = new UsuarioBD();
        aBD = new AdministradorBD();
        lBD = new LigaBD();
        jorBD = new JornadaBD();
        pBD = new PartidoBD();
        ControladorVistas.mostrarVentanaLogin();
    }

    /**
     * Funcion para dar de alta a un jugador.
     *
     * @param nombre (requerido) nombre del jugador
     * @param apellido (requerido) apellido del jugador
     * @param nick (requerido) nickname del jugador
     * @param sueldo (requerido) sueldo del jugador
     * @param nacionalidad (requerido) nacionalidad del jugador
     * @param estado (requerido) estado del jugador
     * @param telefono (requerido) telefono del jugador
     * @param equipo (requerido) equipo del jugador
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void altaJugador(String nombre, String apellido, String nick, int sueldo, String nacionalidad, String estado, String telefono, Integer equipo) throws Exception, SQLException {
        j = new Jugador();
        j.setNombre(nombre);
        j.setApellido(apellido);
        j.setNickname(nick);
        j.setSueldo(sueldo);
        j.setNacionalidad(nacionalidad);
        j.setEstado(estado);
        j.setTelefono(telefono);
        if (equipo == null) {
            jBD.insertarJugadorSinEquipo(j);
        } else {
            e = eBD.consultarEquipoCodigo(equipo);
            j.setEquipo(e);
        }
        jBD.insertarJugador(j);
    }

    /**
     * Un Get para el numero de equipos que hay.
     *
     * @return listaEquipos lista de tdos los equipos
     */
    public static int getNumeroEquipos() {
        return listaEquipos.size();
    }

    /**
     * un Get de el nombre del equipo de la posicion x.
     *
     * @param x (requerido) numero del equipo en el ArrayList
     * @return devuelve el nombre del equipo
     */
    public static String getNombreEquipo(int x) {

        return listaEquipos.get(x).getNombre();
    }

    /**
     * Funcion que llama a la funcion de EquipoBD para rellenar la lista de
     * equipos de la base de datos.
     *
     * @return devuelve la lista de equipos
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static ArrayList<Equipo> rellenarListaEquipos() throws Exception, SQLException {
        listaEquipos = eBD.consultaEquipos();
        return listaEquipos;
    }

    /**
     * Funcion que llama a la funcion de DueñoBD para rellenar la lista de
     * dueños de la base de datos.
     *
     * @return devuelve la lista de dueños
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static ArrayList<Dueño> getListaDueños() throws Exception, SQLException {
        listaDueños = dBD.consultaTodosDueños();
        return listaDueños;
    }

    /**
     * Funcion que llama a la funcion de DueñoBD para rellenar la lista de
     * dueños de la base de datos.
     *
     * @return devuelve la lista de dueños
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static ArrayList<Equipo> getListaEquipos() throws Exception, SQLException {
        listaEquipos = eBD.consultaEquipos();
        return listaEquipos;
    }

    /**
     * Funcion que nos dirije a la clase modificacionJugador situado en
     * JugadorBD para pasarle los`parametros recogidos de la ventana V_Jugador y
     * asi modificar aun jugador ya existente.
     *
     *
     * @param codJugador (requerido) codigo jugador
     * @param nombre (requerido) nombre del jugador
     * @param apellido (requerido) apellido del jugador
     * @param nick (requerido) nickname del jugador
     * @param sueldo (requerido) sueldo del jugador
     * @param nacionalidad (requerido) nacionalidad del jugador
     * @param estado (requerido) estado del jugador
     * @param telefono (requerido) telefono del jugador
     * @param equipo (requerido) equipo del jugador
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void modificarJugador(int codJugador, String nombre, String apellido, String nick, int sueldo, String nacionalidad, String estado, String telefono, Integer equipo) throws Exception, SQLException {
        j = new Jugador();
        j.setCod_jugador(codJugador);
        j.setNombre(nombre);
        j.setApellido(apellido);
        j.setNickname(nick);
        j.setSueldo(sueldo);
        j.setNacionalidad(nacionalidad);
        j.setEstado(estado);
        j.setTelefono(telefono);
        e = eBD.consultarEquipoCodigo(equipo);
        j.setEquipo(e);
        jBD.modificarJugador(j);
    }

    /**
     * Funcion que nos dirije a la clase bajaJugador situado en JugadorBD para
     * pasarle los`parametros recogidos de la ventana V_Jugador y asi dar de
     * baja a un jugador.
     *
     * @param codJugador (requerido) codigo del jugador a borrar
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void borrarJugador(int codJugador) throws Exception, SQLException {
        jBD.borrarJugador(codJugador);
    }

    /**
     * Funcion para poner todos los jugadores en una lista.
     *
     * @return listaJugadores lista de todos los jugadores
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static String crearListaJugadores() throws Exception, SQLException {
        listaJugadores = jBD.consultaTodosJugadores();
        String stringJugadores = "";
        for (int x = 0; x < listaJugadores.size(); x++) {
            if (listaJugadores.get(x).getEquipo() == null) {
                stringJugadores += "codigo: " + listaJugadores.get(x).getCod_jugador() + " nombre: " + listaJugadores.get(x).getNombre() + " apellido: " + listaJugadores.get(x).getApellido() + " nickname: " + listaJugadores.get(x).getNickname() + " sueldo: " + listaJugadores.get(x).getSueldo() + " nacionalidad: " + listaJugadores.get(x).getNacionalidad() + " estado: " + listaJugadores.get(x).getEstado() + " telefono: " + listaJugadores.get(x).getTelefono() + "\n\n";
            } else {
                stringJugadores += "codigo: " + listaJugadores.get(x).getCod_jugador() + " nombre: " + listaJugadores.get(x).getNombre() + " apellido: " + listaJugadores.get(x).getApellido() + " nickname: " + listaJugadores.get(x).getNickname() + " sueldo: " + listaJugadores.get(x).getSueldo() + " nacionalidad: " + listaJugadores.get(x).getNacionalidad() + " estado: " + listaJugadores.get(x).getEstado() + " telefono: " + listaJugadores.get(x).getTelefono() + " equipo: " + listaJugadores.get(x).getEquipo().getNombre() + "\n\n";
            }
        }
        return stringJugadores;
    }

    /**
     * Funcion para consultar un jugador mediante su codigo.
     *
     * @param cod_jugador (requerido) codigo del jugador
     * @return j objeto de un jugador
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static Jugador consultarJugador(int cod_jugador) throws Exception, SQLException {
        j = jBD.consultarJugadorCodigo(cod_jugador);
        return j;
    }

    /**
     * Funcion que nos dirije a la clase modificacicarEquipo situado en EquipoBD
     * para pasarle los parametros de la ventana V_Equipo y asi modificar un
     * equipo.
     *
     * @param codEquipo (requerido) codigo del equipo
     * @param nombre (requerido) nombre del equipo
     * @param nacionalidad (requerido) nacionalidad del equipo
     * @param presupuesto (requerido) presupuesto del equipo
     * @param puntuacion (requerido) puntuacion del equipo
     * @param dueño (requerido) dueño del equipo
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void modificarEquipo(int codEquipo, String nombre, String nacionalidad, int presupuesto, int puntuacion, int dueño) throws Exception, SQLException {
        d = dBD.consultarDueñoCodigo(dueño);
        e = new Equipo();
        e.setCod_equipo(codEquipo);
        e.setNombre(nombre);
        e.setNacionalidad(nacionalidad);
        e.setPresupuesto(presupuesto);
        e.setPuntuacion(puntuacion);
        e.setDueño(d);
        eBD.modificarEquipo(e);
    }

    /**
     * Funcion que nos dirije a la clase insertarEquipo situada en EquipoBD para
     * pasarle los parametros de la ventana V_Equipo y asi añadir un equipo
     * nuevo.
     *
     * @param nombre (requerido) nombre del equipo
     * @param nacionalidad (requerido) nacionalidad del equipo
     * @param presupuesto (requerido) presupuesto del equipo
     * @param puntuacion (requerido) puntuacion del equipo
     * @param dueño (requerido) dueño del equipo
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void altaEquipo(String nombre, String nacionalidad, int presupuesto, int puntuacion, int dueño) throws Exception, SQLException {
        d = dBD.consultarDueñoCodigo(dueño);
        e = new Equipo(nombre, nacionalidad, presupuesto, puntuacion, d);
        eBD.insertarEquipo(e);
    }

    /**
     * Funcion que nos dirije a la clase borrarEquipo situada en EquipoBD para
     * pasarle los parametros de la ventana V_Equipo y asi borrar a un equipo ya
     * existente.
     *
     * @param codEquipo (requerido) codigo equipo
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void bajaEquipo(int codEquipo) throws Exception, SQLException {
        eBD.borrarEquipo(codEquipo);
    }

    /**
     * Funcion para poner todos los equipos en una lista.
     *
     * @return listaequipos lista de todos los equipos
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static String crearListaEquipos() throws Exception, SQLException {
        String stringEquipos = eBD.consultarTodosEquipos();
        return stringEquipos;
    }

    /**
     * Funcion para buscar el dueño en un equipo.
     *
     * @param codigoEquipo codigo del equipo
     * @return objeto equipo
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static Equipo buscarEquipo(int codigoEquipo) throws Exception, SQLException {
        e = eBD.consultarEquipoCodigo(codigoEquipo);
        return e;
    }

    /**
     * Funcion que nos dirije a la clase modificarDueño situada en DueñoBD para
     * pasarle los parametros de la ventana V_Dueño y asi modificar un dueño ya
     * existente.
     *
     * @param codigoDueño (requerido) codigo del dueño
     * @param nombre (requerido) nombre del dueño
     * @param apellido (requerido) apellido del dueño
     * @param telefono (requerido) telefono del dueño
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void modificarDueño(int codigoDueño, String nombre, String apellido, String telefono) throws Exception, SQLException {
        d = new Dueño();
        d.setCod_dueño(codigoDueño);
        d.setNombre(nombre);
        d.setApellido(apellido);
        d.setTelefono(telefono);
        dBD.modificarDueño(d);
    }

    /**
     * Funcion que nos dirije a la clase insertarDueño situada en DueñoBD para
     * pasarle los parametros de la ventana V_Dueño y asi dar de alta a un nuevo
     * dueño.
     *
     * @param nombre (requerido) nombre del dueño
     * @param apellido (requerido) apellido del dueño
     * @param telefono (requerido) telefono del dueño
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void altaDueño(String nombre, String apellido, String telefono) throws Exception, SQLException {
        d = new Dueño();
        d.setNombre(nombre);
        d.setApellido(apellido);
        d.setTelefono(telefono);
        dBD.insertarDueño(d);
    }

    /**
     * Funcion que nos dirije a la clase borrarDueño situada en DueñoBD para
     * pasarle los parametros de la ventana V_Dueño y asi borrar a un dueño ya
     * existente.
     *
     * @param codDueño (requerido) codigo del dueño
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void bajaDueño(int codDueño) throws Exception, SQLException {
        dBD.borrarDueño(codDueño);
    }

    /**
     * Funcion para sacar los datos de un dueño de la base de datos mediante su
     * codigo.
     *
     * @param codDueño codigo del dueño
     * @return objeto dueño
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static Dueño consultarDueño(int codDueño) throws Exception, SQLException {
        d = dBD.consultarDueñoCodigo(codDueño);
        return d;
    }

    /**
     * Funcion que crea una lista de todos los dueños con sus equipos.
     *
     * @return lista de dueños
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static String crearListaDueños() throws Exception, SQLException {
        listaDueños = dBD.consultaTodosDueños();
        String stringDueños = "";
        for (int x = 0; x < listaDueños.size(); x++) {
            String stringEquipos = "";
            listaEquipos = eBD.consultaEquiposCodDueño(listaDueños.get(x).getCod_dueño());
            for (int y = 0; y < listaEquipos.size(); y++) {
                stringEquipos += listaEquipos.get(y).getNombre() + ", ";
            }
            stringDueños += "codigo: " + listaDueños.get(x).getCod_dueño() + " nombre: " + listaDueños.get(x).getNombre() + " apellido: " + listaDueños.get(x).getApellido() + " telefono: " + listaDueños.get(x).getTelefono() + " equipos: " + stringEquipos + "\n\n";
        }
        return stringDueños;
    }

    /**
     * Funcion que nos dirije a la clase modificarUsuario situada en UsuarioBD
     * para pasarle los parametros de la ventana V_Usuario y asi modificar un
     * usuario ya existente.
     *
     * @param codigoUsuario (requerido) codigo del usuario
     * @param usuario (requerido) usuario del usuario
     * @param contraseña (requerido) contraseña del usuario
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void modificarUsuario(int codigoUsuario, String usuario, String contraseña) throws Exception, SQLException {
        u = new Usuario();
        u.setCod_usuario(codigoUsuario);
        u.setUsuario(usuario);
        u.setContraseña(contraseña);
        uBD.modificarUsuario(u);
    }

    /**
     * Funcion que nos dirije a la clase insertarUsuario situada en UsuarioBD
     * para pasarle los parametros de la ventana V_Dueño y asi dar de alta a un
     * nuevo usuario.
     *
     * @param usuario (requerido) usuario del usuario
     * @param contraseña (requerido) contraseña del usuario
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void altaUsuario(String usuario, String contraseña) throws Exception, SQLException {
        u = new Usuario();
        u.setUsuario(usuario);
        u.setContraseña(contraseña);
        uBD.insertarUsuario(u);
    }

    /**
     * Funcion que nos dirije a la clase borrarUsuario situada en UsuarioBD para
     * pasarle los parametros de la ventana V_Usuario y asi borrar a un usuario
     * ya existente.
     *
     * @param codUsuario (requerido) codigo del usuario
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void bajaUsuario(int codUsuario) throws Exception, SQLException {
        uBD.borrarUsuario(codUsuario);
    }

    /**
     * Funcion para sacar los datos de un usuario desde la base de datos
     * mediante un codigo del usuario.
     *
     * @param codUsuario(requerido) codigo del usuario
     * @return objeto de la clase Usuario
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static Usuario consultarUsuario(int codUsuario) throws Exception, SQLException {
        u = uBD.consultarUsuarioCodigo(codUsuario);
        return u;
    }

    /**
     * Funcion para sacar los datos de un usuario especifico desde la base de
     * datos mediante el nombre de un usuario.
     *
     * @param usuario(requerido) nombre del usuario
     * @return objeto de la clase Usuario
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static Usuario consultarUsuarioPorNombre(String usuario) throws Exception, SQLException {
        u = uBD.consultarUsuarioNombre(usuario);
        return u;
    }

    /**
     * Funcion para sacar los datos de un administrador especifico desde la base
     * de datos mediante el nombre de un usuario.
     *
     * @param usuario(requerido) nombre del administrador
     * @return objeto de la clase Administrador
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static Administrador consultarAdministradorPorNombre(String usuario) throws Exception, SQLException {
        a = aBD.consultarAdministradorNombre(usuario);
        return a;
    }

    /**
     * Funcion que crea una lista de usuarios.
     *
     * @return devuelve una lista de usuarios
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static String crearListaUsuarios() throws Exception, SQLException {
        listaUsuarios = uBD.consultaTodosUsuarios();
        String stringUsuarios = "";
        for (int x = 0; x < listaUsuarios.size(); x++) {
            stringUsuarios += listaUsuarios.get(x).toString();
        }
        return stringUsuarios;
    }

    /**
     * Funcion para buscar en la base de datos al usuario de login.
     *
     * @param usuario (reuqerido) usuario del usuario
     * @param contraseña (requerido ) contraseña de usuario
     * @return boolean si existe o no
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static boolean conseguirDatosUsuarios(String usuario, String contraseña) throws Exception, SQLException {
        boolean existir = uBD.consultarUsuario(usuario, contraseña);
        return existir;
    }

    /**
     * Funcion para buscar en la base de datos al usuario de login.
     *
     * @param usuario (reuqerido) usuario del usuario
     * @return boolean si existe o no
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static boolean conseguirDatosUsuariosReg(String usuario) throws Exception, SQLException {
        boolean existir = uBD.consultarUsuario(usuario);
        return existir;
    }

    /**
     * Funcion para poner todos los equipos en una lista ordenados por
     * puntuacion.
     *
     * @return listaequipos lista de todos los equipos
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static ArrayList<Equipo> crearListaEquiposOrderPuntuacion() throws Exception, SQLException {
        listaEquipos = eBD.consultarEquipoOrderPuntuacion();
        return listaEquipos;
    }

    /**
     * Funcion para coger el objeto Liga desde la base de datos.
     *
     * @return listaequipos lista de todos los equipos
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static Liga cogerNombreLiga() throws Exception, SQLException {
        l = lBD.consultarLiga();
        return l;
    }

    /**
     * Funcion para buscar en la base de datos al administrador de login.
     *
     * @param usuario (reuqerido) usuario del administrador
     * @param contraseña (requerido ) contraseña de administrador
     * @return boolean si existe o no
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static boolean conseguirDatosAdministrador(String usuario, String contraseña) throws Exception, SQLException {
        boolean existir = aBD.consultarAdministrador(usuario, contraseña);
        return existir;
    }

    /**
     * Funcion para crear la Liga vacia.
     *
     * @param fecha (reuqerido) fecha inicio de la Liga
     * @param nombre (requerido) nombre de la Liga
     * @return String para confirmar que se ha creado la Liga
     * @throws ParseException hereda excepciones
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static String crearLigaVacia(Date fecha, String nombre) throws ParseException, Exception, SQLException {
        String mensaje = lBD.crearLigaVacia(fecha, nombre);
        return mensaje;
    }

    /**
     * Funcion para sumar 3 puntos la puntuacion del equipo ganador del partido.
     *
     * @param nombreEquipo (requerido) nombre del equipo al que sumar 3 puntos
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void introducirResultado(String nombreEquipo) throws Exception, SQLException {
        int codigoEquipo = eBD.buscarCodigoPorNombre(nombreEquipo);
        eBD.modificarPuntuacion(codigoEquipo);
    }

    /**
     * Funcion para buscar en la base de datos las jornadas para dar a la vista
     * al usuario.
     *
     * @return ArrayList del objeto Jornada
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static ArrayList<Jornada> consultarJornadas() throws Exception, SQLException {
        jorBD = new JornadaBD();
        listaJornadas = jorBD.consultarJornadas();
        return listaJornadas;
    }

    /**
     * Funcion que para sacar las jornadas con los partidos.
     *
     * @return devuelve las jornadas con los partidos
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static ArrayList<Jornada> consultarJornadasconPartidos() throws Exception, SQLException {
        listaJornadas = jorBD.consultarJornadasConPartidos();
        return listaJornadas;
    }

    /**
     * Funcion que saca todos los Partidos de la base de datos.
     *
     * @return devuelve todos los Partidos
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static ArrayList<Partido> consultarPartidos() throws Exception, SQLException {
        PartidoBD pBD = new PartidoBD();
        listaPartidos = pBD.consultarPartidos();
        return listaPartidos;
    }

    /**
     * Funcion que saca todos los Equipos de la base de datos.
     *
     * @return devuelve todos los Equipos
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static ArrayList<Equipo> consultarEquipos() throws Exception, SQLException {
        EquipoBD eBD = new EquipoBD();
        listaEquipos = eBD.consultaEquipos();
        return listaEquipos;
    }

    /**
     * Funcion donde se consulta la Liga.
     *
     * @return devuelve un objeto de Liga
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static Liga consultarLiga() throws Exception, SQLException {
        lBD = new LigaBD();
        l = lBD.consultarLiga();
        return l;
    }

    /**
     * Funcion para insertar Equipos en los partidos para la Liga.
     *
     * @throws Exception hereda excepciones
     * @throws java.sql.SQLException hereda excepciones SQL
     */
    public static void insertarEquipos() throws Exception, SQLException {
        listaEquipos = consultarEquipos();
        Equipo[] EquiposArray = new Equipo[listaEquipos.size()];
        EquiposArray = listaEquipos.toArray(EquiposArray);
        listaJornadas = jorBD.consultarJornadas();
        //IDA
        pBD.insertarPartido(EquiposArray[0].getCod_equipo(), EquiposArray[1].getCod_equipo(), listaJornadas.get(0).getFecha_inicio(), listaJornadas.get(0).getCod_jornada());
        pBD.insertarPartido(EquiposArray[2].getCod_equipo(), EquiposArray[3].getCod_equipo(), listaJornadas.get(0).getFecha_inicio(), listaJornadas.get(0).getCod_jornada());
        pBD.insertarPartido(EquiposArray[4].getCod_equipo(), EquiposArray[5].getCod_equipo(), listaJornadas.get(0).getFecha_inicio(), listaJornadas.get(0).getCod_jornada());

        pBD.insertarPartido(EquiposArray[0].getCod_equipo(), EquiposArray[2].getCod_equipo(), listaJornadas.get(1).getFecha_inicio(), listaJornadas.get(1).getCod_jornada());
        pBD.insertarPartido(EquiposArray[3].getCod_equipo(), EquiposArray[4].getCod_equipo(), listaJornadas.get(1).getFecha_inicio(), listaJornadas.get(1).getCod_jornada());
        pBD.insertarPartido(EquiposArray[5].getCod_equipo(), EquiposArray[1].getCod_equipo(), listaJornadas.get(1).getFecha_inicio(), listaJornadas.get(1).getCod_jornada());

        pBD.insertarPartido(EquiposArray[0].getCod_equipo(), EquiposArray[3].getCod_equipo(), listaJornadas.get(2).getFecha_inicio(), listaJornadas.get(2).getCod_jornada());
        pBD.insertarPartido(EquiposArray[4].getCod_equipo(), EquiposArray[5].getCod_equipo(), listaJornadas.get(2).getFecha_inicio(), listaJornadas.get(2).getCod_jornada());
        pBD.insertarPartido(EquiposArray[1].getCod_equipo(), EquiposArray[2].getCod_equipo(), listaJornadas.get(2).getFecha_inicio(), listaJornadas.get(2).getCod_jornada());

        pBD.insertarPartido(EquiposArray[0].getCod_equipo(), EquiposArray[4].getCod_equipo(), listaJornadas.get(3).getFecha_inicio(), listaJornadas.get(3).getCod_jornada());
        pBD.insertarPartido(EquiposArray[5].getCod_equipo(), EquiposArray[1].getCod_equipo(), listaJornadas.get(3).getFecha_inicio(), listaJornadas.get(3).getCod_jornada());
        pBD.insertarPartido(EquiposArray[2].getCod_equipo(), EquiposArray[3].getCod_equipo(), listaJornadas.get(3).getFecha_inicio(), listaJornadas.get(3).getCod_jornada());

        pBD.insertarPartido(EquiposArray[0].getCod_equipo(), EquiposArray[5].getCod_equipo(), listaJornadas.get(4).getFecha_inicio(), listaJornadas.get(4).getCod_jornada());
        pBD.insertarPartido(EquiposArray[1].getCod_equipo(), EquiposArray[2].getCod_equipo(), listaJornadas.get(4).getFecha_inicio(), listaJornadas.get(4).getCod_jornada());
        pBD.insertarPartido(EquiposArray[3].getCod_equipo(), EquiposArray[4].getCod_equipo(), listaJornadas.get(4).getFecha_inicio(), listaJornadas.get(4).getCod_jornada());
        //VUELTA
        pBD.insertarPartido(EquiposArray[1].getCod_equipo(), EquiposArray[0].getCod_equipo(), listaJornadas.get(5).getFecha_inicio(), listaJornadas.get(5).getCod_jornada());
        pBD.insertarPartido(EquiposArray[3].getCod_equipo(), EquiposArray[2].getCod_equipo(), listaJornadas.get(5).getFecha_inicio(), listaJornadas.get(5).getCod_jornada());
        pBD.insertarPartido(EquiposArray[5].getCod_equipo(), EquiposArray[4].getCod_equipo(), listaJornadas.get(5).getFecha_inicio(), listaJornadas.get(5).getCod_jornada());

        pBD.insertarPartido(EquiposArray[2].getCod_equipo(), EquiposArray[0].getCod_equipo(), listaJornadas.get(6).getFecha_inicio(), listaJornadas.get(6).getCod_jornada());
        pBD.insertarPartido(EquiposArray[4].getCod_equipo(), EquiposArray[3].getCod_equipo(), listaJornadas.get(6).getFecha_inicio(), listaJornadas.get(6).getCod_jornada());
        pBD.insertarPartido(EquiposArray[1].getCod_equipo(), EquiposArray[5].getCod_equipo(), listaJornadas.get(6).getFecha_inicio(), listaJornadas.get(6).getCod_jornada());

        pBD.insertarPartido(EquiposArray[3].getCod_equipo(), EquiposArray[0].getCod_equipo(), listaJornadas.get(7).getFecha_inicio(), listaJornadas.get(7).getCod_jornada());
        pBD.insertarPartido(EquiposArray[5].getCod_equipo(), EquiposArray[4].getCod_equipo(), listaJornadas.get(7).getFecha_inicio(), listaJornadas.get(7).getCod_jornada());
        pBD.insertarPartido(EquiposArray[2].getCod_equipo(), EquiposArray[1].getCod_equipo(), listaJornadas.get(7).getFecha_inicio(), listaJornadas.get(7).getCod_jornada());

        pBD.insertarPartido(EquiposArray[4].getCod_equipo(), EquiposArray[0].getCod_equipo(), listaJornadas.get(8).getFecha_inicio(), listaJornadas.get(8).getCod_jornada());
        pBD.insertarPartido(EquiposArray[1].getCod_equipo(), EquiposArray[5].getCod_equipo(), listaJornadas.get(8).getFecha_inicio(), listaJornadas.get(8).getCod_jornada());
        pBD.insertarPartido(EquiposArray[3].getCod_equipo(), EquiposArray[2].getCod_equipo(), listaJornadas.get(8).getFecha_inicio(), listaJornadas.get(8).getCod_jornada());

        pBD.insertarPartido(EquiposArray[5].getCod_equipo(), EquiposArray[0].getCod_equipo(), listaJornadas.get(9).getFecha_inicio(), listaJornadas.get(9).getCod_jornada());
        pBD.insertarPartido(EquiposArray[2].getCod_equipo(), EquiposArray[1].getCod_equipo(), listaJornadas.get(9).getFecha_inicio(), listaJornadas.get(9).getCod_jornada());
        pBD.insertarPartido(EquiposArray[4].getCod_equipo(), EquiposArray[3].getCod_equipo(), listaJornadas.get(9).getFecha_inicio(), listaJornadas.get(9).getCod_jornada());
        ControladorVistas.abrirVentanaAviso(lBD.cambiarEstado(JEMS.consultarLiga().getCod_liga()));
    }

    /**
     * Funcion para mandar mensaje de error a la ventana de aviso.
     *
     * @param mensaje (requerido) String con el error
     */
    public static void errorBdr(String mensaje) {
        ControladorVistas.abrirVentanaAviso(mensaje);
    }

}
