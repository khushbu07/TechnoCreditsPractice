package Specific.InterSection.Reverse;

import java.util.Arrays;

public class ReverseStringArray2 {

	public static void main(String[] args) {

		String input[] = { "Monalika", "Techno", "Tea", "Tribe", "Credits" };
		String output[] = new String[input.length];
		int count = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			output[count] = input[i];
			count++;
		}
		System.out.println(Arrays.toString(output));
	}

}
