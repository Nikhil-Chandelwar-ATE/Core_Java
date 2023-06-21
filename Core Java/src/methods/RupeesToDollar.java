package methods;

public class RupeesToDollar {

	public static void convert(int rupees) {
		double dollar = 81;
		System.out.println(rupees+" Rupees = "+(rupees/dollar)+" Dollar");
	}
	public static void main(String[] args) {
		convert(10);
		convert(81);
		convert(97);
	}
}
