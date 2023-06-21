package TreeSet;

public class Animal implements Comparable{

	String name;
	Animal(String name)
	{
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Name: "+name+" ]";
	}
	@Override
	public int compareTo(Object o) {
		Animal a = (Animal)o;
		return this.name.compareTo(a.name);
	}

}
