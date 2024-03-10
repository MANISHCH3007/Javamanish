package manish.java;

public class ConstructorJava {
	
	int i; //non-static//instance//dependant
	String name;
	byte number=12;
	short number_1=999;
	long mobile_no=9999999999L;
	char name_intial='a';
	boolean gender = true;
	float height=3.4f;
	double weight=47;
	
	
	public ConstructorJava(int i) // parameterized constructor or argument
	{
		this.i=i;
	System.out.println(i);
	}
	public ConstructorJava(byte k) // parameterized constructor or argument
	{
		this.number =k;
	System.out.println(k);
	}
	public ConstructorJava(short p) // parameterized constructor or argument
	{
		this.number_1 =p;
	System.out.println(p);
	}
	public ConstructorJava(long n) // parameterized constructor or argument
	{
		this.mobile_no =n;
	System.out.println(n);
	}
	public ConstructorJava(String a) // parameterized constructor or argument
	{
		this.name =a;
	System.out.println(a);
	}
	public ConstructorJava(double x) // parameterized constructor or argument
	{
		this.weight =x;
	System.out.println(x);
	}
	public ConstructorJava(float f) // parameterized constructor or argument
	{
		this.height =f;
	System.out.println(f);
	}
	public static void main (String[]args)
	
	{
	ConstructorJava call_cons = new ConstructorJava(3);
	 call_cons = new ConstructorJava("apple");
	 call_cons  = new ConstructorJava(2);
	 call_cons = new ConstructorJava('Z');
	 call_cons = new ConstructorJava(45);
	 call_cons = new ConstructorJava(3.14D);
	 call_cons = new ConstructorJava (5.5F);
	 call_cons = new ConstructorJava (462535L);
	
	
		
	}
	
}
