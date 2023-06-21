package operators;

public class TshirtLogicalOr {

	public static void main(String[] args) {
		String col1 = "red";
		String col2 = "black";
		
		String col = "red";
		
		String res = col1==col || col2 == col ? "can buy" : "can not buy";
		System.out.println("Smith "+res);
	}
}
