package comparable;

public class Book implements Comparable{

	String name;
	String author;
	Book(String name, String author)
	{
		this.name=name;
		this.author=author;
	}
	@Override
	public String toString() {
	
		return "{ Book Name : "+name+", Author : "+author+" }";
	}
	@Override
	public int compareTo(Object o) {
		Book b = (Book)o;
		return this.author.compareTo(b.author);
	}

}
