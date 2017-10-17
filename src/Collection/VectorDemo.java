package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		//Creating vector initial vector size() is 3: increment size() is 2;
		Vector src = new Vector(3,2);
		System.out.println("Initial size() of the vector is : "+src.size());
		System.out.println("Inital size() of the capacity() : "+src.capacity());
		src.addElement(new Integer(1));
		src.addElement(new Integer(2));
		src.addElement(new Integer(3));
		src.addElement(new Integer(4));
		System.out.println("After addElement vector size() : "+src.size());
		System.out.println("After addElement vector capacity : "+src.capacity());
		System.out.println("After addElement vector Element : "+src);
		
		
		//Adding Double Element in vector ;
		src.addElement(new Double(4.19));
		src.addElement(new Double(4.30));
		System.out.println("After adding double vector size() : "+src.size());
		System.out.println("After adding double vector capacity() : "+src.capacity());
		System.out.println("After adding double vector Element : "+src);
		
		
		//Adding Float Element in vector;
		src.addElement(new Float(44.22));
		src.addElement(new Float(45.01));
		src.addElement(new Float(50.88));
		src.addElement(new Float(444.88));
		System.out.println("After adding Float Element in the vector size() : "+src.size());
		System.out.println("After Adding Flaot Element in the vector capacity() : "+src.capacity());
		System.out.println("After Adding Float Element in the vector Element : "+src);
		
		//Adding Integer Element in vector;
		src.addElement(new Integer(10));
		src.addElement(new Integer(20));
		System.out.println("After adding Integer Element in the vector size() : "+src.size());
		System.out.println("After Adding Integer  Element in the vector capacity() : "+src.capacity());
		System.out.println("After Adding Integer Element in the vector Element : "+src);
		
		//Checking first and Last Element;
		System.out.println("Vector First Element is : "+src.firstElement());
		System.out.println("Vector Last Element is : "+src.lastElement());
		
		
		//Checking By contains;
		if(src.contains(new Integer(3)))
		{
			System.out.println("Vector contains 3");
		}
		
		
		
		
		
		

	}

}
