package AllOneChar;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

		
		Set<Entry<Character,Integer>>entry1=map.entrySet();
		for(Entry<Character,Integer> e1:entry1){
			if(e1.getValue()>1)
			//System.out.println(e1.getKey()+" : "+e1.getValue());
			System.out.println(e1);
		}
	}

}
