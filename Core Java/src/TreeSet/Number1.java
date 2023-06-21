package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Number1 implements Comparator{

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1%10-o2%10;
			}
		});
		set.add(12);
		set.add(51);
		set.add(17);
		set.add(27);
		set.add(23);
		set.add(35);
		
		System.out.println(set);
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
