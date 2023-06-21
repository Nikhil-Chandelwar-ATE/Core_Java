package non_Static;

class Student{
	int id;
	String name;
	int age;
	Student(){
		
	}
	Student(int id){
		this.id=id;
	}
	Student(int id, String name){
		this(id);
		this.name=name;
	}
	Student(int id, String name, int age){
		this(id, name);
		this.age=age;
	}
}
public class Student_Driver {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		System.out.println("=============");
		Student s2 = new Student(101);
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.age);
		
		System.out.println("=============");
		Student s3 = new Student(201, "Nikhil");
		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s3.age);
		
		System.out.println("=============");
		Student s4 = new Student(301, "Chetan", 24);
		System.out.println(s4.id);
		System.out.println(s4.name);
		System.out.println(s4.age);
	}
}
