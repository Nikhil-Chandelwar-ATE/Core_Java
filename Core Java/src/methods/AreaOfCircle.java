package methods;

public class AreaOfCircle {

	public static void circleArea(double radius) {
		double pie = 3.14;
		System.out.println("Area of Circle = "+(pie*radius*radius));
	}
	public static void main(String[] args) {
		circleArea(3);
		circleArea(4.5);
		circleArea(-5);
		circleArea(17);
	}
}
