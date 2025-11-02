package specificReverse;

public class ReverseStringUsingRecursion {

	public static String reverse(String input, String rev, int i) {
		if (i < 0) {

			return rev;
		}
		return reverse(input, rev + input.charAt(i), i - 1);
	}

	public static void main(String args[]) {
		String str = "Monal";
		System.out.println(reverse(str, "", str.length() - 1));// oman

	}
}