package wrapper;

public class AutoUnboxing {

	public static void main(String[] args) {
		
		Byte b1=5;
		Short s1=10;
		Integer i1=20;
		Long l1=100l;
		Float f1=10.5f;
		Double d1=20.5;
		Character ch1='a';
		Boolean bl1=false;
		
		byte b=b1;
		short s=s1;
		int i=i1;
		long l=l1;
		float f=f1;
		double d=d1;
		char ch=ch1;
		boolean bl=bl1;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bl);
	
	}
}
