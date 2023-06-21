package operators;

public class TshirtLogical {

	public static void main(String[] args) {
		String name = "Smith";
		char size = 'L';
		int money = 1000;
		
		String tshirt = "Tshirt";
		char t_Size = 'L';
		int t_Price = 1000;
		
		String result = size==t_Size && money>=t_Price ? name+" can buy a "+tshirt : name+" can not buy a "+tshirt;
		System.out.println(result);
		
	}
}
