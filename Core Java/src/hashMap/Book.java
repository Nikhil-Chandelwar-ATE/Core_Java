package hashMap;

public class Book {

	String name;
	int price;
	Book(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	public String toString()
	{
		return "{Book Name: "+name+", Price: "+price+"}";
	}
	public boolean equals(Object o)
	{
		Book b = (Book)o;
		return this.name.equals(b.name) && this.price==b.price;
	}
	public int hashCode()
	{
		return this.name.hashCode()+this.price;
	}
	
}
