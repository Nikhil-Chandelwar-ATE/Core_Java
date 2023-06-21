package non_Static;

class Product {
	int id;
	String name;
	double price;
}

public class ProductTest {

	public static void main(String[] args) {
		
		//Creating object
		Product p1 = new Product();
		Product p2 = new Product();
		
		//Initialize data
		p1.id=123;
		p1.name="Iphone";
		p1.price=120000;
		
		p2.id=168;
		p2.name="Laptop";
		p2.price=45000;
		
		//Accessing data
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.price);
		
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.price);
	}
}
