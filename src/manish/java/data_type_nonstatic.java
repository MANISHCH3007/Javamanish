package manish.java;

public class data_type_nonstatic {

	String myname="Manish"; // groups of characters
	char firstletter ='Y';
	boolean gender_male = true;
	byte fav_number=13;
	short anothernumber=452;
	int empid=452635;
	long mobilenumber=9999999999l;
	float height=5.7f;
	double weight=54.54d;
	String myname2="monu";
	 
	public static void main(String[]args) {
		    // class name     non static
		data_type_nonstatic call_nonstatic = new data_type_nonstatic();
		
		System.out.println( call_nonstatic.myname); //initialization
		System.out.println( call_nonstatic.firstletter);
		System.out.println( call_nonstatic.gender_male);
		
		System.out.println( call_nonstatic .fav_number);
		System.out.println( call_nonstatic .anothernumber);
		System.out.println( call_nonstatic .empid);
		System.out.println( call_nonstatic .mobilenumber);
		System.out.println( call_nonstatic .height);
		System.out.println( call_nonstatic .weight);
		System.out.println(call_nonstatic.myname2);
		
		String lastname ="chauhan";
		System.out.println(lastname);
		
		int age = 29;
		System.out.println(age); 
		
		
		
	}

}  
