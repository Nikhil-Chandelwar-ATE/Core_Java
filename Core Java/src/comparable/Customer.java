package comparable;

public class Customer implements Comparable{

	String name;
	double balance;
	Customer(String name, double balance)
	{
		this.name=name;
		this.balance=balance;
	}
	@Override
	public String toString() {
		return "{ name = "+name+", balance = "+balance+" }";
	}
	@Override
	public int compareTo(Object o) {
		Customer c = (Customer)o;
		return (int) (this.balance-c.balance);
	}
	
}
