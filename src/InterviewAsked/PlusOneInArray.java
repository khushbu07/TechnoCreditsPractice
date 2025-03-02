package InterviewAsked;

import java.util.Arrays;

public class PlusOneInArray {

	public static void main(String[] args) {
	//	int a[] = { 1, 2, 9};
		int a[] = { 2,3,9};

		int result[] = plusIncrement(a);
		for (int e : result) {
			System.out.print(e+" ");
		}

	}

	public static int[] plusIncrement(int a[]) {
		 // Start from the last digit of the array
		int n = a.length;
		
		for (int i = n - 1; i >= 0; i--) {
			 // If the current digit is less than 9, just increment and return the result
			if (a[i] < 9) {
				a[i]++;
				return a;
			}
			
			// If the current digit is 9, set it to 0 and carry over 1 to the next digit
			
			a[i] = 0;
		}
		// If we reach here, it means the number is like 999, so we need an extra digit at the front
		int arr[] = new int[n + 1];
		arr[0] = 1;  //// Add the carry-over to the most significant digit
		return arr;

	}

}
