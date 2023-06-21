package treeMap;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		
		map.put(10,"Nikhil");
		map.put(20,'c');
		map.put(10,"Abhay");        //10=Nikhil will replaced with 10=Abhay
		//map.put('a',10);          //ClassCastException
		map.put(5,25);
		map.put(45,null);
		//map.put(null,45);         //NullPointerException
		map.put(30,98.675);
		
		
		System.out.println(map);
	}
}
