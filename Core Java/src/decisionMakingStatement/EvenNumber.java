package decisionMakingStatement;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int num = s.nextInt();
		if (num%2==0) {
			System.out.println("Hi");
		}
	}
}
