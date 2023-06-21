package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListAccess {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add('a');
		al1.add('b');
		al1.add('c');
		al1.add('x');
		al1.add('y');
		al1.add('z');
		
		System.out.println(al1.get(2));   //way1
		
		for (int i=0;i<=al1.size()-1;i++) {   //Way2
			System.out.print(al1.get(i));
		}
		System.out.println();
		
		for (Object obj1 : al1) {     //Way3
			System.out.print(obj1);
		}
		System.out.println();
		
		Iterator itr = al1.iterator();    //Way4
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		
					//or
		
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println();
		
		ListIterator lst = al1.listIterator();    //Way5

		System.out.println(lst.hasPrevious());
		System.out.println(lst.hasNext());
		System.out.println(lst.next());
		System.out.println(lst.previous());
		
		
		
		
}
}