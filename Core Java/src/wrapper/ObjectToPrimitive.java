package wrapper;

public class ObjectToPrimitive {

	public static void main(String[] args) {
		
		Byte b1=5;
		Short s1=10;
		Integer i1=20;
		Long l1=100l;
		Float f1=10.5f;
		Double d1=20.5;
		Character ch1='a';
		Boolean bl1=false;
		
		byte b = b1.byteValue();
		short s = s1.shortValue();
		int i = i1.intValue();
		long l = l1.longValue();
		float f = f1.floatValue();
		double d = d1.doubleValue();
		char ch = ch1.charValue();
		Boolean bl = bl1.booleanValue();
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
