package collectionQue;

import java.util.HashMap;
import java.util.Scanner;

public class Grocery {

	public static void main(String[] args) {
		HashMap<Long,Double> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		long bar=0;
		double price;
		System.out.println("How many items you want to enter");
		for (int i = s.nextInt(); i >0; i--) {
			System.out.println("Enter unique Barcode and Price for each item");
			bar = s.nextLong();
			price = s.nextDouble();
			map.put(bar, price);
		}
		System.out.println(map);
		System.out.println("Enter the barcode to get the price of item");
		long barCode=s.nextLong();
		if (barCode==bar) {
			System.out.println(map.get(bar));
		} else {
			System.out.println("Enter correct BarCode.");
		}
	}
}
