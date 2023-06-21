package non_Static;

class Demo{
	Demo(){
		this(10);
		System.out.println("Demo Constructor");
		
	}
	Demo(int i){
		System.out.println("Demo(int) Constructor");
		System.out.println(this);
	}
}
public class This_Constructor_Chaining {

	public static void main(String[] args) {
		Demo d1 = new Demo();
	}
}
