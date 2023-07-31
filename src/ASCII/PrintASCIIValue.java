package ASCII;

public class PrintASCIIValue {

	// 3) write a method to print ascii values for uppercase letters [A-Z]. A -> 65, B - 66....

    static void printASCUpperCase() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int temp = ch;
			System.out.println(ch + " : " + temp);
		}
	}

	// write a method to print ascii values for lowercase letter [a-z].a -> 97, b -> 98
	static void printLowerCase() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int temp = ch;
			System.out.println(ch + " : " + temp);
		}
	}

	public static void main(String[] args) {
		printASCUpperCase();
		printLowerCase();
	}
}