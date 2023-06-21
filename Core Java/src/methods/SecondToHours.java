package methods;

public class SecondToHours {

	public static void convert(double second) {
		System.out.println(second+" Seconds = "+(second/3600)+" Hours");
	}
	public static void main(String[] args) {
		convert(60);
		convert(3600);
		convert(7275);
	}
}
