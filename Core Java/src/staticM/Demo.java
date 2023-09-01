package staticM;

public class Demo {
	
	static Demo a = new Demo();
	int b = 30;
	{
		System.out.println(b);
	}
	static
	{
		System.out.println(a);
		main(null);
	}
	public static void main(String[] args) {
		System.out.println(a);
	}
}