package collection;

import java.util.ArrayList;

public class ArrayListSearchMethod {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add('a');
		al1.add("Nikhil");
		al1.add(true);
		al1.add(10.45);
		System.out.println(al1.contains('a'));
		System.out.println(al1.contains('b'));
		System.out.println(al1.indexOf('a'));
		System.out.println(al1.indexOf(10));
		System.out.println(al1.indexOf(20));   //-1 because object is not
		                                       //present in list
		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add("Nikhil");
		al2.add(true);
		System.out.println(al1.containsAll(al2));
		
		
	}
}
