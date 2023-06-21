package TreeSet;

import java.util.Comparator;

public class BikePriceCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Bike b1 = (Bike)o1;
		Bike b2 = (Bike)o2;
		return b1.price-b2.price;
	}
}
