package Collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		
		
		//creating LinkList ;
		LinkedList src=new LinkedList();
		
		System.out.println("Intial size of the LinkList src : "+src.size());
		
		//Adding elements to the Linked list;
		src.add("A");
		src.add("S");
		src.add("E");
		src.add("E");
		src.add("M");
		src.add("C");
		src.add("H");
		src.add("A");
		src.add("K");
		src.add("R");
		src.add("A");
		src.add("B");
		src.add("A");
		src.add("R");
		src.add("T");
		src.add("H");
		src.add("Y");
		src.addFirst("H");
		src.addLast("H");
		
		System.out.println("LinkList size() after add element LinkList : "+src.size());
		System.out.println("After adding element LinkList : "+src);
		
		
		
		//remove first and last element ;
		src.removeLast();
		src.removeFirst();
		System.out.println("After removing first and Last element : "+src.size());
		System.out.println("After removing first and last element : "+src);
		
		
		
		
		//remove element from LinkList;
		src.remove("A");
		src.remove("S");
		src.remove("E");
		src.remove("E");
		src.remove("M");
		
		System.out.println("After removing element from LinkList : "+src.size());
		System.out.println("After removing element from LinKlist : "+src);
		
		
		//get and set a value;
		Object val=src.get(11);
		src.set(11, (String) val + "Changed");
		
		System.out.println("src after changed : "+src);
		
		

	}

}
