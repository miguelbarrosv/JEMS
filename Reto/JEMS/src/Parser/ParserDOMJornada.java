/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import static Parser.ParserDomClasificacion.getEquipos;
import UML.Equipo;
import UML.Jornada;
import UML.Partido;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Miguel Barros
 */
public class ParserDOMJornada {

    private static Element elementoRaiz;
    private static ArrayList<Jornada> listaJornadas = new ArrayList<Jornada>();
    private static Jornada j;
    private static ArrayList<Partido> listaPartidos = new ArrayList<Partido>();
    private static Partido p;

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        run();
    }

    /**
     * Funcion con la que iniciamos el proceso de lectura del documento xml
     *
     */
    /**
     * Funcion con la que iniciamos el proceso de lectura del documento xml
     * 
     * @throws ParserConfigurationException hereda de excepciones
     * @throws SAXException hereda de excepciones
     * @throws IOException hereda de excepciones
     */
    public static void run() throws ParserConfigurationException, SAXException, IOException {

        File archivo = new File("../jornada.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        Document doc = dBuilder.parse(archivo);
        doc.getDocumentElement().normalize();
        System.out.println("Elemento raiz: " + doc.getDocumentElement().getNodeName());

        elementoRaiz = doc.getDocumentElement();

        NodeList nodes = doc.getElementsByTagName("jornada");
        System.out.println("------------------------");

        for (int i = 0; i < nodes.getLength(); i++) {
            //Guardamos en el array de jornadas con cada objeto jornada
            listaJornadas.add(getJornada(nodes.item(i)));

            NodeList listaPartidos = doc.getElementsByTagName("partido");
            System.out.println("-----------------------");
        }
        //Sacamos por pantalla el array de jornadas
        for (Jornada j : listaJornadas) {
            System.out.println(j.getPartidos());
        }
    }


    /**
     * Funcion con la que cogemos las jornadas con atributos y elementos para
     * añadirlos al arrayList creado anteriormente
     * 
     * @param jornada las jornadas con sus atributos
     * @return jornada devuelve la jornada
     */
    public static Jornada getJornada(Node jornada) {
        if (jornada.getNodeType() == Node.ELEMENT_NODE) {

            Element element = (Element) jornada;

            element.getAttribute("fecha_fin");
            element.getAttribute("fecha_inicio");
            element.getAttribute("cod");

            System.out.println("Fecha Fin: " + element.getAttribute("fecha_fin"));
            System.out.println("Fecha Inicio: " + element.getAttribute("fecha_inicio"));
            System.out.println("cod: " + element.getAttribute("cod"));
            System.out.println("partidos: " + element.getElementsByTagName("partidos").item(0).getTextContent());

            j.setPartidos(obtenerValor("partidos", element));
        }
        return j;
    }

    /**
     * Funcion con la que obtenemos el valor de los elementos del arbol XML
     *
     * @param tag La etiqueta del elemento
     * @param jornada nodo de la jornada
     * @return Texto recuperado
     */
    public static ArrayList<Partido> obtenerValor(String tag, Element jornada) {
        NodeList nodos = jornada.getElementsByTagName(tag).item(0).getChildNodes();

        for (int z = 0; z < nodos.getLength(); z++) {
            //Guardamos el array de partidos con cada objeto partido
            listaPartidos.add(getPartido(nodos.item(z)));
        }
        //Sacamos por pantalla el arrayList de partidos
        for (Partido p : listaPartidos) {
            System.out.println(p.getResultado());
        }
        return listaPartidos;
    }

    /**
     * Funcion con la que cogemos los partidos con atributos y elementos para
     * añadirlos al arrayList creado anteriormente
     *
     */
    /**
     * Funcion con la que cogemos los partidos con atributos y elementos para
     * añadirlos al arrayList creado anteriormente
     * 
     * @param partido establecemos el partido con sus atributos y elementos
     * @return partido devuelve el partido
     */
    public static Partido getPartido(Node partido) {
        if (partido.getNodeType() == Node.ELEMENT_NODE) {

            Element element = (Element) partido;

            element.getAttribute("cod");
            element.getAttribute("fecha_partido");

            System.out.println("cod: " + element.getAttribute("cod"));
            System.out.println("Fecha Partido: " + element.getAttribute("fecha_partido"));
            System.out.println("Equipo Local: " + element.getElementsByTagName("equipo_local").item(0).getTextContent());
            System.out.println("Equipo Visitante: " + element.getElementsByTagName("equipo_visitante").item(0).getTextContent());
            System.out.println("Resultado: " + element.getElementsByTagName("resultado").item(0).getTextContent());

            p.setResultado(Integer.parseInt(obtenerSubelemento("resultado", element)));
        }
        return p;
    }

    /**
     * Funcion con la que obtenemos el valor de los elementos del arbol XML
     *
     * @param tag La etiqueta del elemento
     * @param element Nodo de partido
     * @return Texto recuperado
     */
    private static String obtenerSubelemento(String tag, Element partido) {
        NodeList nodos = partido.getElementsByTagName(tag).item(0).getChildNodes();

        Node nodo = nodos.item(0);
        System.out.println(tag);
        return nodo.getNodeValue();
    }
}
