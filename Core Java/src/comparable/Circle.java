package comparable;

public class Circle implements Comparable{

	double radius;
	double diameter;
	double circumference;
	public Circle(double radius, double diameter) {
		
		this.diameter=diameter;
		this.radius=radius;
		this.circumference = 2*3.14*this.radius;
	}
	@Override
	public String toString() {
	
		return "{ "+"Radius ="+radius+", Diameter ="+diameter+", circumference ="+circumference+" }";
	}
	@Override
	public int compareTo(Object o) {
		Circle c=(Circle)o;
		return (int) (this.radius-c.radius);
	}
	
	
	
}
