package operators;

public class Program4 {

	public static void main(String[] args) {
		int prod1=1250;
		int prod2=1450;
		int cost=prod1+prod2;
		int gst=12;
		System.out.println("Total Bill : "+(cost*(100+gst)/100));
	}
}
