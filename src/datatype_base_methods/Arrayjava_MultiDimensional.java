package datatype_base_methods;

public class Arrayjava_MultiDimensional {
	
	public static void main(String[] args) {
		int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
		
		for (int i =0;i<arr.length;i++) {
			
		for (int j = 0;j<arr.length;j++)	
			System.out.print(arr[i][j]+ "  ");
		System.out.println();
	
		int [] a= {453,102,1098,4987,500,3346,90};//passingarrays to methods sum to calculate the sum of the array's values
		sum(a);
	}}
	public static void sum (int []arr) 
	{
		
		int sum = 0;
		for (int i =0; i<7;i++)
			sum += arr [i];
		System.out.println("sum of array row:"+ sum);
	
	}
	
	
	
	
}