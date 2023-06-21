package utility_Class;

public class Student {

	private String name;
	private int standard;
	private int[] marks;
	Student(){
		
	}
	Student(String name, int stadard, int[] marks){
		this.name=name;
		this.standard=stadard;
		this.marks=marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getStandard() {
		return standard;
	}
	public int[] getMarks() {
		return marks;
	}
}
