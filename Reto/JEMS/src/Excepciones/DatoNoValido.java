package Excepciones;

/**
 *
 * @author Sergio Zulueta
 */
public class DatoNoValido extends Exception {

    private String mensaje;

    public DatoNoValido(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

}
