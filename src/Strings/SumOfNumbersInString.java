package Strings;

public class SumOfNumbersInString {

	// input: I have 5.6 years of exp in automation and 2.3 in manual testing
	// output: 7.9
	// hint: Double's parse method
	// use exception handling

	public static void main(String[] args) {

		String str = "I have 15 years of exp in automation and 8 in manual testing";
		String temp = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}

			else if (Character.isLetter(ch)) {
				if (temp.length() > 0) {
					sum = sum + Integer.parseInt(temp);//0+
					temp = "";

				}
			}
		}
			System.out.println("Sum : "+sum);
		}

	
}