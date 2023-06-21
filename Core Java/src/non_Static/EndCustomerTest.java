package non_Static;

class EndCustomer {
	int id;
	String name;
	int password;
}

public class EndCustomerTest {

	public static void main(String[] args) {
		
		//Object creation
		EndCustomer ec1 = new EndCustomer();
		EndCustomer ec2 = new EndCustomer();
		
		//Assigning data
		ec1.id=101;
		ec1.name="Sheela";
		ec1.password=123;
		
		ec2.id=201;
		ec2.name="Ram";
		ec2.password=789;
		
		//Accessing data
		System.out.println(ec1.id);
		System.out.println(ec1.name);
		System.out.println("=================");
		System.out.println(ec2.id);
		System.out.println(ec2.name);
	}
}
