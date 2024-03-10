package scanner.javaaa;

import java.util.Scanner;

public class ScannerInputShort {
	
	public static void main(String[] args) {
	
	System.out.println("Enter a Integer");
	
	Scanner enternumber = new Scanner(System.in);
	System.out.println(enternumber);
	short a = enternumber.nextShort();
	System.out.println("my 2nd Scanner class /t + a");
	boolean b = enternumber.hasNextShort();
	System.out.println(b);
}

}
