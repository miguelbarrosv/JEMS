/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import BD.JornadaBD;
import BD.PartidoBD;
import UML.Partido;
import UML.Jornada;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jems.JEMS;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Joel Encinas
 * @author Miguel Barros
 * @author Sergio Zulueta
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class GeneradorDOMJornada {

    private List<Jornada> jornadas;
    private Document dom;

    private ArrayList<Partido> partidos;

    public GeneradorDOMJornada() throws Exception {
        // Lista para almacenar los objetos
        jornadas = new ArrayList<>();
        // Cargar datos 
        cargarDatos();
        // Construir un documento DOM vacio
        crearDocumento();
    }

    /**
     * Funcion que comienza el proceso para generar el XML
     *
     */
    public void run() {
        System.out.println("Iniciando...");
        crearArbolDOM();
        exportarFichero();
        System.out.println("Fichero generado");
    }


    /**
     * Funcion que coge los datos necesarios de la BD para poder generar el XML
     *
     * @throws Exception hereda de excepcones
     */
    public void cargarDatos() throws Exception {
        // Cargar ArrayList paartidos
        partidos = JEMS.consultarPartidos();
        //Cargar ArrayList de jornada
        jornadas = JEMS.consultarJornadas();
    }

    /**
     * Funcion que crea el documento que rellenaremos mas adelante
     *
     */
    private void crearDocumento() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            dom = db.newDocument();

            // REF: No hay esquema o DTD: https://stackoverflow.com/a/8438236
            dom.setXmlStandalone(true);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    /**
     * Funcion que crea el arbol del documento XML
     *
     */
    private void crearArbolDOM() {
        // Crear elmento raiz jornadas
        Element raiz = dom.createElement("jornadas");
        dom.appendChild(raiz);
        // Generar elementos jornada y hacer jornadas el padre
        for (Jornada jornada : jornadas) {
            Element elemento = crearElementoJornada(jornada);
            raiz.appendChild(elemento);
        }
    }

    /**
     * Funcion que crea el elemento jornada y sus subelementos
     *
     * @param (requerido) objeto Jornada
     */
    private Element crearElementoJornada(Jornada jornada) {
        // <jornada>
        Element elementoJornada = dom.createElement("jornada");
        elementoJornada.setAttribute("cod", String.valueOf(jornada.getCod_jornada()));
        elementoJornada.setAttribute("fecha_inicio", String.valueOf(jornada.getFecha_inicio()));
        elementoJornada.setAttribute("fecha_fin", String.valueOf(jornada.getFecha_fin()));

        // <partidos>
        Element elementoPartidos = dom.createElement("partidos");

        // <partido>
        // Generar elementos partido y hacer partidos al padre
        for (Partido partido : partidos) {
            Element elemento = crearElementoPartido(partido);
            elementoPartidos.appendChild(elemento);
        }
        return elementoJornada;
    }

    /**
     * Funcion que crea el elemento partido y sus subelementos
     *
     * @param partido (requerido) objeto Partido
     * @return devuelve el objeto partido
     */
    public Element crearElementoPartido(Partido partido) {
        // <partido>
        Element elementoPartido = dom.createElement("partido");
        elementoPartido.setAttribute("fecha_partido", String.valueOf(partido.getFecha_partido()));

        // <equipo_local>
        Element elementoEquipoLocal = dom.createElement("equipo_local");

        // #PCDATA
        Text textoEquipoLocal = dom.createTextNode(partido.getEquipo_local().getNombre());
        elementoEquipoLocal.appendChild(textoEquipoLocal);

        // </equipo_local>
        elementoPartido.appendChild(elementoEquipoLocal);

        // <equipo_visitante>
        Element elementoEquipoVisitante = dom.createElement("equipo_visitante");

        // #PCDATA
        Text textoEquipoVisitante = dom.createTextNode(partido.getEquipo_visitante().getNombre());
        elementoPartido.appendChild(textoEquipoVisitante);

        // </equipo_visitante>
        elementoPartido.appendChild(elementoEquipoVisitante);

        // <resultado>
        Element elementoResultado = dom.createElement("resultado");

        // </partido>
        elementoPartido.appendChild(elementoResultado);

        return elementoPartido;
    }

    /**
     * Funcion con la que exportamos el fichero al lugar deseado
     */
    private void exportarFichero() {
        // REF: Serializar XML: https://www.edureka.co/blog/serialization-of-java-objects-to-xml-using-xmlencoder-decoder/
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            // REF: Indentar la salida: https://stackoverflow.com/a/1264872
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");

            Result output = new StreamResult(new File("../jornada.xml"));
            Source input = new DOMSource(dom);

            transformer.transform(input, output);

        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws Exception {
        System.out.println("--- DOM (escritura) ---\n");
        new GeneradorDOMJornada().run();
    }

}
