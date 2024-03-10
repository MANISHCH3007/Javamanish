package javamethodoverloadings;

public class Inheritancejava {// ist class, main class /
	static String firstname = "Manish";
    static String lastname = "Chauhan";
	//public static String name1="Ram";// static
	//public String name2 ="shyam";// non static
	
	
	  static public void testing() // override
	  
	  { System.out.println("this is my first class"); }
	 
	
	public static void main(String[] args) {
		
		
		  Inheritancejava2 call_name= new Inheritancejava2();
		  System.out.println(call_name.firstname2 + "\t" + call_name.lastname);
		  call_name.testing();
		
		 
		 
		
		
		  System.out.println(Inheritancejava3.firstname);
		  System.out.println(Inheritancejava3.firstname2);
		  System.out.println(Inheritancejava3.lastname); 
		  Inheritancejava3.testing();
		  //System.out.println(Inheritancejava2.name1);
		 // System.out.println(call_name.name2);
		 
		
	}
	
}
class Inheritancejava2 extends Inheritancejava{// sub class // child class
	static String firstname2 = "Lavisha";
	
	
	  static public void testing() 
	  { System.out.println("this is my 2nd class");
	  } }
	 
	
	
	  class Inheritancejava3 extends Inheritancejava2{// 2n int age = 27;
	  
	  static public void testing()
	  {
	  System.out.println("this is my automation class"); } }
	 