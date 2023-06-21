package methods;

public class MeterToKM {

	public static void convert(double meter) {
		System.out.println(meter+" Meters = "+(meter/1000)+" Kilometer");
	}
	public static void main(String[] args) {
		convert(100);
		convert(27500);
		convert(1);
	}
}
