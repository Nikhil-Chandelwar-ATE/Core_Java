package Assignment;
abstract class Driver1
{
	abstract public void test();
}
public class DriverAbstract extends Driver1 {

	public static void main(String[] args) {
		DriverAbstract d1 = new DriverAbstract();
		d1.test();
	}

	@Override
	public void test() {
		System.out.println("Hello");
		
	}
}
