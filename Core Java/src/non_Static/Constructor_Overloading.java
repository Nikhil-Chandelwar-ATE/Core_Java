package non_Static;

class Pen{
	String brand;
	int price;
	Pen(){
		System.out.println("Pen() constructor");
	}
	Pen(String brand, int price){
		this.brand=brand;
		this.price=price;
	}
}
public class Constructor_Overloading {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		System.out.println(p1.brand);
		System.out.println(p1.price);
		
		Pen p2 = new Pen("Link", 10);
		System.out.println(p2.brand);
		System.out.println(p2.price);
	}
}
