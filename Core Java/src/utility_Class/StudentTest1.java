package utility_Class;

public class StudentTest1 {

	public static void main(String[] args) {
		int[] marks = {90,85,75,80,87};
		Student s1 = new Student("Sheela", 5, marks);
		System.out.println("Total Marks : "+Students.totalMarks(s1));
		System.out.println("Average Marks : "+Students.averageMarks(s1));
		System.out.println("Maximum Marks : "+Students.maxMark(s1));
		System.out.println("Minimum Marks : "+Students.minMark(s1));
	}
}
