package collections;

import java.util.ArrayList;
import java.util.List;

public class Listcollection {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Technique 1
		List calllist = new ArrayList<>();
		calllist.add("Manish");
		calllist.add(true);
		calllist.add(5.8f);
		calllist.add(74.43d);
		calllist.add(29);
		calllist.add(9813000007l);
		
		//technique-II
		List <Integer> calllist2 = new ArrayList<>();
		calllist2.add(101);
		calllist2.add(1001);
		calllist2.add(10001);
		calllist2.add(100001);
		calllist2.add(29);
		calllist2.add(98130);
		
		System.out.println(calllist2);
		System.out.println("before");
		System.out.println(calllist2.size());
		
		System.out.println("after");
		
		
		calllist2.remove(5);
		System.out.println(calllist2);
		System.out.println(calllist2.size());
		
		
		boolean checkliststatus = calllist2.isEmpty();
		System.out.println(checkliststatus);
		
		/*
		 * calllist2.removeAll(calllist2); System.out.println(calllist2);
		 */
		checkliststatus = calllist2.isEmpty();
		System.out.println(checkliststatus);
		
		calllist2.addAll(calllist2);
		System.out.println(calllist2);
		
		boolean containstatus = calllist2.containsAll(calllist2);
		System.out.println(containstatus);
		
		int checkindex = calllist.lastIndexOf("Manish");

		System.out.println(checkindex);
		System.out.println(checkindex);
		

		ArrayList <Integer> calllist3 = new ArrayList<>();

		


				
		
	}

}
