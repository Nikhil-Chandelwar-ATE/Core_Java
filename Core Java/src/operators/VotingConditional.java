package operators;

public class VotingConditional {

	public static void main(String[] args) {
		String name = "Person";
		int age = 17;
		String message = age>=18 ? name+" is eligible for Vote" : name+" is not eligible for Vote";
		System.out.println(message);
	}
}
