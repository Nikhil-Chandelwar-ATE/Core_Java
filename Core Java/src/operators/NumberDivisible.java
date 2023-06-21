package operators;

public class NumberDivisible {

	public static void main(String[] args) {
		int num = 16;
		String res = num%3==0 && num%5==0 ? num+" is divisible by 3 & 5" : num+" is not divisible by 3 & 5";
		System.out.println(res+" both.");
	}
}
