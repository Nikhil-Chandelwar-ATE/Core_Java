package methods;

public class ParameterizedAdd {

	public static void main(String[] args) {
		add(10,20);
		add('a','b');
		//add(12,10.0);
		//add();
		//add(10);
		// add(10,20,30);
	}
	public static void add(int a, int b) {
		System.out.println("sum = "+(a+b));
	}
}
