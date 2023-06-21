package TreeSet;

public class Pen implements Comparable{

	String brand;
	int price;
	Pen(String brand, int price)
	{
		this.brand=brand;
		this.price=price;
	}
	public String toString()
	{
		return "{Brand = "+brand+", Price = "+price+"}";
	}
	public int compareTo(Object o)
	{
		Pen p = (Pen)o;
		return this.price-p.price;
	}
}
