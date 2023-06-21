package operators;

public class BankTransfer {

	public static void main(String[] args) {
		String name = "Martin";
		int balance = 2000;
		System.out.println(balance+=500);	//deposit 500
		System.out.println(balance-=1000);	//withdraw 1000
		System.out.println(balance-=250);	//fund transfer 250
		System.out.println("Fianl account Balance : "+balance);
	}
}
