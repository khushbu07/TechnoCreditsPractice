package Assignments.collectionRelated;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment46 {
	// Print the words having maximum frequency.
	// String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello
	// globant Hi Techno Credits Techno";
	// output : Hi ->7
	public static void main(String[] args) {

		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
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

		Set<String> set = map.keySet();

		int max = 0;
		String maxKey = null;
		for (String e : set) {
			if (map.get(e) > max) {
				max = map.get(e);
				maxKey = e;

			}
		}
		System.out.println(maxKey + " : " + max);
	}

}
