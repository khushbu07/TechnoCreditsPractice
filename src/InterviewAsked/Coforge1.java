package InterviewAsked;

public class Coforge1 {

	public static void main(String[] args) {
		// Coforge interview quest : Input = �Test10.23QA� , output = 10.23
		String str = "Test10.23QA";

		String output = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) || ch == '.') {
				output = output + ch;
			}

		}

		System.out.println(output);
	}

}
