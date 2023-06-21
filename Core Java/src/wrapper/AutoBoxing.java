package wrapper;

public class AutoBoxing {

	public static void main(String[] args) {
		byte b=5;
		short s=10;
		int i=20;
		long l=100l;
		float f=10.5f;
		double d=20.5;
		char ch='a';
		boolean bl=true;
		
		Byte b1=b;
		Short s1=s;
		Integer i1=i;
		Long l1=l;
		Float f1=f;
		Double d1=d;
		Character ch1=ch;
		Boolean bl1=bl;
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(ch1);
		System.out.println(bl1);
		
	}
}
