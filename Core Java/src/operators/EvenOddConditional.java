package operators;

public class EvenOddConditional {

	public static void main(String[] args) {
		int a = 12;
		String message = a%2==0 ? a+" is an Even number" : a+" is an Odd number";
		System.out.println(message);
	}
}
