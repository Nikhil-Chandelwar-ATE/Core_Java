package HashSet;

public class Animal {

	String name;
	int age;
	Animal(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Name = "+name+", Age = "+age+"]";
	}
	public int hashCode()
	{
		return age+name.hashCode();
	}
	public boolean equals(Object o)
	{
		Animal a=(Animal)o;
		return this.age==a.age && this.name.equals(a.name);
	}
}
