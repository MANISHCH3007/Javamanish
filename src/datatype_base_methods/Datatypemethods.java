package datatype_base_methods;

public class Datatypemethods {
	/*public static String call_method1()
	{
		System.out.println();
		return"luck by chance";
	}*/
	public static String call_method2()
	{
	 String name = "Lucky";
	 System.out.println(name);
	 return name;}
	
	public static boolean call_method3()
	{ boolean gender= true;
	System.out.println(gender);
	return gender; 	
	}
	
	public static int call_method4()
	{ int a = 'a';
	System.out.println(a);
	return 'a'; }
	
	public static char call_method5()
	{ char b = 65;
	System.out.println(b);
	return 'a'; }
	
	public static float call_method6()
	{ float height = 5;
	System.out.println(height);
	return 'a'; }
	
	public static double call_method7()
	{ double height = 8;
	System.out.println(height);
	return 'a'; }
	
	public static long call_method8()
	{ long mobile = 9999999999l;
	System.out.println(mobile);
	return 'a'; }
	
	
	
	public static void main(String[]args)
	{ 
		String name=call_method2();
		System.out.println(name);
		//call_method1();
		//call_method2();
		call_method3();
		call_method4();
		call_method5();
		call_method6();
		call_method7();
		call_method8();
	}
}

