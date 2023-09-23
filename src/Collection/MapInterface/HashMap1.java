package Collection.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
//		Map Interface
		//
//			1. HashMap
//			2. Hashtables
//			3. TreeMap
//			4. LinkedHashMap
		
//			HashMap
		//
//			1. Duplicate key not allowed
//			2. one null key & Null value allowed
//			3. Key order not maintained
		//
//			1 put --> return previous value or null
//			2 clear --> void
//			3 size --> int
//			4 get(key) --> return value/null
//			5 remove(key) --> return value
//			6 remove(key, value) --> true/false
//			7 isEmpty() --> true/false
//			8 containsKey(key) --> true/false
//			9 containsValue(key) --> true/false
//			10 entrySet --> return entry
		//
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Deepa", 1);
		map.put("payal", 3);
		map.put("payal",5);
		map.put("Reena", 6);
		map.put("Awali", 8);
		map.put(null, 19);
		map.put(null, 20);
		map.put("Disha", null);

		
		System.out.println(map.size());
		int val = map.get("payal");
		System.out.println(val);
		
//		int val1=map.remove("payal");
//		System.out.println(val1);
		
//		boolean remov=map.remove("Reena", 6);
//		System.out.println(remov);
		
		//Either use iterator or enhance for loop after entryset
		Set<Entry<String,Integer>> entry=map.entrySet();
		System.out.println("===Iterator Using enhance for loop===============");
		
		
		for(Entry<String,Integer> e1:entry){
			System.out.println(e1.getKey()+" : "+e1.getValue());
			
		}
		
		System.out.println("===Iterator Using Iterator===============");
		Iterator<Entry<String,Integer>> itr =entry.iterator();
		while(itr.hasNext()){
			Entry<String,Integer>e=itr.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
	}

}
