package playing_With_Object;

class Box {
	
}

class Bottle {
	
}

public class Box_Bottle_Example {

	public static void displayReference(Box obj_ref) {
		System.out.println(obj_ref);
	}
	public static void displayReference(Bottle obj_ref) {
		System.out.println(obj_ref);
	}
	public static void main(String[] args) {
		Box b1 = new Box();
		displayReference(b1);
		System.out.println("==================");
		Box b2 = new Box();
		displayReference(b2);
		System.out.println("==================");
		displayReference(new Box());
		System.out.println("==================");
		Bottle bt1 = new Bottle();
		displayReference(bt1);
	}
}
