package scanner.javaaa;

import java.util.Scanner;

public class ScannerInputByte
{
public static void main(String[] args) {
	
	System.out.println("Enter a Integer");
	
	Scanner enternumber = new Scanner(System.in);
	System.out.println(enternumber);
	byte a = enternumber.nextByte();
	System.out.println("my 2nd Scanner class \t"+ a);
	boolean b = enternumber.hasNextByte();
	System.out.println(b);
}
}


