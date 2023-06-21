package Assignment;

public class Animal {
	String name;
	int age;
	Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ Name = "+name+", Age = "+age+" }";
	}

}