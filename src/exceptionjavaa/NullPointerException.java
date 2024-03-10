package exceptionjavaa;

public class NullPointerException {

	public static void main(String args[]){
		String name = null;

    try    {
    	if (name.equals("grf"))
            System.out.print("Same");
        else
            System.out.print("Not Same");
           }
   catch(NullPointerException check_the_exception)
           {
        System.out.print("NullPointerException Caught");
           }
        }
       }


			/*
			 * finally {
			 *
			 * System.out.println("Exception is catched");
			 *
			 * int c = 3/3; System.out.println(c); }
			 */


		  



