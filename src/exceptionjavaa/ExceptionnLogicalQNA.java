package exceptionjavaa;

public class ExceptionnLogicalQNA {
	
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
	/*
	 * catch(NullPointerException e) { System.out.println("oh just check\t"+ e); }
	 */
    catch(NumberFormatException e)
    {
    System.out.println("oh just check\t"+ e); 				  
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
    System.out.println("oh just check\t"+ e); 				  
    }
    catch(StringIndexOutOfBoundsException e)
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
		 

