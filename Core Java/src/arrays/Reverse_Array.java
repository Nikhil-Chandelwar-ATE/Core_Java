package arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		reverse(a);
	}
	public static void reverse(int[] a)
	{
		for (int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}
