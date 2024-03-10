package collections;
import java.util.Queue;
import java.util.PriorityQueue;

public class QueueInterface {

	
	public static void main(String[] args) {
		
		Queue<String> insertelements = new PriorityQueue<String>();
		insertelements.add("Manish");
		insertelements.add("Axis");
		insertelements.add("Yogesh");
		insertelements.add("Yashwant");
		String testing = insertelements.element();
		System.out.println(testing);
		System.out.println(insertelements);
		
		insertelements.offer("Apala");
		System.out.println(insertelements);
		boolean justcheck = insertelements.offer(" ");
		System.out.println(justcheck);

		

		
		
	}
}
