package comparable;

public class Rectangle implements Comparable{

	double length;
	double breadth;
	double area;
	public Rectangle(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
		this.area=this.length*this.breadth;
	}
	@Override
	public String toString() {
		
		return "{ Length ="+length+", Breadth ="+breadth+", Area ="+area+" }";
	}
	@Override
	public int compareTo(Object o) {
		Rectangle rect =(Rectangle)o;
		return (int) (this.area-rect.area);
	}
	
}

