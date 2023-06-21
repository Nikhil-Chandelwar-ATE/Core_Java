package comparatorInterface;

final public class Student {

	int id;
	String name;
	Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
	
		return "{ Student ID = "+id+", Name = "+name+" }";
	}
}
