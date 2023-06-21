package object;

class Book1{
	
}
public class Example4 {

	public static void main(String[] args) {
		Book1 b1 = new Book1();
		Book1 b2 = b1;
		Book1 b3 = b2;
		System.out.println(b1==b2);
		System.out.println(b2==b3);
		System.out.println(b1==b3);
		
	}
}
