package arrays;

import java.util.Scanner;

public class DynamicReadArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int[] a = new int[s.nextInt()];
		System.out.println("Enter "+a.length+" integer elements in an array");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Array elements");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
	}
}
