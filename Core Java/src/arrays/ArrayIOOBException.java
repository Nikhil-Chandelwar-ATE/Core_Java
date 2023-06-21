package arrays;

public class ArrayIOOBException {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]=10;
		a[1]=30;
		a[2]=90;
		a[3]=90;
		a[4]=70;
		
		System.out.println(a[0]);
		System.out.println(a[4]);
		//System.out.println(a[a.length]);	//ArrayIndexOutOfBoundsException
		System.out.println(a[a.length-1]);
		//System.out.println(a[-1]);	//ArrayIndexOutOfBoundsException
		//System.out.println(a[6]);	//ArrayIndexOutOfBoundsException
	}
}
