package Strings;


import java.util.LinkedHashMap;
import java.util.Map;
//18.Find the First Repeated and Non-Repeated Character   - 
//Example: Input: `"JavaConceptOfTheDay"`,
//Output: `First repeated: 'a', First non-repeated: 'J'` 

public class FirstRepeatedNonRepeated {
	
	public static void main(String[] args) {

		String str = "JavaConceptOfTheDay";
		char ch=firstRepeatChar(str);
		System.out.println(ch);
		char ch1=nonRepeat(str);
		System.out.println(ch1);
	}

	public static char firstRepeatChar(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				return ch;
			}
			else {
				map.put(ch, 1);
			}

		}
		
		return '\0';
	}

	
	public static char nonRepeat(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		for(char c:str.toCharArray()) {
			if(map.get(c)==1) {
				return c;
			}
		}
		return '\0';
	}

}
