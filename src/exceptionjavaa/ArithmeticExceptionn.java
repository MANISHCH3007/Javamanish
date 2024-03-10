package exceptionjavaa;

public class ArithmeticExceptionn {
	
	public static void main(String args[]){
		
    try    {
    	      int a = 3;
		      int c =3/0;
		      System.out.println(c);
		   } 
           catch(ArithmeticException e)
		    {
    	    System.out.println("oh just check\t"+ e); 				  
		    }
           finally {
        	   
        	   System.out.println("Exception is catched");
        	   
        	   int c = 3/3;
        	   System.out.println(c);
           }
    
    
		  }
}
		 

