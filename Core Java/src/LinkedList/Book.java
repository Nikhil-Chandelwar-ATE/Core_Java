package LinkedList;

public class Book implements Comparable{

	int price;
	Book(int price)
	{
		this.price=price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Price = "+price+"]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Book b = (Book)o;
		return this.price-b.price;
	}

	
}
