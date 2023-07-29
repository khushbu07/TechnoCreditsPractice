package Strings;

public class PalindromeString {

	public static void main(String[] args) {
		isPalindrome("naman");
		isPalindrome("Techno");
		isPalindrome("Naman");
	}

	static void isPalindrome(String str) {

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		if (rev.equalsIgnoreCase(str)) {
			System.out.println(str + " is Palindrome");

		} else {
			System.out.println(str + " is not Palindrome");
		}
	}
}
