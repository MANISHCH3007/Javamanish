package collections;

import java.util.Random;

public class Roundclass {

	public static void main(String[] args) {
	
		float floatnumber = 56.55f;
		System.out.println(Math.round(floatnumber));
		
		Random numbergen = new Random();
		int a = numbergen.nextInt(45);
		System.out.println(a);
		
	}

}
