package treeMap;

public class Employee {

	int id;
	String name;
	String designation;
	Employee(int id)
	{
		this.id=id;
	}
	@Override
	public String toString() {
		return "{ID: "+id+"}";
	}
}
