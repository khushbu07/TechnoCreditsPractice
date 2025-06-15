package Strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "Swisswo";
		System.out.println(nonrepeat( str));
	}

	public static char nonrepeat(String str) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
			Set<Entry<Character, Integer>> e1 = map.entrySet();
			for (Entry<Character, Integer> e : e1) {
				if (e.getValue() == 1) {
				 return e.getKey();
				}
			}
            
		
		 return '\0';
	}
}