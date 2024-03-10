package manish.java;

public class CompactNotation {

	public static void main(String[]args) {
		int a= 36;
		int b= 64;
		
		//a = a+b;
		//a+=b; //(a=a+b) compact natation
		
		//System.out.println(a);
		
		//a= a-b;
		//a-=b;// a= a-b  = -28-64
		//System.out.println(a);
		
		a=a*b;//=36*64=2304
		a*=b;//a=a*b= 2304x64
		System.out.println(a);
	}
}
