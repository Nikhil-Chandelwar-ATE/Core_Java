package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class BikeBrandCompare {
	public static void main(String[] args) {
		TreeSet<Bike> set = new TreeSet<Bike>(new Comparator<Bike>() {

			@Override
			public int compare(Bike o1, Bike o2) {

				return o2.name.compareTo(o1.name);
			}
		});
		set.add(new Bike("yamaha",50000));
		set.add(new Bike("Honda",60000));
		set.add(new Bike("Hero",70000));
		set.add(new Bike("Kawasaki",40000));
		set.add(new Bike("Kawasaki",40000));
		
		System.out.println(set);
	}


}
