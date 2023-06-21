package comparable;

public class Pen implements Comparable{

	String colour;
	int price;
	Pen(String colour, int price)
	{
		this.colour=colour;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "{"+"colour = "+colour+", price = "+price+"}";
	}
	@Override
	public int compareTo(Object o) {

		Pen p = (Pen)o;
		if (this.price>p.price) {
			return 1;
			
		} else if (this.price<p.price){
			return -1;

		}else {
			return 0;
		}
	}
}
