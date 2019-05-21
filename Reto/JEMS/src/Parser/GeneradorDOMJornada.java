/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import UML.Partido;
import UML.Jornada;
import java.io.File;
import java.util.ArrayList;
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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Joel Encinas
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class GeneradorDOMJornada {
    /*
    private List<Jornada> jornadas;
    private Document dom;

    public GeneradorDOMJornada() {
        // Lista para almacenar los objetos
        jornadas = new ArrayList<>();

        // Construir un documento DOM vacio
        crearDocumento();
    }

    public void run() {
        crearArbolDOM();
        exportarFichero();
    }

    private void crearDocumento() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            dom = db.newDocument();

            // REF: No hay esquema o DTD: https://stackoverflow.com/a/8438236
            // dom.setXmlStandalone(true);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    private void crearArbolDOM() {
        Element raiz = dom.createElement("jornadas");
        dom.appendChild(raiz);

        for (Jornada jornada : jornadas) {
            Element elemento = crearElementoJornada(jornada);
            raiz.appendChild(elemento);
        }
    }

    private Element crearElementoJornada(Jornada jornada) {
        // <jornada>
        Element elementoJornada = dom.createElement("jornada");
        elementoJornada.setAttribute("cod", String.valueOf(jornada.getCod_jornada()));
        elementoJornada.setAttribute("fecha_inicio", jornada.getFecha_inicio());
        elementoJornada.setAttribute("fecha_fin", jornada.getFecha_fin());

        // <partidos>
        Element elementoPartidos = dom.createElement("partidos");

        // <partido>
        Element elementoPartido = dom.createElement("partido");
        elementoPartido.setAttribute("cod", partido.getCodigo());
        elementoPartido.setAttribute("fecha_partido", partido.getFecha_partido());

        // <equipo_local>
        Element elementoEquipoLocal = dom.createElement("equipo_local");

        // #PCDATA
        Text equipoLocal = dom.createTextNode(equipo.getNombre());
        elementoPartido.appendChild(equipoLocal);

        // </equipo_local>
        elementoPartido.appendChild(elementoEquipoLocal);

        // <equipo_visitante>
        Element elementoEquipoVisitante = dom.createElement("equipo_visitante");

        // #PCDATA
        Text equipoVisitante = dom.createTextNode(equipo.getNombre());
        elementoPartido.appendChild(equipoVisitante);

        // </equipo_visitante>
        elementoPartido.appendChild(elementoEquipoVisitante);

        // <resultado>
        Element elementoResultado = dom.createElement("resultado");
        elementoResultado.setAttribute("cod_equipo", resultado.getCodigo());

        // #PCDATA
        Text resultado = dom.createTextNode(equipo.getNombre());
        elementoPartido.appendChild(resultado);

        // </resultado>
        elementoPartido.appendChild(elementoResultado);

        return elementoJornada;
    }

    private void exportarFichero() {
        // REF: Serializar XML: https://www.edureka.co/blog/serialization-of-java-objects-to-xml-using-xmlencoder-decoder/
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            // REF: Indentar la salida: https://stackoverflow.com/a/1264872
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");

            Result output = new StreamResult(new File("./jornada.xml"));
            Source input = new DOMSource(dom);

            transformer.transform(input, output);

        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        System.out.println("--- DOM (escritura) ---\n");
        new GeneradorDOMClasificacion().run();
    }
*/
}
