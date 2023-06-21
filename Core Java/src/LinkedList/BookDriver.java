package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class BookDriver {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Book(200));
		list.add(new Book(100));
		list.add(new Book(350));
		list.add(new Book(150));
		list.add(new Book(400));
		
		System.out.println(list);
		System.out.println("************************************");
		Collections.sort(list);   //using compareTo() method
		System.out.println(list);
		
		System.out.println("************************************");
		Collections.sort(list,new BookCompare()); //Using compare()method
		System.out.println(list);
	}
}
