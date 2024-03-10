package stringfunction_java;

public class ReverseString2 {

	public static void main(String[] args) {
		String s = "automationtesting";
		// 1st method for looping
		  int len = s.length(); String rev = "";
		  
		  for (int i = len-1; i > 0; i--) { rev = rev + s.charAt(i);
		  
		  }
		  
		  System.out.println(rev);
		 
		//2nd method StringBuffer
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
	}

	
	
}
