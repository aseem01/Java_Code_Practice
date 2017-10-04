package Power_finding;

import java.util.Scanner;

public class Power_finding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your base and power : ");
		int base = sc.nextInt();
		int power = sc.nextInt();
		double result = Math.pow(base, power);
		System.out.println("Final result is : " + result);

		sc.close();

	}

}
