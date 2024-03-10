package java_encapsulation;

public class Encapsulationjava {
	 static int a;
	static int b;
	public static int getB() {
		return b;
	}
	public static void setB(int b) {
		b=45;
		Encapsulationjava.b = b;
		System.out.println(b);
	}
	
	int c;
	
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		a= 90;
		Encapsulationjava.a = a;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		setA(a);
        setB(20);
        setB(b);
        
	}

}
