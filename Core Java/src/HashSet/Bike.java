package HashSet;

public class Bike implements Comparable{

	String name;
	int cc;
	String colour;
	double price;
	public Bike(String name,int cc,String colour,double price) {
		this.name=name;
		this.cc=cc;
		this.colour=colour;
		this.price=price;
	}
	public String toString()
	{
		return "[Name="+name+", CC="+cc+", Colour="+colour+", Price="+price+"]";
	}
	public int compareTo(Object o)
	{
		Bike b = (Bike)o;
		if(this.cc>b.cc)
			return +1;
		else if(this.cc<b.cc)
			return -1;
		else
			return 0;
	}
}
