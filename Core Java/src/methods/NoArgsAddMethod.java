package methods;

public class NoArgsAddMethod {

	public static void main(String[] args) {
		add();
		NoArgsAddMethod.add();
	}
	public static void add() {
		int a,b;
		a=10;
		b=20;
		System.out.println("c = "+(a+b));
	}
}
