package comparision;

final public class Student {
	String s_name;
	int s_id;
	int s_class;
	char s_section;
	double s_percentage;
	Student(String s_name, int s_id, int s_class, char s_section, double s_percentage)
	{
		this.s_name=s_name;
		this.s_id=s_id;
		this.s_class=s_class;
		this.s_section=s_section;
		this.s_percentage=s_percentage;
	}
	public String toString()
	{
		return "[Student Name: "+s_name+", ID: "+s_id+", Class: "+s_class+", Section: "+s_section+", %: "+s_percentage+"]";
	}
}
