package Assignments.collectionRelated;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment45 {
	// Print all the words having frequency less than or equal to 2.
	// String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi
	// Techno Credits Techno";
	// output : Techno -> 2
	// Credits -> 1

	public static void main(String[] args) {

		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		String arr[] = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);

			} else {
				map.put(word, 1);
			}
		}
		System.out.println(map);

		Set<String> output = map.keySet();
		
		for (String e : output) {
			
			if (map.get(e) <= 2) {
				System.out.println(e + ":" + map.get(e));
			}
		}
	}

}
