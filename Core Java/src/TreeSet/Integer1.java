package TreeSet;

public class Integer1 implements Comparable{

	int a;
	int b;
	int c;
	Integer1(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[a: "+a+", b: "+b+", c: "+c+"]";
	}
	@Override
	public int compareTo(Object o) {
		Integer1 i = (Integer1)o;
		int res=this.a-i.a;
		if(res==0)
		{
			res=this.b-i.b;
		}
		if(res==0)
		{
			res=this.c-i.c;
		}
			return res; 
	}
}
