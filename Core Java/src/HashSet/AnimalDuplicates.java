package HashSet;

import java.util.HashSet;

public class AnimalDuplicates {

	public static void main(String[] args) {
		HashSet<Animal> hash =new HashSet<Animal>();
		hash.add(new Animal("tiger",25));
		hash.add(new Animal("lion",35));
		hash.add(new Animal("tiger",25));
		hash.add(new Animal("elephant",25));
		hash.add(new Animal("mouse",5));
		hash.add(new Animal("elephant",25));
		
		for (Object object : hash) {
			System.out.println(object);
		}
	}
}
