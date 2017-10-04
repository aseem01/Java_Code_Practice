package Reverse_Number;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you valid string");
		
		String s=sc.next();
		
		System.out.print("Reverse String is : ");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		sc.close();

	}

}
