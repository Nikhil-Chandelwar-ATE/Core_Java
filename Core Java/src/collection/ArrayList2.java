package collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
	ArrayList al1 = new ArrayList();
	al1.add("Mango");
	al1.add("Orange");
	al1.add("Banana");
	
	ArrayList al2 = new ArrayList();
	al2.add("Guava");
	al2.add("Strawberry");
	
	//al2.add(al1);
	//System.out.println(al2);
	
	al2.addAll(al1);
	System.out.println(al2);
	
	}
}
