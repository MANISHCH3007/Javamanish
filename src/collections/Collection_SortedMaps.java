package collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class Collection_SortedMaps {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> addelements= new TreeMap<Integer,String>();
		
		addelements.put(27, "Mani");
		addelements.put(28, "Manis");
		addelements.put(27, "Mani"); // that skip dupicate valuess
		addelements.put(20, "Manvi");
		
		TreeMap<String,String> addelement= new TreeMap<String,String>();
		addelement.put("Name", "Manish");
		addelement.put("Lastname", "Chauhan");
		addelement.put("Fathername", "Anil");
		addelement.put("Caste", "Rajput"); // Autosort values
		
		System.out.println(addelement);
		System.out.println(addelements);
	}

	
}
