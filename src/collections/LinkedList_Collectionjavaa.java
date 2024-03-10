package collections;


import java.util.LinkedList;



public class LinkedList_Collectionjavaa { 
	
	public static void main(String[] args) {
		
      LinkedList<String> linkstr = new LinkedList<String>();
      linkstr.add(null);
      linkstr.add("Manish");
      linkstr.add("Yogesh");
      linkstr.add("Digambar");
      linkstr.add("Gaurav");
      System.out.println(linkstr);
      linkstr.addFirst("This is my Firsteverytime");
      System.out.println(linkstr);
      linkstr.addLast("this is my lastadd");
      System.out.println(linkstr);

     // peek & poll , peekfirst & pollfirst, peeklast & polllast
      
      String peek = linkstr.peek();
      System.out.println(peek);
      
      String peekfirst = linkstr.peekFirst();
      System.out.println(peekfirst);
      
      String peeklast = linkstr.peekLast();
      System.out.println(peeklast);
      
      String poll = linkstr.poll();
      System.out.println(poll);
      
      String pollfirst =linkstr.pollFirst();
      System.out.println(pollfirst);
      
      String polllast = linkstr.pollLast();
      System.out.println(polllast);
      
      System.out.println(linkstr);
      
      
      String getfirstval = linkstr.getFirst(); // use large value found
      String getlastval = linkstr.getLast();
      String getindex = linkstr.get(3);
      System.out.println(getfirstval+" "+ getlastval+" "+ getindex);
      
      boolean offertesting = linkstr.offer("Manish");
      System.out.println(offertesting);
      
		
		
	}

}
