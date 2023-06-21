package operators;

public class Program9 {

	public static void main(String[] args) {
	int partyMembers=7;
	int eachPay=1000;
	int expenditure=5400;
	int totalAmount=eachPay*partyMembers;
	double remainingAmount=totalAmount-expenditure;
	System.out.println("Amount returned to each : "+(remainingAmount/partyMembers));
	}
}
