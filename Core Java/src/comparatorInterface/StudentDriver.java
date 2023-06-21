package comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(new Student(201,"Nikhil"));
		al1.add(new Student(101,"Abhay"));
		al1.add(new Student(401,"Ajay"));
		al1.add(new Student(301,"Himanshu"));
		
		System.out.println(al1);
		System.out.println("************************************");
		Collections.sort(al1,new CompareStudentId());
		System.out.println(al1);
		System.out.println("************************************");
		Collections.sort(al1, new CompareStudentName());
		System.out.println(al1);
	}
}
