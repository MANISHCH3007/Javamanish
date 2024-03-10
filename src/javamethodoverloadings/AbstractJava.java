package javamethodoverloadings;

public abstract class AbstractJava {
	
	//public abstract void method11();// its hides the implementation of the concreate method
	public  void method11() {}
	
	public static void main(String[] args) {
		AbstractJava4 abstractcallinghhh = new AbstractJava4();
		abstractcallinghhh.method11();
		abstractcallinghhh.method12();
		abstractcallinghhh.method10();
		
	
	}

}
abstract class AbstractJava2 extends AbstractJava{
	
	//public abstract void method12();         // opening the method or defining the boby
		public void method11() {
		
		System.out.println("Abstract method has been opened methid 11");
	
	}
	
}
abstract class AbstractJava3 extends AbstractJava2{
	public void method12()
	{
		
		System.out.println("abstract method is called for method 12");
		
	}
}
class AbstractJava4 extends AbstractJava3{
	public void method10()
	{
		
		System.out.println("abstract method is called");
	}
}