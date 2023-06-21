package collection;

import java.util.ArrayList;

public class ArrayListRemoveMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		System.out.println(al1);
		System.out.println(al1.remove(0));
		System.out.println(al1);
		
		ArrayList al2=new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(60);
		System.out.println(al2);
		
		al1.removeAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		
		ArrayList al3=new ArrayList();
		al3.add(10);
		al3.add(30);
		al3.add(50);
		System.out.println(al3);
		
		al1.retainAll(al3);
		System.out.println(al1);
		System.out.println(al3);
		
		
	}
}
