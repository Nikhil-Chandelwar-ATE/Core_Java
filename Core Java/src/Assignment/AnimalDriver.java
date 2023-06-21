package Assignment;

import java.util.LinkedList;
import java.util.Scanner;
public class AnimalDriver {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner s=new Scanner(System.in);
		int age;
		do {
			System.out.println("Enter Name and Age of Animal");
			String name=s.next();
			age=s.nextInt();
			if (age!=-1) {
				list.add(new Animal(name,age));
			}
		}while(age!=-1);
		System.out.println(list);
		Object a=null;
		int a1=0;
		for (Object o : list) {
			if (a1<((Animal)o).age) {
				a1=((Animal)o).age;
				a=o;
			}
		}
		System.out.println("Eldest animal : "+a);
	}
}
