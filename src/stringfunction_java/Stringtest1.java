package stringfunction_java;

public class Stringtest1 {
	
	public static void main(String[] args) {
		//String integer boolean char double short long float
       String s = "Test Automation";
       String s1 = "test automation";
       
      System.out.println(s.equals(s1));
      System.out.println(s.equalsIgnoreCase(s1));
       
       System.out.println(s.length()); //varible+.lenght, .trim,
       
      System.out.println(s.contains(s1)); 
      
      String s4=s.toUpperCase();
      String s5=s1.toUpperCase();
      System.out.println(s5);
      System.out.println(s4.equals(s5));
       
   String s3 = s.trim();
   System.out.println(s3);
		
		
	}

}
