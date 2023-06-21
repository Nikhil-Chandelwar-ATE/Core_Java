package variable;

public class Program5 {

	public static void main(String[] args)
	{
		int balance;
		balance = 2500;  		//initial balance
		balance=balance-250;	//withdraw 250
		balance=balance+300;	//deposit 300
		balance=balance-400;	//transfer 400
		balance=balance+200;	//deposit 200
		balance=balance-180;	//maintenance charge 180
		System.out.println(balance);
	}
}
