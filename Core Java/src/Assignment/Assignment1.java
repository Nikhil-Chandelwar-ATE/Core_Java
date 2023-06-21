package Assignment;

import java.util.LinkedList;
import java.util.Scanner;

import java.util.ListIterator;

public class Assignment1 {
	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	System.out.println("Enter the starting number");
	int start=s.nextInt();
	System.out.println("Enter the ending number");
	int end=s.nextInt();
	LinkedList<Integer> list = new LinkedList<Integer>();
	for (int i = start+1; i < end; i++) {
		list.add(i);
	}
	System.out.println(list);
	ListIterator<Integer> lst =list.listIterator(0);
	int sum=0;
	while(lst.hasNext())
	{
		Integer a=lst.next();
		int n=a;
		if(n%2==1)
		{
			lst.remove();
		}
		else
			sum=sum+n;
	}
	System.out.println(list);
	System.out.println(sum/list.size());
}
}
