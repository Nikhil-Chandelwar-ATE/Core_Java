package LinkedList;

import java.util.Comparator;

public class BookCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Book b1=(Book)o1;
		Book b2=(Book)o2;
		return b1.price-b2.price;
	}

}
