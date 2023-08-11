package AllOneChar;

public class CharacterCountInStringUsingIndex {

	public static void main(String[] args) {

		// using indexof to overcome the repeatations

		String str = "Monkkkkiii"; // "Monaliiikakk"

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char ch = str.charAt(i);
			if (str.indexOf(ch) != i)
				break;
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j))
					count++;
			}

			System.out.println(ch + " : " + count);
		}

	}
}
