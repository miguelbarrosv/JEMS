/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import java.io.File;
import java.io.IOException;
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

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        File archivo = new File("./jornada.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        Document doc = dBuilder.parse(archivo);
        doc.getDocumentElement().normalize();
        System.out.println("Elemento raiz: " + doc.getDocumentElement().getNodeName());

        elementoRaiz = doc.getDocumentElement();

        NodeList listaJornadas = doc.getElementsByTagName("jornada");
        System.out.println("------------------------");

        for (int i = 0; i < listaJornadas.getLength(); i++) {
            Node jornada = listaJornadas.item(i);
            System.out.println("Elemento " + jornada.getNodeName());

            if (jornada.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) jornada;
                System.out.println("Fecha Fin: " + element.getAttribute("fecha_fin"));
                System.out.println("Fecha Inicio: " + element.getAttribute("fecha_inicio"));
                System.out.println("cod: " + element.getAttribute("cod"));
                System.out.println("partidos: " + element.getElementsByTagName("partidos").item(0).getTextContent());
            }

            NodeList listaPartidos = doc.getElementsByTagName("partido");
            System.out.println("-----------------------");

            for (int x = 0; x < listaPartidos.getLength(); x++) {
                Node partido = listaPartidos.item(x);
                System.out.println("Elemento " + partido.getNodeName());

                if (partido.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) partido;
                    System.out.println("cod: " + element.getAttribute("cod"));
                    System.out.println("Fecha Fin: " + element.getAttribute("fecha_fin"));
                    System.out.println("Fecha Inicio: " + element.getAttribute("fecha_inicio"));
                    System.out.println("Equipo Local: " + element.getElementsByTagName("equipo_local").item(0).getTextContent());
                    System.out.println("Equipo Visitante: " + element.getElementsByTagName("equipo_visitante").item(0).getTextContent());
                    System.out.println("Resultado: " + element.getElementsByTagName("resultado").item(0).getTextContent());
                }
            }
        }
    }
}
