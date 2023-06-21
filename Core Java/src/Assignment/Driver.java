package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Driver {

public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 to compare as a Brand");
		System.out.println("Enter 2 to compare as a price");
		System.out.println("Enter 3 to compare as a Ram");
		int num=s.nextInt();
		
		ArrayList al=new ArrayList();
		al.add(new Mobile("Mi",15000,256));
		al.add(new Mobile("Samsung",12000,512));
		al.add(new Mobile("Apple",17000,128));

		System.out.println(al);
		switch (num) {
		case 1:
		{
			Collections.sort(al, new CompareBrand());
			break;
		}
		case 2:
		{
			Collections.sort(al, new ComparePrice());
			break;
		}
		case 3:
		{
			Collections.sort(al, new CompareRam());
			break;
		}
		default :
		{
			System.out.println("Enter a valid input");
		}
		}
		System.out.println("After Sorting");
		System.out.println(al);
	}
}
