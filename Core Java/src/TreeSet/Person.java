package TreeSet;

public class Person implements Comparable<Person>{

	String name;
	int age;
	double height;
	Person(String name, int age, double height)
	{
		this.name=name;
		this.age=age;
		this.height=height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Name: "+name+", Age: "+age+", Height: "+height+"]";
	}
	@Override
	public int compareTo(Person o) {
		int res=this.name.compareTo(o.name);
		if (res==0) {
			res=this.age-o.age;
		} if (res==0) {
			res=(int)(this.height-o.height);
		}
		return res;
	}
}
