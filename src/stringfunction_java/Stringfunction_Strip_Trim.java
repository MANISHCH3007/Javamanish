 package stringfunction_java;

public class Stringfunction_Strip_Trim {
public static void main(String[] args) {
	
	String name = "    Manish     ";
	int charbeforecount = name.length();
	System.out.println(charbeforecount);
	
	String name1 = name.trim();//a string whose value is this string, with all leadingand trailing space removed, or this string if ithas no leading or trailing space.
    System.out.println(name1);
    int charaftercount = name1.length();
    System.out.println(charaftercount);
    name1 = name.strip();
    System.out.println(name1);
}
}
