package TreeSet;

import java.util.TreeSet;

public class PenDriver {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Pen("abc",25));
		set.add(new Pen("def",15));
		set.add(new Pen("ghi",25));
		set.add(new Pen("jkl",45));
		set.add(new Pen("mno",35));
		
		System.out.println(set);
	}
}
