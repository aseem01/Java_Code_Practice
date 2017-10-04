package Reverse_Number;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int n = sc.nextInt();
		System.out.println("Original number is : " + n);
		System.out.print("After Reverse ");
		while (n != 0) {
			int temp = n % 10;
			n /= 10;
			System.out.print(temp);
		}
		System.out.print("\n");
		sc.close();

	}

}
