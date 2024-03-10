package scanner.javaaa;

import java.util.Scanner;

public class ScannerInputInt
{
public static void main(String[] args) {
	
	System.out.println("Enter a Integer");
	
	Scanner enternumber = new Scanner(System.in);
	System.out.println(enternumber);
	int a = enternumber.nextInt();
	System.out.println("my first Scanner class a\n"+ a);
}
}
