package comparatorInterface;

final public class Pen {

	String brand;
	double price;
	Pen(String brand,double price)
	{
		this.price=price;
		this.brand=brand;
	}
	@Override
	public String toString() {
		return "(Brand : "+brand+", Price : "+price+")";
	}
}
