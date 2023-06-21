package operators;

public class IntegerNumber {

	public static void main(String[] args) {
		int num = 30;
		String res = num%5==0 && !(num%2==0 && num%3==0) ? num+" is divisible by 5 and not by 2 & 3 both." : num+" is not divisible";
		System.out.println(res);
	}

}
