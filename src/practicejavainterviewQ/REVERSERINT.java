package practicejavainterviewQ;

public class REVERSERINT {
	
	
 public static void main(String[] args) {
	 // using alogorithem
	 int num = 9813083;
	 int rev = 0;
	 
	 while(num !=0) {
		 
		 rev= rev*10 + num%10;
		num =num/10; 
		 
	 }
	 System.out.println("Reverser num value ::"+ rev);
			 //2. using StringBuffer method
	 int num1=23412;
	 System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
			  
	
}

}
