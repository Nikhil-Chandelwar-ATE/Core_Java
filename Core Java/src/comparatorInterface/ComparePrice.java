package comparatorInterface;

import java.util.Comparator;

public class ComparePrice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Pen p1=(Pen)o1;
		Pen p2=(Pen)o2;
		return (int) (p1.price-p2.price);
	}

	
}
