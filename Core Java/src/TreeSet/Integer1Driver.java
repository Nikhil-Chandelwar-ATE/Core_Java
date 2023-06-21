package TreeSet;

import java.util.TreeSet;

public class Integer1Driver{
	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		
		tree.add(new Integer1(12,15,17));
		tree.add(new Integer1(11,5,31));
		tree.add(new Integer1(25,15,19));
		tree.add(new Integer1(12,15,21));
		tree.add(new Integer1(22,25,27));
		tree.add(new Integer1(16,10,37));
		
		for (Object object : tree) {
			System.out.println(object);
		}
	}
}
