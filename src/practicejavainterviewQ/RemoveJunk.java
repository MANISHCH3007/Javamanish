package practicejavainterviewQ;

public class RemoveJunk {
	
	public static void main(String[] args) {
		
		String s ="??<><manishCHAUhan1993xyz";
		String s1="@@@@21###$$%%%manish@#@#@!@#Chauhan";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		s1=s1.replaceAll("[^sa-zA-Z0-9]", "");
		System.out.println(s);
		System.out.println(s1);
	}
// regular expression
}
