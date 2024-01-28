package InterviewAsked;

public class Coforge4 {

	public static void main(String[] args) {
		String str = "welcome to coforge";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			
			char ch = str.charAt(i);
			if (str.indexOf(ch) == i) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == ch) {
						count++;
						
					}
				}

				System.out.println(ch + ":" + count);
			}
			
		}
	}
}
