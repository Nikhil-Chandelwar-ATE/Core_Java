package methods;

public class MethodCall2 {

	public static void main(String[] args) {
		System.out.println("main() start");
		demo();
		demo();
		System.out.println("main() end");
	}
	public static void demo() {
		System.out.println("From demo()");
	}
}
