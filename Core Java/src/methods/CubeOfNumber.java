package methods;

public class CubeOfNumber {

	public static void cube(int num) {
		System.out.println("Cube of "+num+" = "+(num*num*num));
	}
	public static void main(String[] args) {
		cube(7);
		cube(-9);
		cube(31);
	}
}