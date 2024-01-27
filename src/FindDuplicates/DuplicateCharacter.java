package FindDuplicates;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacter {
	
	public static void main(String[] args) {

		dupli("testingtg");

	}

	public static void dupli(String str) {

		char ch[] = str.toCharArray();

		HashMap<Character, Integer> countMap = new HashMap<>();

		for (Character c : ch) {

			if (countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
			} else {
				countMap.put(c, 1);
			}

		}
		//System.out.println(str+ ":"+countMap);
		
		Set<Entry<Character,Integer>> count=countMap.entrySet();
	
		for(Entry<Character,Integer> entry:count){
			
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
			
			
		}
	}

}
