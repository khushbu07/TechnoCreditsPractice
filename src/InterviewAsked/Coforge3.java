package InterviewAsked;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Coforge3 {

	public static void main(String[] args) {
		String str = "welcome to coforge";
		// max character is o
		char ch[] = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		Set<Entry<Character, Integer>> e = map.entrySet();

		char maxChar = 0;
		int maxCount = 0;

		for (Entry<Character, Integer> e1 : e) {
			if (e1.getValue() > maxCount) {
				maxCount = e1.getValue();
				maxChar = e1.getKey();

			}
		}

		System.out.println(maxChar +": "+maxCount);
	}

}
