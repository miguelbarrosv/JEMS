/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

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
        
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();;
           
            InputSource datos = new InputSource(new StringReader(Euskalmet()));
            
            Document doc = dBuilder.parse(datos);
            elementoRaiz = doc.getDocumentElement();
            
            NodeList datosLiga = elementoRaiz.getChildNodes();
            for (int x = 0; x < datosLiga.getLength(); x++) {
                    Node dato = datosLiga.item(x);
                    
                    if (dato.getNodeType() == Node.ELEMENT_NODE) {
                        System.out.println(dato.getNodeName());
                    }
                    
                    Node contenido = dato.getFirstChild();
                    if (contenido != null) {
                        System.out.println(" " + contenido.getNodeName());
                    }
                }
            
            NodeList listaEquipos = doc.getElementsByTagName("equipo");
            
            for (int i = 0; i < listaEquipos.getLength(); i++) {
                Node partido = listaEquipos.item(i);
                System.out.println("Equipo " + i);
                
                NodeList datosEquipo = partido.getChildNodes();
                for (int x = 0; x < datosEquipo.getLength(); x++) {
                    Node dato = datosEquipo.item(x);
                    
                    if (dato.getNodeType() == Node.ELEMENT_NODE) {
                        System.out.println(dato.getNodeName());
                    }
                    
                    Node contenido = dato.getFirstChild();
                    if (contenido != null) {
                        System.out.println(" " + contenido.getNodeName());
                    }
                }
                System.out.println("");
            }
    }      

    private static String Euskalmet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

