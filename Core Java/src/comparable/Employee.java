package comparable;

public class Employee implements Comparable {

	String e_name;
	Employee(String e_name)
	{
		this.e_name=e_name;
	}
	@Override
	public String toString() {
		return "{"+"name = "+e_name+"}";
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		return this.e_name.compareTo(e.e_name);
		
	}

}
