package Excepciones;

/**
 * Creacion de la excepcion DatoNoValido.
 *
 * @author Sergio Zulueta
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class DatoNoValido extends Exception {

    /**
     * Creacion del atributo mensaje.
     *
     */
    private String mensaje;

    /**
     * Funcion para establecer un mensaje personalizado.
     *
     * @param mensaje (requerido) mensaje personalizado de error
     */
    public DatoNoValido(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Funcion para retornar un mensaje personalizado.
     *
     * @return mensaje (requerido) mensaje personalizado de error
     */
    public String getMensaje() {
        return mensaje;
    }

}
