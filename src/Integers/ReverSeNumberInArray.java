package Integers;

import java.util.Arrays;

public class ReverSeNumberInArray {

	// Input:{471, 443, 749}
	// Output:{174, 344, 947}
	
	static void revUsingArray(int input[]) {
		int output[] = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int rev = 0;
			while (input[i] != 0) {
				rev = rev * 10 + input[i] % 10;
				input[i] = input[i] / 10;
				output[i] = rev;
			}
         }
		System.out.println(Arrays.toString(output));
	}

	static void revArray(int input[]) {
		for (int i = 0; i < input.length; i++) {
			int rev = 0;
			while (input[i] != 0) {
				rev = rev * 10 + input[i] % 10;
				input[i] = input[i] / 10;
				}
           System.out.print(rev + " ");
           }
		}

	public static void main(String[] args) {
		int input[] = { 471, 443, 749 };
		revArray(input);
		//revUsingArray(input);
	}
	

}

