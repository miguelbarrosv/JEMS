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
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author 1gdaw05
 */
/*public class ParserDom {
    public static void main(String[] args) throws SAXException, IOException {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            
             InputSource datos = new InputSource(new StringReader());
             
            Document doc = dBuilder.parse(datos);
            doc.getDocumentElement().normalize();
            
            NodeList nodos = doc.getElementsByTagName("");
                    
            ArrayList<> listaAlojamientos = new ArrayList<Alojamiento>();
            for (int i=0; i< nodos.getLength();i++) {
                listaAlojamientos.add(getAlojamientos(nodos.item(i)));
            }
        } catch (ParserConfigurationException ex) {
            
        }
    }
}*/
