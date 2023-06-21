package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorForEach {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(23);
		al1.add(33);
		al1.add(43);
		al1.add(53);
		al1.add(63);
		al1.add(73);
		
		Iterator itr = al1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
