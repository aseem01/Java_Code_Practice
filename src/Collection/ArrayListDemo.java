package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		//Create an array list;
		ArrayList a1=new ArrayList();
		System.out.println("Intial size of a1 : "+a1.size());
		
		//add elements to the array list
		a1.add("A");
		a1.add("S");
		a1.add("E");
		a1.add("E");
		a1.add("M");
		a1.add(1, "C");
		
		System.out.println("Size of all after addition : "+a1.size());
		
		
		//display the array list 
		System.out.println("Content of a1 : "+a1);
		
		
		
		//remove element from the array list 
		
		a1.remove(4);
		a1.remove("S");
		a1.remove("E");
		
		System.out.println("Size of all after delitions : "+a1.size());
		System.out.println("Content of a1 : "+a1);
		
		
		

	}

}
