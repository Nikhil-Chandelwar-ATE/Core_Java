package collection;

import java.util.ArrayList;

public class UnionOfTwoList {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		
		al1.add(23);
		al1.add(33);
		al1.add(43);
		al1.add(53);
		al1.add(63);
		al1.add(73);
		
		ArrayList al2=new ArrayList();
		
		al2.add(13);
		al2.add(33);
		al2.add(43);
		al2.add(53);
		al2.add(79);
		al2.add(89);
		
		System.out.println("List 1 = "+al1);
		System.out.println("List 2 = "+al2);
		al1.retainAll(al2);
		System.out.println("Unioun of 2 list = "+al1);
		
	}
}
