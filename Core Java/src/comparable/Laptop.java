package comparable;

public class Laptop implements Comparable{

	String brand;
	int price;
	int ram;
	Laptop(String brand , int price , int ram)
	{
		this.brand=brand;
		this.price=price;
		this.ram=ram;
	}
	public String toString()
	{
		return "{" +  "brand = "+brand+", price = "+price+ ", ram = "+ram+"}";
	}
	public int compareTo(Object o)
	{
		Laptop l = (Laptop)o;
		if (this.ram>l.ram) {
			return 1;
		} else if (this.ram<l.ram){
			return -1;
		}
		else {
			return 0;
		}
	}
}
