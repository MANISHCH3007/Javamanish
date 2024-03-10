package stringfunction_java;

public class ReverseString{
	
	public static void main(String[] args, int i) {
		//String integer boolean char double short long float
       //String s = "Test Automation";
       String s1 = "test automation";
       String rev="";
       int len= s1.length();
       
      for(int j=len-1;j>=0;i--){
    
         rev= rev + s1.charAt(j);

       }
      
       System.out.println(rev);
		
		/*
		 * for(int i=0;i<s1.length();i++) {
		 * 
		 * System.out.println(s1.charAt(i)); }
		 * 
		 * char c=s.charAt(7); System.out.println(c);
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(s.equals(s1)); System.out.println(s.equalsIgnoreCase(s1));
		 * 
		 * System.out.println(s.length()); //varible+.lenght, .trim,
		 * 
		 * System.out.println(s.contains(s1));
		 * 
		 * String s4=s.toUpperCase(); String s5=s1.toUpperCase();
		 * System.out.println(s5); System.out.println(s4.equals(s5));
		 * 
		 * String s3 = s.trim(); System.out.println(s3);
		 * 
		 */
	}
}

