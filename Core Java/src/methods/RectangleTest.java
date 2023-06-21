package methods;

public class RectangleTest {

	public static void main(String[] args) {
		//area and perimeter of rectangle for TC1
		Rectangle r1 = new Rectangle();
		double area = r1.area(4,6);
		System.out.println(area);
		double perimeter = Rectangle.perimeter(4,6);
		System.out.println(perimeter);
		
		//area and perimeter of rectangle for TC2
		System.out.println(r1.area(3.6,7.8));
		System.out.println(Rectangle.perimeter(3.6,7.8));
		
		System.out.println(r1.perimeter(5,3));
	}
}
