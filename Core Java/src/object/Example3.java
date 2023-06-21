package object;

class Books{
	
}
public class Example3 {

	public static void main(String[] args) {
		Books b1 = new Books();
		Books b2 = new Books();
		Books b3 = new Books();
		System.out.println(b1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(b1==b3);
		System.out.println(b2==b3);
		System.out.println(b2==b3);
	}
}
