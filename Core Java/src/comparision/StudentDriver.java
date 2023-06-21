package comparision;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;
public class StudentDriver {

	public static void main(String[] args) {
		Comparator compare = null;
		TreeSet<Student> tree = new TreeSet<Student>(compare);
		Scanner s = new Scanner(System.in);
		System.out.println("How many Student details you want to enter: ");
		for(int i = s.nextInt();i>0;i--)
		{
			System.out.println("Enter Student Name, Id, Class, Section and Percentage for "+i+ " student");
			String name=s.next();
			int id=s.nextInt();
			int sclass=s.nextInt();
			char section=s.next().charAt(0);
			double percentage=s.nextDouble();
			tree.add(new Student(name,id,sclass,section,percentage));
		}
		System.out.println("Enter 1: to compare by Name");
		System.out.println("Enter 2: to compare by ID");
		System.out.println("Enter 3: to compare by Class");
		int num=s.nextInt();
		switch (num)
		{
		case 1:
		{
			compare = new StudentName();
			break;
		}
		case 2:
		{
			compare = new StudentId();
			break;
		}
		case 3:
		{
			compare = new StudentClass();
			break;
		}
		default:
		{
			System.out.println("Enter valid number.");
		}
		}
		System.out.println(tree);
	}
}
