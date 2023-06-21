package comparatorInterface;

import java.util.Comparator;

public class Bike implements Comparator{

	int price;
	Bike()
	{
		super();
	}
	Bike(int price)
	{
		this.price=price;
	}
	public String toString()
	{
		return "[Bike Price: "+price+"]";
	}
	@Override
	public int compare(Object o1, Object o2) {
		Bike b1=(Bike)o1;
		Bike b2=(Bike)o2;
		return b1.price-b2.price;
	}
}
