package decisionMakingStatement;

import java.util.Scanner;

public class If_Else_Ladder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		if (a==b) {
			System.out.println("Both are same");
		}
		else if (a>b) {
			System.out.println(a+" is largest");
		}
		else{
			System.out.println(b+" is largest");
		}
	}
}
