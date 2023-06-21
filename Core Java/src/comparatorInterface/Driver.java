package comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(new Pen("Cello",40));
		arr.add(new Pen("Reynolds",30));
		arr.add(new Pen("Parker",70));
		arr.add(new Pen("Nataraj",20));
		
		System.out.println(arr);
		System.out.println("**********************************");
		Collections.sort(arr, new ComparePrice());
		System.out.println(arr);
		System.out.println("**********************************");
		Collections.sort(arr, new CompareBrand());
		System.out.println(arr);
		
	}
}
