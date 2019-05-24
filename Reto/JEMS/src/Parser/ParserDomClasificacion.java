/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import UML.Equipo;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author Miguel Barros
 */
public class ParserDomClasificacion {

    private static Element elementoRaiz;
    private static ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
    private static Equipo e;
    private static Document doc;

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        run();
    }

    /**
     * Funcion con la que iniciamos el proceso de lectura del documento xml
     *
     * @throws SAXException hereda de excepciones
     * @throws IOException hereda de excepciones
     * @throws ParserConfigurationException hereda de excepciones
     */
    public static void run() throws SAXException, IOException, ParserConfigurationException {
        System.out.println("--- DOM (lectura) ---\n");
        File archivo = new File("../liga.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        doc = dBuilder.parse(archivo);
        doc.getDocumentElement().normalize();

        System.out.println("Elemento raiz: " + doc.getDocumentElement().getNodeName());

        elementoRaiz = doc.getDocumentElement();
        elementoRaiz.getAttribute("estado_liga");
        elementoRaiz.getAttribute("fecha_fin");
        elementoRaiz.getAttribute("fecha_inicio");
        elementoRaiz.getAttribute("cod");

        System.out.println("Estado liga: " + elementoRaiz.getAttribute("estado_liga"));
        System.out.println("Fecha fin: " + elementoRaiz.getAttribute("fecha_fin"));
        System.out.println("Fecha Inicio: " + elementoRaiz.getAttribute("fecha_inicio"));
        System.out.println("Codigo: " + elementoRaiz.getAttribute("cod"));

        NodeList nodes = doc.getElementsByTagName("fecha_actualizacion");
        Node fechaActualizacion = nodes.item(0);
        for (int i = 0; i < nodes.getLength(); i++) {
            if (fechaActualizacion.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) fechaActualizacion;

                System.out.println("Fecha actualizacion: " + element.getElementsByTagName("fecha_actualizacion").item(0).getTextContent());
            }
        }

        NodeList nodos = doc.getElementsByTagName("equipo");
        System.out.println("------------------------");

        for (int i = 0; i < nodos.getLength(); i++) {
            //Guardamos en el array de equipos cada objeto equipo
            listaEquipos.add(getEquipos(nodos.item(i)));

        }
        //Mostramos el array de equipos
        for (Equipo e : listaEquipos) {
            System.out.println(e.getNombre());
            System.out.println(e.getPuntuacion());
        }
    }

    /**
     * Funcion con la que cogemos los equipos con atributos y elementos para
     * añadirlos al arrayList creado anteriormente
     *
     */
    /**
     * Funcion con la que cogemos los equipos con atributos y elementos para
     * añadirlos al arrayList creado anteriormente
     *
     * @param partido establecemos el partido con sus atributos
     * @return partido devuelve el partido
     */
    public static Equipo getEquipos(Node partido) {
        if (partido.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) partido;

            System.out.println("cod: " + element.getAttribute("cod"));
            System.out.println("nombre: " + element.getElementsByTagName("nombre").item(0).getTextContent());
            System.out.println("puntos: " + element.getElementsByTagName("puntos").item(0).getTextContent());

            element.getAttribute("cod");
            e.setNombre(obtenerValor("nombre", element));
            e.setPuntuacion(Integer.parseInt(obtenerValor("puntuacion", element)));
        }
        return e;
    }

    /**
     * Funcion con la que obtenemos el valor de los elementos del arbol XML
     *
     * @param tag La etiqueta del elemento
     * @param partido Nodo de partido
     * @return Texto recuperado
     */
    public static String obtenerValor(String tag, Element partido) {
        NodeList nodos = partido.getElementsByTagName(tag).item(0).getChildNodes();
        Node nodo = nodos.item(0);
        System.out.println(tag);
        return nodo.getNodeValue();
    }

    /**
     * Funcion con la que cogemos la ultima vez que se actualizo la
     * clasificacion
     *
     * @return devuelve la ultima actualizacion de la clasificacion
     * @throws ParseException hereda excepciones
     */
    public static Date getFechaActualizado() throws ParseException {
        NodeList nodes = elementoRaiz.getElementsByTagName("fecha_actualizacion");
        Node nodo = nodes.item(0);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = formatter.parse(nodo.getNodeValue());
        return date;
    }
}
