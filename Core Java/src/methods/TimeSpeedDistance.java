package methods;

public class TimeSpeedDistance {

	public static void timeFormula(double speed, double distance) {
		double time = distance/speed;
		System.out.println("Time taken to travel = "+time+" Hour");
	}
	public static void main(String[] args) {
		timeFormula(60, 100);
		timeFormula(97.5, 1150);
		timeFormula(45, 785.67);
	}
}
