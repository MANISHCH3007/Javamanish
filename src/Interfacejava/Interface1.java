package Interfacejava;

public  interface Interface1 {
	public abstract void method1();
	public abstract void method2();
	public abstract void method3();
	public abstract void method4();
	public abstract void method5();
	
	public static void test()
	{
		
	}
	
	public static void main(String[] args) {
		Interface1 callmethods = new Interface2();
		callmethods.method1();
		callmethods.method2();
		callmethods.method3();
		callmethods.method4();
		callmethods.method5();
		
	}

}
class Interface2 implements Interface1
{

	@Override
	public void method1() {
		System.out.println("1");
		
	}

	@Override
	public void method2() {
		System.out.println(2);
		
	}

	@Override
	public void method3() {
		System.out.println("3");
		
	}

	@Override
	public void method4() {
		System.out.println("4");
	}

	@Override
	
	public void method5() {
		System.out.println("5");
	}
	
}
