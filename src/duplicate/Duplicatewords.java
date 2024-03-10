package duplicate;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicatewords {
	
	
public static void main(String[] args) {
	
	String s= "testcodemanvencypressseleniumautomatiom";
	char [] c = s.toCharArray();
	
	HashMap<Character, Integer>map= new HashMap<>();
	
	for (char t : c) {
		if(map.containsKey(t)) {
			map.put(t, map.get(t)+1);
		}
		else {
			map.put(t, 1);
		}
		System.out.println(map);
		Set<Entry<Character,Integer>>entry=map.entrySet();
		
		for(Entry<Character,Integer>r:entry) {
			
			if(r.getValue()>=2) {
				System.out.println(r.getKey()+ " "+ r.getValue());
			}
		}
	}
		
		
	}
	
}

