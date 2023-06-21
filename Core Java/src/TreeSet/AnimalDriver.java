package TreeSet;

import java.util.TreeSet;

public class AnimalDriver {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Animal("Lion"));
		set.add(new Animal("Lion"));
		set.add(new Animal("Tiger"));
		set.add(new Animal("Elephant"));
		set.add(new Animal("Cheetah"));
		
		System.out.println(set);
	}
	
}
