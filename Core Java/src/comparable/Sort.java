package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(new Student("Nikhil",25));
		al1.add(new Student("Vijay",24));
		al1.add(new Student("Shriram",26));
		
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		System.out.println("*******************************");
		
		ArrayList al2 = new ArrayList();
		al2.add(new Laptop("hp",25000,256));
		al2.add(new Laptop("Sony",24000,1024));
		al2.add(new Laptop("Lenovo",26000,512));
		
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println(al2);
		System.out.println("*******************************");
		
		ArrayList al3 = new ArrayList();
		al3.add(new Pen("red",10));
		al3.add(new Pen("yellow",5));
		al3.add(new Pen("blue",50));

		System.out.println(al3);
		Collections.sort(al3);
		System.out.println(al3);
		System.out.println("******************************");
		
		ArrayList al4 = new ArrayList();
		al4.add(new Employee("Nikhil"));
		al4.add(new Employee("Vijay"));
		al4.add(new Employee("Abhay"));
		
		System.out.println(al4);
		Collections.sort(al4);
		System.out.println(al4);
		System.out.println("******************************");
		
		ArrayList al5 = new ArrayList();
		al5.add(new Shoes(7,"Puma"));
		al5.add(new Shoes(9,"Nike"));
		al5.add(new Shoes(8,"Adidas"));
		
		System.out.println(al5);
		Collections.sort(al5);
		System.out.println(al5);
		System.out.println("******************************");
		
		ArrayList al6=new ArrayList();
		al6.add(new Circle(7,14));
		al6.add(new Circle(6,12));
		al6.add(new Circle(9,18));
		
		System.out.println(al6);
		Collections.sort(al6);
		System.out.println(al6);
		System.out.println("******************************");
		
		ArrayList al7 = new ArrayList();
		al7.add(new Rectangle(10,12));
		al7.add(new Rectangle(9,11));
		al7.add(new Rectangle(8,13));
		
		System.out.println(al7);
		Collections.sort(al7);
		System.out.println(al7);
		System.out.println("******************************");
		
		ArrayList al8=new ArrayList();
		al8.add(new Animal("dog",12));
		al8.add(new Animal("cat",7));
		al8.add(new Animal("elephant",30));
		
		System.out.println(al8);
		Collections.sort(al8);
		System.out.println(al8);
		System.out.println("******************************");
		
		ArrayList al9=new ArrayList();
		al9.add(new Customer("Akshay",2500.76));
		al9.add(new Customer("Nanda",2300.54));
		al9.add(new Customer("Zaverin",2650.87));
		
		System.out.println(al9);
		Collections.sort(al9);
		System.out.println(al9);
		System.out.println("******************************");
		
		ArrayList al10=new ArrayList();
		al10.add(new Book("My experiments with Truth","M.K. Gandhi"));
		al10.add(new Book("The Discovery of India","Jawahar Lal Nehru"));
		al10.add(new Book("The Constitution of India","Dr. B.R. Ambedkar"));
		
		System.out.println(al10);
		Collections.sort(al10);
		System.out.println(al10);
		System.out.println("******************************");
		
	}
}
