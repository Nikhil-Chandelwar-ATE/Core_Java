package treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class SentenceFrequency {

	public static void main(String[] args) {
		TreeMap map = new TreeMap(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		
		String s="nikhil chandelwar";
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				Integer n=(Integer)map.get(s.charAt(i));
				map.put(s.charAt(i), ++n);
			} else {
				map.put(s.charAt(i),1);
			}
		}
		System.out.println(map);
	}
}
