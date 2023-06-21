package comparable;

public class Animal implements Comparable{

	String breed;
	int age;
	Animal(String breed, int age)
	{
		this.breed=breed;
		this.age=age;
	}
	@Override
	public String toString() {
		
		return "{ Breed = "+breed+", age = "+age+" }";
	}
	@Override
	public int compareTo(Object o) {
		Animal a=(Animal)o;
		return this.breed.compareTo(a.breed);
	}
	

}
