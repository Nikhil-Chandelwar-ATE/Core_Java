package comparision;

import java.util.Comparator;

public class StudentId implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s1.s_id-s2.s_id;
	}

}
