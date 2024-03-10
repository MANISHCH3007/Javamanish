package exceptionjavaa;

public class NumberFormat_javaa {
	
	public static void main(String args[]){
		
    try    {
    	      int a1 = Integer.parseInt("Manish");
    	      float a2 = Float.parseFloat("Yogesh");
    	      double a3 = Double.parseDouble("Yashwant");
		      System.out.println(a1);
		      System.out.println(a2);
		      System.out.println(a3);
		      
		   } 
           catch(NumberFormatException e)
		    {
    	    System.out.println("oh just check\t"+ e); 				  
		    }
           finally {
        	     
        	   System.out.println("Exception is catched");
        	   
        	  
           }
    
    
		  }
}
	 	 

