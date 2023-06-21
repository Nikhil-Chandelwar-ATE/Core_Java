package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(30.0);
		al1.add(65.3);
		al1.add(45.4);
		al1.add(63.6);
		al1.add(70.9);
		
		System.out.println("collection = "+al1);
		Collections.sort(al1);
		System.out.println("After sorted = "+al1);
		Collections.reverse(al1);
		System.out.println("After reverse = "+al1);
	}
}
