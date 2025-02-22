package RemoveDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {
	public static void main(String[] args) {
		
		Integer a[]= {10, 15, 8, 4, 12, 8, 4, 10, 11, 8,15,8};
		List<Integer> nums = new ArrayList<>(Arrays.asList(a));

		Set<Integer> output = new HashSet<Integer>(nums);
		List<Integer> newArray = new ArrayList<>(output);
		System.out.println(output);
		System.out.println(newArray);
		
		
		
	}
}