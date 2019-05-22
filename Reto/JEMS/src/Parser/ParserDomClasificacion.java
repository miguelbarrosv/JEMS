/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
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
    
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {

            File archivo = new File("./liga.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            
            Document doc = dBuilder.parse(archivo);
            doc.getDocumentElement().normalize();
            System.out.println("Elemento raiz: " + doc.getDocumentElement().getNodeName());
            
            elementoRaiz = doc.getDocumentElement();
            System.out.println("cod: " + elementoRaiz.getAttribute("estado_liga"));
            System.out.println("cod: " + elementoRaiz.getAttribute("fecha_fin"));
            System.out.println("cod: " + elementoRaiz.getAttribute("fecha_inicio"));
            System.out.println("cod: " + elementoRaiz.getAttribute("cod"));
            
            NodeList listaEquipos = doc.getElementsByTagName("equipo");
            System.out.println("------------------------");
            
            for (int i = 0; i < listaEquipos.getLength(); i++) {
                Node partido = listaEquipos.item(i);
                
                System.out.println("Elemento " + partido.getNodeName());
                
                if (partido.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) partido;
                    System.out.println("cod: " + element.getAttribute("cod"));
                    System.out.println("nombre: " + element.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.println("puntos: " + element.getElementsByTagName("puntos").item(0).getTextContent());
                    }
            }
    }      
}

