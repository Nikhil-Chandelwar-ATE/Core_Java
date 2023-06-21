package operators;

public class Program5 {

	public static void main(String[] args) {
		int prod1=1200;
		int prod2=1400;
		int platformCharges=100;
		int actualPay=prod1+prod2+platformCharges;
		int bill=3000;
		int gstCharge=bill-actualPay;
		System.out.println("GST : "+((gstCharge/actualPay)*100));
	}
}
