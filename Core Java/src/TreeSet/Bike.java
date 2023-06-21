package TreeSet;

final public class Bike {
	String name;
	int price;
	Bike(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	public String toString()
	{
		return "{Name = "+name+", Price = "+price+"}";
	}
}
