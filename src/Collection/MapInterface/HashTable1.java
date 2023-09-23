package Collection.MapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
//	2. Hashtable property
//	• Key & values
//	• null key & null value not allowed--nullpointer exception deta h ye
//	• Duplicate key not allowed
//	• Order does not maintain
//	• synchronized
	
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		map.put("Deepa", 1);
		map.put("payal", 3);
		map.put("payal",5);
		map.put("Reena", 6);
		//map.put(null, null); 
		//map.put(null, 7);
		//map.put("Neha", null);
		
		System.out.println(map);

		
	}

}
