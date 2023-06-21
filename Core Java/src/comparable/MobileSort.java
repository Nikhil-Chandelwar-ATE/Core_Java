package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MobileSort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println();
		ArrayList al=new ArrayList();
		al.add(new Mobile("Mi",15000));
		al.add(new Mobile("Samsung",12000));
		al.add(new Mobile("Apple",17000));

		System.out.println(al);
		System.out.println("******************************");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("******************************");
		Collections.sort(al);
		System.out.println(al);
	}
}
