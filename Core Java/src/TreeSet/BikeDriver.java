package TreeSet;

import java.util.TreeSet;

public class BikeDriver {

	public static void main(String[] args) {
		TreeSet<Bike> set = new TreeSet(new BikePriceCompare());
		set.add(new Bike("yamaha",50000));
		set.add(new Bike("Honda",60000));
		set.add(new Bike("Hero",70000));
		set.add(new Bike("Kawasaki",40000));
		
		System.out.println(set);
	}
}
