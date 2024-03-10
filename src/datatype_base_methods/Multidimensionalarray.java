
package datatype_base_methods;

public class Multidimensionalarray {
	public static void main (String[] args) {
		//Type I
		int rows =3;
		int columns =3;
		 String names[][]= {{"mani","lavi","mavi"},
				   {"aavi","diga","yash"},
				   {"appi","ram","sita"}};
		 
		 
		 char b[][]= {{'a','b','c'},
				   {'e','s','f'},
				   {'x','y','z'}};
		
	/*	for(int i=0;i<rows; i++)   {
	    for(int j=0;j<columns;j++) {
	
		System.out.print(names[i][j]+" ");
		System.out.println(b[i][j]+" ");
		
		
		  }	
			System.out.println();
		 }*/
		
		
		 
		//Type-II
		for(int i=0;i<names.length; i++)   {
		    for(int j=0;j<names[i].length;j++) {
		
			System.out.print(names[i][j]+" ");
		}
		System.out.println();
		}
		}	
		
	}


