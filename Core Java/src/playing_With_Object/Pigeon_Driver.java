package playing_With_Object;

class Pigeon {
	String breed;
	int age;
	Pigeon(String breed, int age) {
		this.breed=breed;
		this.age=age;
	}
}
public class Pigeon_Driver {

	public static void displayyPigeon(Pigeon obj_ref) {
		System.out.println("Breed = "+obj_ref.breed);
		System.out.println("Age = "+obj_ref.age);
	}
	public static void main(String[] args) {
		
		Pigeon p1 = new Pigeon("Sparrow",3);
		displayyPigeon(p1);
		System.out.println("===================");
		Pigeon p2 = new Pigeon("Peacock", 10);
		displayyPigeon(p2);
		System.out.println("===================");
		displayyPigeon(new Pigeon("Parrot", 5));
	}
}
