package controlstatement;

public class NestedIf {
	public static void main (String []args) {
		String my_car_name = "bmw";
		String my_name = "manish";
		String my_friend = "digamber";
		String my_colour = "white";
		
	if (my_car_name=="bmw")// fasle
		{
			System.out.println("my car swift");
		
		if (my_car_name=="bmw") 
		{
			System.out.println("this is nestedif 2nd");
			
		}
		if (my_car_name=="bmw") 
			
			
		{
			System.out.println("this is nestedif");
			
		}	
	
		}
		if (my_name=="manish")// fasle
		{
			System.out.println("manish");
		
		if (my_friend=="digambar") // fasle
		{
			System.out.println("this is nestedif 2nd");
			
		}
		if (my_colour=="white") 		
		{
			System.out.println("white in nestif");
			
		}	
		
		System.out.println("out of if");
		
	
	}
	
	}
}
