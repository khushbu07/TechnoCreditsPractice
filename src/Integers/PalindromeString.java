package Integers;

public class PalindromeString {

	public static void main(String[] args) {
		// isPalindrome("naman");
		// isPalindrome("Techno");
		// isPalindrome("Naman");
		diffWayRev("namaM");
		//System.out.println(withoutusingthirdvariable("namaM"));
	}

	static void diffWayRev(String str) {

		int i = 0;
		int j = str.length() - 1;
		boolean flag = true;
		while (i < j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println(str+" String is palindrome");
		}
		else if (!flag){
			System.out.println(str+" String is not palindrome");
		}
	
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
	
	
	//without using third variable
			public static boolean withoutusingthirdvariable(String str) {
			int length=str.length();
				for(int i=0;i<length/2;i++) {
					
					if(str.charAt(i)!=str.charAt(length-1-i)) {
						return false;
					}
				}
				return true;
				
			}
	
}
