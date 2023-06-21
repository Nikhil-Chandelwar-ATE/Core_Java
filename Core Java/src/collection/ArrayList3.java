package collection;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		
		al1.add("Rose");
		al1.add("Lilly");
		al1.add("Sunflower");
		al1.add("Daisy");
		
		ArrayList al2 = new ArrayList();
		
		al2.add("Jasmine");
		al2.add("Lavender");
		
		al1.addAll(1, al2);
		//al1.add(1, al2);
		System.out.println(al1);
		System.out.println(al2);
	}
}
