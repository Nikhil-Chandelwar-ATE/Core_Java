package comparatorInterface;

import java.util.Comparator;

public class CompareBrand implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Pen p1=(Pen)o1;
		Pen p2=(Pen)o2;
		return p1.brand.compareTo(p2.brand);
	}
	

}
