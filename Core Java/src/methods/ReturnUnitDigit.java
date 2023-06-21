package methods;

public class ReturnUnitDigit {

	public static int getUnitDigit(int num) {
		return num%10;
	}
	public static void main(String[] args) {
		int unit = getUnitDigit(81);
		System.out.println(unit);
		System.out.println(getUnitDigit(97));
		System.out.println(getUnitDigit(1675));
	}
}
