package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetPrime {

	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<Integer>();
		System.out.println("Enter the range :");
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int i;
		for (i = start; i<=end; i++) {
			int count=0;
			for (int j = 2; j < i; j++) {
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				hash.add(i);
			}
		}
		System.out.println(hash);
		int sum=0;
		for (Integer integer : hash) {
			sum=sum+integer;
		}
		System.out.println(sum);
	}
}
