package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetLargestValue {

	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<Integer>();
		
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers you want to enter");
		for(int i=s.nextInt();i>0;i--)
		{
			int num=s.nextInt();
			hash.add(num);
		}
		System.out.println(hash);
		Integer a=0;
		for (Integer integer : hash) {
			if (integer>a) {
				a=integer;
			}
		}
		System.out.println(a);
		
	}
}
