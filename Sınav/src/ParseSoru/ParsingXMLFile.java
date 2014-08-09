package ParseSoru;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class ParsingXMLFile{

public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, DOMException, ParseException {
	
	
	File file = new File("C:\\Users\\kursad.aydin\\Desktop\\DetailedJobSearch.xml"); 

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
	 
		DocumentBuilder db = dbFactory.newDocumentBuilder(); 
		Document document = db.parse(file); 
		document.getDocumentElement().normalize(); 
		System.out.println("Kök dizin :" + document.getDocumentElement().getNodeName()); 
		NodeList liste = document.getElementsByTagName("DetailedJobSearch"); 

		for (int i = 0; i < liste.getLength(); i++) { 
			Node bag = liste.item(i); 
			if (bag.getNodeType()==Node.ELEMENT_NODE) { 

				Element eleman = (Element) bag; 
				//System.out.println( eleman.getElementsByTagName("KayitTarihi").item(0).getTextContent().toUpperCase()); 

				Sirket c = new Sirket();
				c.setKayittarihi(TimeChange.DateChanger(eleman.getElementsByTagName("KayitTarihi").item(0).getTextContent()));
				
				ArrayList<Sirket> listeSirket = new ArrayList<Sirket>(); 
				
				listeSirket.add(c);	 
				
				Collections.sort(listeSirket, new TarihSiralama());
				
				
				for (int j = 0; j < listeSirket.size(); j++) {
					
															
					System.out.print(listeSirket.get(j).getKayittarihi().get(Calendar.DATE)+ ".");
					System.out.print(listeSirket.get(j).getKayittarihi().get(Calendar.MONTH)+".");
					System.out.println(listeSirket.get(j).getKayittarihi().get(Calendar.YEAR));
				}
				

	
	
}

	
	
				  
		}

		
		
		
}


}



			 




		
		



		  
		 

		


