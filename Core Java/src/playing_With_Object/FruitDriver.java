package playing_With_Object;

class Fruit {
	String name;
	Fruit(String name){
		this.name=name;
	}
}
public class FruitDriver {

	public static void main(String[] args) {
		Fruit f1 = new Fruit("Mango");
		System.out.println(f1);
		System.out.println(f1.name);
		System.out.println("=========================");
		Fruit f2 = f1;
		System.out.println(f2);
		System.out.println(f2.name);
		System.out.println("=========================");
		Fruit f3 = f1;
		System.out.println(f3);
		System.out.println(f3.name);
		System.out.println("=========================");
		System.out.println(f1==f2);
		System.out.println(f1==f3);

	}

}
