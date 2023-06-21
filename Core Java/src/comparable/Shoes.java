package comparable;

public class Shoes implements Comparable{

	int size;
	String brand;
	Shoes(int size,String brand)
	{
		this.size=size;
		this.brand=brand;
	}
	@Override
	public String toString() {
	
		return "{ Size = "+size+", Brand = "+brand+" }";
	}
	@Override
	public int compareTo(Object o) {
		
		Shoes s=(Shoes)o;
		return s.size-this.size;
	}
}
