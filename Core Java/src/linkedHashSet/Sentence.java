package linkedHashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Sentence{
	public static void main(String[] args) {
		LinkedHashSet<Character> set = new LinkedHashSet();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String sen =s.nextLine();
	
	for (int i = 0; i <sen.length(); i++) {
		if (sen.charAt(i)!=' ') {
			set.add(sen.charAt(i));
		}
	}
	System.out.println(set);
	for (Character character : set) {
		int count=0;
		for (int i = 0; i < sen.length(); i++) {
			if (character==sen.charAt(i)) {
				count++;
			}
		}
		System.out.println(character+" : "+count);
	}
	System.out.println("***************************************");
	TreeSet<Character> ts = new TreeSet(set);
	for (Character character : ts) {
		int count=0;
		for (int i = 0; i < sen.length(); i++) {
			if (character==sen.charAt(i)) {
				count++;
			}
		}
		System.out.println(character+" : "+count);
	
	}
}
}
