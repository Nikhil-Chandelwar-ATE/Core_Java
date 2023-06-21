package TreeSet;

import java.util.TreeSet;

public class PersonDriver {

	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("nikhil",26,5.11));
		set.add(new Person("nayan",24,5.12));
		set.add(new Person("abhay",25,5.09));
		set.add(new Person("ajay",25,6.02));
		set.add(new Person("nikhil",26,6.10));
		
		for (Person person : set) {
			System.out.println(person);
		}
		
	}
}
