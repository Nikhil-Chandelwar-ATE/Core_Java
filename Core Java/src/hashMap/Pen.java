package hashMap;

public class Pen {

	String brand;
	int price;
	Pen(String brand, int price)
	{
		this.brand=brand;
		this.price=price;
	}
	public String toString()
	{
		return "{Pen Brand: "+brand+", Price: "+price+"}";
	}
}
