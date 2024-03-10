package controlstatement;

public class ForEach_Loop_java {
	
    public static void main(String[] args) 
    {
    	String names[]= {"manish","yashwant","digambar"};
    	int numbers[]= {1,2,3,4,5,6,7};
    	
    	for(String copied : names)
    	{
    	System.out.println(copied);	
    	System.out.println(copied.length());
         }
    	
    	for(int copied : numbers)
    	{
    	System.out.println(copied);	
    	}
   }
}
