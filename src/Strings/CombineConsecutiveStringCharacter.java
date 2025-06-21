

package Strings;

public class CombineConsecutiveStringCharacter {

	public static void main(String[] args) {
		/*
		 * Question 15: Write a java program to combine alternative character of a given
		 * string. Input: String str1 = “Automation”; String str2 = “Testing”; Output:
		 * ATuetsotmiantgion
		
		 */

		String str1 = "Automation";
		String str2 = "Testing";

		int totalLen = str1.length() + str2.length();
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < totalLen; i++) {
			if (i < str1.length()) {
				output.append(str1.charAt(i));
			}
			if (i < str2.length()) {
				output.append(str2.charAt(i));
			}
		}
		System.out.println(output);
	}

}
