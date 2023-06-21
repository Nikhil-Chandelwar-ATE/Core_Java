package arrays;

public class Method_Accept_Array {

	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		integerArray(a);
		char[] ch = {'a', 'b', 'c', 'd'};
		characterArray(ch);
	}
	public static void integerArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
		public static void characterArray(char[] a) {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
	}
}
