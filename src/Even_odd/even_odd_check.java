package Even_odd;

import java.util.Scanner;
import java.util.Vector;

public class even_odd_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choosen number : ");
		int n = sc.nextInt();
		if (n % 2 == 1)
			System.out.println("Enter number is odd number");
		else
			System.out.println("Enter number is Even number");
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1)
				v1.add(i);
			else
				v2.add(i);
		}

		System.out.print("Even number Print:");
		for (int i = 0; i < v2.size(); i++) {
			System.out.print(" " + v2.get(i));
		}

		System.out.print("\n Odd number Print:");
		for (int i = 0; i < v1.size(); i++) {
			System.out.print(" " + v1.get(i));
		}
		System.out.println();
		sc.close();

	}

}
