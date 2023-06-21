package collection;

import java.util.ArrayList;

public class ArrayListBubbleSort {

	public static void main(String[] args) {
	
	ArrayList<Integer> al1 = new ArrayList<>();
	al1.add(33);
	al1.add(23);
	al1.add(43);
	al1.add(53);
	al1.add(63);
	al1.add(73);
	
	System.out.println("Before sorting : "+al1);
	for (int i = 0; i < al1.size(); i++) {
		for (int j = i+1; j < al1.size(); j++) {
			
			if (al1.get(i)>al1.get(j)) {
				int temp = al1.get(i);
				al1.set(i, al1.get(j));
				al1.set(j,temp);
				
			}
		}
	}
	System.out.println("After sorting : "+al1);
	}
}
