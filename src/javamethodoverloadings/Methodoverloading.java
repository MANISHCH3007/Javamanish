package javamethodoverloadings;

public class Methodoverloading {
	public static void method1() { // same method name with different parameters
		
		System.out.println("method 1");	
	}
	
    public static void method1(String name) { 
		
		System.out.println("method1"+ name);	
	}
    public static void method1(String name,int age) { 
		
  		System.out.println("method1"+ name+"\t"+age);	
  	}
   public static void method1(String name,int age,double weight) { 
		
  		System.out.println("method1"+ name+"\t"+age+"\t"+weight);	
  	}
   public static void method1(String name,int age,double weight,float height) { 
		
 		System.out.println("method1"+ name+"\t"+age+"\t"+weight+"\t"+ height);	
 	}
	public static void main(String[] args) {
		method1();
		method1("manish");
		method1("manish",30);
		method1("manish",30,73.3);
		method1("manish",30,73.3,5.7f);
		
		
	}

}
