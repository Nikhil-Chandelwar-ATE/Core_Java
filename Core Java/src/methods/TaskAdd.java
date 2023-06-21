package methods;

public class TaskAdd {

	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		add(10,-10);
		add(-3,4);
		TaskAdd.add(25, 45);
	}
}
