package playing_With_Object;

class Employee {
	String name;
	int id;
	long phone;
	public Employee(String name, int id, long phone) {
		this.name=name;
		this.id=id;
		this.phone=phone;
	}
}
public class EmployeeDriver {
	public static void main(String[] args) {

		Employee e1 = new Employee("Nikhil", 101, 9876543210l);
		Employee e2=e1;
		Employee e3=e1;
		Employee e4=e1;
		Employee e5=e1;
		System.out.println(e3.name);
		System.out.println(e3.id);
		System.out.println(e3.phone);
		e4.name="ajay";
		e4.id=201;
		e4.phone=9087098456l;
		System.out.println("=================");
		System.out.println(e5.name);
		System.out.println(e5.id);
		System.out.println(e5.phone);
		System.out.println("=================");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println("=================");
		System.out.println(e1==e2);
		System.out.println(e1==e3);
		System.out.println(e1==e4);
		System.out.println(e1==e5);
	}
}
