package non_Static;

class Marker {
	Marker(){
		System.out.println("Marker Constructor");
		System.out.println("Hello.....!!!!");
	}
}
public class MarkerConstructor {

	public static void main(String[] args) {
		Marker m1 = new Marker();
		Marker m2 = new Marker();
	}
}
