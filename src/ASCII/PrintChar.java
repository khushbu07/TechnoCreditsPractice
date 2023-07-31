package ASCII;

public class PrintChar {
	
	//65 to 90-->A-Z
	//97-122-->a-z
	//48 -57-->48-57

	// 1) write a method which take one character and return its ascii value
	static void printASC(char ch) {
		int a = ch;
		System.out.println(a);

	}

	// 2) write a method which take one ascii and return character.
	static void printChar(int a) {
		char ch = (char) a;
		System.out.println(ch);
	}

	public static void main(String[] args) {
		printASC('A');
		printChar(65);
		
	}

}
