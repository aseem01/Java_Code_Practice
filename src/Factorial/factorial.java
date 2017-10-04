package Factorial;

import java.util.Scanner;

class calculation
{
	int fact(int n)
	{
		if(n==1) return 1;
		else return n*fact(n-1);
	}
}

public class factorial {

	public static void main(String[] args)
	{
     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choose number : ");
		int input=sc.nextInt();
		calculation n=new calculation();
		int value=n.fact(input);
       System.out.println("factorial "+input+" is "+value);
       sc.close();
	}

}
