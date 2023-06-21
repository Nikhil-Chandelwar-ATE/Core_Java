package methods;

import java.util.Scanner;
public class DynamicRead {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("Sum of "+num1+" & "+num2+" = "+res);
	}
}
