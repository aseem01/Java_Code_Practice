package Fibonacci;

import java.util.Scanner;

class calculation
{
	int fibo(int n)
	{
		if(n<2) return n;
		else return fibo(n-1)+fibo(n-2);
	}
}

public class Fibonacci_code {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choose name : ");
		int input=sc.nextInt();
		calculation obj=new calculation();
		int value=obj.fibo(input-1);
		System.out.println("Fibonacci "+input+" is "+value);
		
		sc.close();
	}

}
