package Assignment;

import java.util.Comparator;

public class CompareRam implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Mobile m1=(Mobile)o1;
		Mobile m2=(Mobile)o2;
		
		return m1.ram-m2.ram;
	}

}
