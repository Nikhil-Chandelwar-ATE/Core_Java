package comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class BikeDriver {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Bike(25000));
		al.add(new Bike(15000));
		al.add(new Bike(55000));
		al.add(new Bike(23000));
		
		Collections.sort(al,new Bike());
		System.out.println(al);
	}
		
	
}
