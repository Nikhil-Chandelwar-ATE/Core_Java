package hashMap;

import java.util.HashMap;

public class BookPenDriver {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		Book b1 = new Book("Inida",160);
		map.put(b1,"Purchased");
		b1.name="Indian";
		map.put(b1,"Not Readed");
		Book b2=b1;
		b2.price=200;
		map.put(b2,"Readed");
		Book b3=new Book("India",160);
		map.put(b3,"Continue");
		
		Pen p1 = new Pen("Linc",10);
		map.put(p1,"Blue");
		Pen p2=p1;
		map.put(p2, "red");
		p2.price=20;
		map.put(p2, "black");
		Pen p3=new Pen("Link",10);
		map.put(p3,"orange");
		
		
		
		System.out.println(map.entrySet());
	}
}
