package AllOneChar;

import java.util.HashMap;
import java.util.Map;

public class CharCountUsingHashMap {

	public static void main(String[] args) {
		
		String str="Monnnaliikaaaa";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}
			else{
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);

	}

}
