package methods;

public class MethodCall3 {

	public static void main(String[] args) {
		System.out.println("main start");
		demo();
		System.out.println("main end");
	}
	public static void demo() {
		System.out.println("demo start");
		test();
		System.out.println("demo end");
	}
	public static void test() {
		System.out.println("From test method");
	}
}
