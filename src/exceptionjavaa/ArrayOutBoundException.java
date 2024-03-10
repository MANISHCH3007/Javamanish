package exceptionjavaa;

public class ArrayOutBoundException {
	
	public static void main(String args[]){
		
    try    {
    	      int a[]= {0,1,3,5};
		      System.out.println(a[4]);
		      
		   } 
           catch(ArrayIndexOutOfBoundsException e)
		    {
    	    System.out.println("oh just check\t"+ e); 				  
		    }
           finally {
        	     
        	   System.out.println("Exception is catched");
        	   
        	  
           }
    
    
		  }
}
	 	 

