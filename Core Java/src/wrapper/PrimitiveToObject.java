package wrapper;

public class PrimitiveToObject {

	public static void main(String[] args) {
		
		byte b=5;
		short s=10;
		int i=20;
		long l=200l;
		float f=10.5f;
		double d=20.5;
		char ch='a';
		boolean bl=true;
		
		Byte b1 = Byte.valueOf(b);
		Short s1 = Short.valueOf(s);
		Integer i1 = Integer.valueOf(i);
		Long l1 = Long.valueOf(l);
		Float f1 = Float.valueOf(f);
		Double d1 = Double.valueOf(d);
		Character ch1 = Character.valueOf(ch);
		Boolean bl1 = Boolean.valueOf(bl);
		
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
