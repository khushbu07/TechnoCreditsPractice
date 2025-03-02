package Strings;

public class VowelCOunt {

	public static void main(String[] args) {

		String str = "Hello World";
		int Vcount = 0;
		for (int i = 0; i < str.length(); i++) {
			str = str.toLowerCase();
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				Vcount++;

		}
		System.out.println(Vcount);
	}

}
