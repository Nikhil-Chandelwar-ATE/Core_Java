package methods;

public class ReturnDistance {

	public static int getDistance(int time, int speed) {
		return time*speed;
	}
	public static void main(String[] args) {
		int distance = getDistance(7, 75);
		System.out.println(distance+" KM");
		System.out.println(getDistance(9,45)+" KM");
		System.out.println(getDistance(22,90)+" KM");
	}
}
