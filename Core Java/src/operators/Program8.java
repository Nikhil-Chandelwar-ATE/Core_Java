package operators;

public class Program8 {

	public static void main(String[] args) {
		int withdraw=5400;
		int note=500;
		int count=withdraw/note;
		System.out.println("Number of notes dispensed : "+count);
		int remaining=note*count;
		System.out.println("Remaining amount : "+(withdraw-remaining));
	}
}
