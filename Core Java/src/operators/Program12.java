package operators;

public class Program12 {

	public static void main(String[] args) {
		int res = 10>20?10:20;
		System.out.println(res);
		System.out.println("==========================");
		int a = 10, b= 20;
		int res2 = a != b ? a+b : a-b;
		System.out.println(res2);
	}
}
