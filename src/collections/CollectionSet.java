package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> addvalue = new TreeSet<Integer>();
		addvalue.add(23);
		addvalue.add(2332);
		addvalue.add(7376);
		addvalue.add(230);
		addvalue.add(123);
		System.out.println(addvalue);
		Integer floorvalue = addvalue.floor(23332);
		System.out.println(floorvalue);
		System.out.println(addvalue);

		Integer ceilingvalue = addvalue.ceiling(7377);
		System.out.println(ceilingvalue);

		Integer higher = addvalue.higher(20);
		System.out.println(higher);
		
		SortedSet<String> mani = new TreeSet<String>();
		
		mani.add("as");
		mani.add("wx");
		mani.add("rt");
		mani.add("kc");
		System.out.println(mani);
		
	    SortedSet<Integer> set = new TreeSet<Integer>();   
		set.add(12);  
        set.add(98);  
        set.add(100);  
        set.add(2);  
		 
		System.out.println(set);


		
		
	}
}
