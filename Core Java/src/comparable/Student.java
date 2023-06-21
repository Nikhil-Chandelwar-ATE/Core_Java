package comparable;

public class Student implements Comparable {

	String name;
	int age;
	Student(String name , int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "{" + "name = "+name+", id = "+age + "}";
	}
	public int compareTo(Object o)
	{
		Student s = (Student)o;
		return this.age-s.age;
	}
}
