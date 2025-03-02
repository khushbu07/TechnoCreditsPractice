package Integers;

public class PalindromeArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 1 ,1};
		boolean result = isPalindrome(a);
		if (result) 
			System.out.println("The array is a palindrome.");
		 else 
			System.out.println("The array is not a palindrome.");
		
	}

	

	public static boolean isPalindrome(int[] a) {
		int i = 0;
		int j = a.length-1;

		while (i < j) {
			if (a[i] != a[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
}
