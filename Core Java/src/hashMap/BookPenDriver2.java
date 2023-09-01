package hashMap;

import java.util.HashMap;

public class BookPenDriver2 {

	public static void main(String[] args) {
		HashMap<Object, Integer> map = new HashMap<Object, Integer>();
		
		Pen p = new Pen("red",23);
		Pen p1=p;
		p1.price=500;
		Pen p2=new Pen("red",23);
		
		Book b = new Book("Modern India",450);
		Book b2=b;
		b2.price=550;
		Book b3=new Book("Modern India",450);
		
		map.put(p,1);
		map.put(p1,2);
		map.put(p2,3);
		map.put(b,4);
		map.put(b2,5);
		map.put(b3,6);
		
		System.out.println(map);
	}
}
