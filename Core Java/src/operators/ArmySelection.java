package operators;

public class ArmySelection {

	public static void main(String[] args) {
		double height = 6;
		int age = 25;
		
		double min_height = 6;
		int min_age = 24;
		int max_age = 30;
		
		String res = height>=min_height && (age >=min_age && age<=max_age) ? "Eligible for ARMY" : "Not eligible for ARMY";
		System.out.println(res);
	}
}
