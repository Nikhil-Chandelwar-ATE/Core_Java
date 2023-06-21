package arrayList;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(40);
		al1.add(30);
		al1.add(60);
		
		Object [] arr = new Object[5];
		arr[0]=al1;
		arr[1]='a';
		arr[2]=true;
		arr[3]=56.25;
		arr[4]="Nikhil";
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
	}
}
