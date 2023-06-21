package non_Static_Method;

public class Box {
	
	double length;
	double breadth;
	
	Box(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea()
	{
		return length * breadth;
	}
	public static void main(String[] args) {
		Box b1 = new Box(3, 6);
		Box b2 = new Box(4, 8);
		
		System.out.println(b1.getArea());
		System.out.println(b2.getArea());
	}
}