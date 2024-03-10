package datatype_base_methods;

public class Arrayjava_program {
	
	/**
	 * @param args
	 */
	public static void main(String[]args) {
		int number[] = {21,23,54,76,78}; // array is collection of values with similar Datatype.
		//System.out.println(number.length);
		
		for(int i=0;i<number.length;i++)
		{
			System.out.println(number[i]+ ",");
			
		}
		//technique2
		
		//int[] number1 = {21,23,54,76,78};
		
		
		//technique3
		 int addarray[]= new int [5]; 
		 addarray[0]= 7;
		 addarray[1]= 8;
		 addarray[2]= 9;
		 addarray[4]= 15;
		 
		 for(int k =0;k<addarray.length;k++)
			{
				System.out.println(addarray[k]+ " ");
		 		
			}
		 
		
	}

}
