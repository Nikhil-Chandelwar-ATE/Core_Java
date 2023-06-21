package utility_Class;

public class Students {

	//To find total marks
	public static int totalMarks(Student s) {
		int sum = 0;
		for (int i = 0; i < s.getMarks().length; i++) {
			sum = sum + s.getMarks()[i];
		}
		return sum;
	}
	//To calculate average marks
	public static double averageMarks(Student s) {
		return ((double)totalMarks(s))/5;
	}
	//To find Maximum marks obtained
	public static int maxMark(Student s){  
		int temp;
		int[] marks = s.getMarks();
		for (int i = 0; i < marks.length; i++){  
			for (int j = i + 1; j < marks.length; j++) {  
				if (marks[i] > marks[j]){  
					
					temp = marks[i];  
					marks[i] = marks[j];  
					marks[j] = temp;  
				}  
	        }  	
		}  
		return marks[marks.length-1];  
	}
	//To find minimum marks obtained
	public static int minMark(Student s){  
		int temp;
		int[] marks = s.getMarks();
		for (int i = 0; i < marks.length; i++){  
			for (int j = i + 1; j < marks.length; j++) {  
				if (marks[i] < marks[j]){  
					
					temp = marks[i];  
					marks[i] = marks[j];  
					marks[j] = temp;  
				}  
	        }  	
		}  
		return marks[marks.length-1];  
	}
	}
