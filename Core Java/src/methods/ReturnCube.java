package methods;

public class ReturnCube {

	public static int getCube(int num) {
		return num*num*num;
	}
	public static void main(String[] args) {
		int res = getCube(3);
		System.out.println(res);
		System.out.println(getCube(9));
		int result = getCube(5)+10;
		System.out.println(result);
	}
}
