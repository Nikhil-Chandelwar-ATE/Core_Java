package non_Static;

class Book{
	String title;
	double price;
}
public class BookDriver1 {

	public static void main(String[] args) {
		//Object creation
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		//Initialize data to object
		b1.title="Harry Potter";
		b1.price=1200;
		
		b2.title="Titanic";
		b2.price=900;
		
		b3.title="Java";
		b3.price=800;
		//Accessing data from the object
		
		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println(b2.title);
		System.out.println(b2.price);
		System.out.println(b3.title);
		System.out.println(b3.price);
	}
}
