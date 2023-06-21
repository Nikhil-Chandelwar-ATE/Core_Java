package arrays;

public class SameArrayDifferentMethod {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		System.out.println(a);
		demo(a);
	}
	public static void demo(int[] a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
