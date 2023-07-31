package Integers;

import java.util.Arrays;

public class TripletSum {

	// find the triplet having maximum sum.
	// [10,12,8,20,18,22,15,13,17]
	// output : maximum sum triplet 20,18,22 --> 60

	public static void main(String[] args) {

		int a[] = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		int tripSum = 0;
		int output[] = new int[a.length/3];
		int count = 0;
		for (int i = 0; i < a.length - 2; i = i + 3) {
			tripSum = a[i] + a[i + 1] + a[i + 2];
			output[count] = tripSum;
			count++;
			System.out.println( a[i] + a[i + 1] + a[i + 2]);
		}
		
		System.out.println(Arrays.toString(output));
		
		int max = output[0];
		for (int i = 0; i < output.length; i++) {
			if (output[i] > max) {
				max = output[i];
			}
		}
		System.out.println( "maximum sum triplet  --> " +max);
	}

}
