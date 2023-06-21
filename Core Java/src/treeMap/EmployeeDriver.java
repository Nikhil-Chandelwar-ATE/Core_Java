package treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class EmployeeDriver{
	public static void main(String[] args) {
		TreeMap<Object,Object> tree = new TreeMap<>(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Employee e1=(Employee)o1;
				Employee e2=(Employee)o2;
				return e1.id-e2.id;
			}
		});
		tree.put(new Employee(101),"SOftware test engineer");
		tree.put(new Employee(105),"Software Developer");
		tree.put(new Employee(102),"SOftware Trainer");
		tree.put(new Employee(107),"Manager");
		tree.put(new Employee(103),"Branch Head");
		
		System.out.println(tree);
	}
}
