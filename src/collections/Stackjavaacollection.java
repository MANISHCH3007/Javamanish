package collections;

import java.util.Stack;

public class Stackjavaacollection {
	
	public static void main(String[] args) {
		
		
		  Stack<String> callstack = new Stack<>();
		  callstack.add("Manish");
		  callstack.add("Deepak");
		  callstack.add("Ajeet");
		  callstack.add("Pankaj");
		  callstack.push("Testing for add new string Value");
		  callstack.add("Anil");
		  
		  System.out.println(callstack);

		  String popval =  callstack.pop();
		  System.out.println(popval);
		  
		  callstack.add("Pradeep");
		  
		  
		  String peekval = callstack.peek();
		  System.out.println(peekval);
		  
		  int capacityval = callstack.capacity();
		  System.out.println(capacityval);
		  
		 System.out.println(callstack.firstElement());
		 System.out.println(callstack.lastElement());
		 System.out.println(callstack.search(3));
		 System.out.println(callstack.clone());
		 System.out.println(callstack.indexOf("Pankaj"));
		 System.out.println(callstack.lastIndexOf(5));


	}

}
