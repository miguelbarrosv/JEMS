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
import java.util.ArrayList;

public class JEMS {

    private static ArrayList<Jugador> listaJugadores;
    private static ArrayList<Equipo> listaEquipos;
    private static ArrayList<Dueño> listaDueños;
    private static ArrayList<Usuario> listaUsuarios;
    private static DueñoBD dBD;
    private static JugadorBD jBD;
    private static EquipoBD eBD;
    private static UsuarioBD uBD;
    private static AdministradorBD aBD;
    private static LigaBD lBD;
    private static Dueño d;
    private static Equipo e;
    private static Jugador j;
    private static Usuario u;
    private static Administrador a;
    private static Liga l;
    private static AdministradorBD aBD;
    private static Jornada jor;
    private static JornadaBD jorBD;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorVistas.mostrarVentanaLogin();
        dBD = new DueñoBD();
        jBD = new JugadorBD();
        eBD = new EquipoBD();
        dBD = new DueñoBD();
        uBD = new UsuarioBD();
        aBD = new AdministradorBD();
        lBD = new LigaBD();
        jorBD = new JornadaBD();
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
     */
    public static void altaJugador(String nombre, String apellido, String nick, int sueldo, String nacionalidad, String estado, String telefono, int equipo) throws Exception {
        j = new Jugador();
        j.setNombre(nombre);
        j.setApellido(apellido);
        j.setNickname(nick);
        j.setSueldo(sueldo);
        j.setNacionalidad(nacionalidad);
        j.setEstado(estado);
        j.setTelefono(telefono);
        e = eBD.consultarEquipoCodigo(equipo);
        j.setEquipo(e);
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
     * un Get de el nombre del equipo de la posicion x
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
     */
    public static ArrayList<Equipo> rellenarListaEquipos() throws Exception {
        listaEquipos = eBD.consultaEquipos();
        return listaEquipos;
    }

    /**
     * Funcion que llama a la funcion de DueñoBD para rellenar la lista de
     * dueños de la base de datos.
     *
     * @return devuelve la lista de dueños
     * @throws Exception hereda excepciones
     */
    public static ArrayList<Dueño> getListaDueños() throws Exception {
        listaDueños = dBD.consultaTodosDueños();
        return listaDueños;
    }

    /**
     * Funcion que nos dirije a la clase modificacionJugador situado en
     * JugadorBD para pasarle los`parametros recogidos de la ventana V_Jugador y
     * asi modificar aun jugador ya existente.
     *
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
     */
    public static void modificarJugador(String nombre, String apellido, String nick, int sueldo, String nacionalidad, String estado, String telefono, int equipo) throws Exception {
        j = new Jugador();
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
     */
    public static void borrarJugador(int codJugador) throws Exception {
        jBD.borrarJugador(codJugador);
    }

    /**
     * Funcion para poner todos los jugadores en una lista.
     *
     * @return listaJugadores lista de todos los jugadores
     * @throws Exception hereda excepciones
     */
    public static String crearListaJugadores() throws Exception {
        listaJugadores = jBD.consultaTodosJugadores();
        String stringJugadores = "";
        for (int x = 0; x < listaJugadores.size(); x++) {
            listaJugadores.get(x).toString();
        }
        return stringJugadores;
    }

    /**
     * Funcion para consultar un jugador mediante su codigo.
     *
     * @param cod_jugador (requerido) codigo del jugador
     * @return j objeto de un jugador
     * @throws Exception hereda excepciones
     */
    public static Jugador consultarJugador(int cod_jugador) throws Exception {
        j = jBD.consultarJugadorCodigo(cod_jugador);
        return j;
    }

    /**
     * Funcion para consultar si existe este codigo de jugador.
     *
     * @param cod_jugador (requerido) codigo de jugador
     * @return mensaje mensaje con el resultado de la busqueda
     * @throws Exception hereda excepciones
     */
    public static boolean consultarJugadorLista(int cod_jugador) throws Exception {
        listaJugadores = jBD.consultaTodosJugadores();
        boolean mensaje;
        mensaje = listaJugadores.indexOf(cod_jugador) != 0;
        return mensaje;
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
     */
    public static void modificarEquipo(int codEquipo, String nombre, String nacionalidad, int presupuesto, int puntuacion, int dueño) throws Exception {
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
     */
    public static void altaEquipo(String nombre, String nacionalidad, int presupuesto, int puntuacion, int dueño) throws Exception {
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
     */
    public static void bajaEquipo(int codEquipo) throws Exception {
        eBD.borrarEquipo(codEquipo);
    }

    /**
     * Funcion para poner todos los equipos en una lista.
     *
     * @return listaequipos lista de todos los equipos
     * @throws Exception hereda excepciones
     */
    public static String crearListaEquipos() throws Exception {
        String stringEquipos = eBD.consultarTodosEquipos();
        return stringEquipos;
    }

    /**
     * Funcion para buscar el dueño en un equipo.
     *
     * @param codigoEquipo codigo del equipo
     * @return objeto equipo
     * @throws Exception hereda excepciones
     */
    public static Equipo buscarEquipo(int codigoEquipo) throws Exception {
        e = eBD.consultarEquipoCodigo(codigoEquipo);
        return e;
    }

    /**
     * Funcion que nos dirije a la clase modificarDueño situada en DueñoBD para
     * pasarle los parametros de la ventana V_Dueño y asi modificar un dueño ya
     * existente.
     *
     * @param nombre (requerido) nombre del dueño
     * @param apellido (requerido) apellido del dueño
     * @param telefono (requerido) telefono del dueño
     * @throws Exception hereda excepciones
     */
    public static void modificarDueño(String nombre, String apellido, String telefono) throws Exception {
        d = new Dueño();
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
     */
    public static void altaDueño(String nombre, String apellido, String telefono) throws Exception {
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
     * @throws Exception
     */
    public static void bajaDueño(int codDueño) throws Exception {
        dBD.borrarDueño(codDueño);
    }

    /**
     * Funcion para sacar los datos de un dueño de la base de datos mediante su
     * codigo.
     *
     * @param codDueño codigo del dueño
     * @return objeto dueño
     * @throws Exception hereda excepciones
     */
    public static Dueño consultarDueño(int codDueño) throws Exception {
        d = dBD.consultarDueñoCodigo(codDueño);
        return d;
    }

    /**
     * Funcion que crea una lista de todos los dueños.
     *
     * @return lista de dueños
     * @throws Exception hereda excepciones
     */
    public static String crearListaDueños() throws Exception {
        listaDueños = dBD.consultaTodosDueños();

        String stringDueños = "";
        for (int x = 0; x < listaDueños.size(); x++) {
            listaEquipos = eBD.consultaEquiposCodDueño(listaDueños.get(x).getCod_dueño());
            listaDueños.get(x).setLista_equipos(listaEquipos);
            stringDueños = stringDueños + listaDueños.get(x).toString();
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
     */
    public static void modificarUsuario(int codigoUsuario,String usuario, String contraseña) throws Exception {
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
     */
    public static void altaUsuario(String usuario, String contraseña) throws Exception {
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
     */
    public static void bajaUsuario(int codUsuario) throws Exception {
        uBD.borrarUsuario(codUsuario);
    }

    /**
     * Funcion para sacar los datos de un usuario desde la base de datos
     * mediante un codigo del usuario.
     *
     * @param codUsuario(requerido) codigo del usuario
     * @return objeto de la clase Usuario
     * @throws Exception hereda excepciones
     */
    public static Usuario consultarUsuario(int codUsuario) throws Exception {
        u = uBD.consultarUsuarioCodigo(codUsuario);
        return u;
    }

    /**
     * Funcion para sacar los datos de un usuario especifico desde la base de datos
     * mediante el nombre de un usuario.
     *
     * @param usuario(requerido) nombre del usuario
     * @return objeto de la clase Usuario
     * @throws Exception hereda excepciones
     */
    public static Usuario consultarUsuarioPorNombre(String usuario) throws Exception {
        u = uBD.consultarUsuarioNombre(usuario);
        return u;
    }
    
    /**
     * Funcion para sacar los datos de un administrador especifico desde la base de datos
     * mediante el nombre de un usuario.
     *
     * @param usuario(requerido) nombre del administrador
     * @return objeto de la clase Administrador
     * @throws Exception hereda excepciones
     */
    public static Administrador consultarAdministradorPorNombre(String usuario) throws Exception {
        a = aBD.consultarAdministradorNombre(usuario);
        return a;
    }
    
    /**
     * Funcion que crea una lista de usuarios.
     *
     * @return devuelve una lista de usuarios
     * @throws Exception hereda excepciones
     */
    public static String crearListaUsuarios() throws Exception {
        listaUsuarios = uBD.consultaTodosUsuarios();
        String stringUsuarios = "";
        for (int x = 0; x < listaUsuarios.size(); x++) {
            listaUsuarios.get(x).toString();
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
     */
    public static boolean conseguirDatosUsuarios(String usuario, String contraseña) throws Exception {
        boolean existir = uBD.consultarUsuario(usuario, contraseña);
        return existir;
    }
        /**
     * Funcion para buscar en la base de datos al usuario de login.
     *
     * @param usuario (reuqerido) usuario del usuario
     * @return boolean si existe o no
     * @throws Exception hereda excepciones
     */
    public static boolean conseguirDatosUsuariosReg(String usuario) throws Exception {
        boolean existir = uBD.consultarUsuario(usuario);
        return existir;
    }

    /**
     * Funcion para poner todos los equipos en una lista ordenados por
     * puntuacion.
     *
     * @return listaequipos lista de todos los equipos
     * @throws Exception hereda excepciones
     */
    public static ArrayList<Equipo> crearListaEquiposOrderPuntuacion() throws Exception {
        listaEquipos = eBD.consultarEquipoOrderPuntuacion();
        return listaEquipos;
    }

    /**
     * Funcion para coger el objeto liga desde la base de datos
     *
     * @return listaequipos lista de todos los equipos
     * @throws Exception hereda excepciones
     */
    public static Liga cogerNombreLiga() {
        //l = lBD.cogerLiga();
        return l;
    }

    /**
     * Funcion para buscar en la base de datos al administrador de login.
     *
     * @param usuario (reuqerido) usuario del administrador
     * @param contraseña (requerido ) contraseña de administrador
     * @return boolean si existe o no
     * @throws Exception hereda excepciones
     */
    public static boolean conseguirDatosAdministrador(String usuario, String contraseña) throws Exception {
        boolean existir = aBD.consultarAdministrador(usuario, contraseña);
        return existir;
    }
    public static Jornada consultarJornada() {
        //jor = jorBD.consultarJornada();
        return jor;
    }
    }
