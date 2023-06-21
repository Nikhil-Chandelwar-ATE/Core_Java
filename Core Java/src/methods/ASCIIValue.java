package methods;

public class ASCIIValue {

	public static void printAscii(char ch) {
		System.out.println((int)ch);
	}
	public static void main(String[] args) {
		printAscii('a');
		printAscii('%');
		printAscii('9');
		printAscii('Z'); 
	}
}
