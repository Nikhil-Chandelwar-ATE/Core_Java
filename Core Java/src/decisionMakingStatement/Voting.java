package decisionMakingStatement;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		if (age>=18) {
			System.out.println("Hello");
			System.out.println("You are eligible");
			System.out.println("Thank You");
		}
		System.out.println("Thank you");
	}
}
