package Collection.MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
	 //it sorted the natural order
		
			Map<String, Integer> map = new TreeMap<String, Integer>();
			map.put("Deepa", 1);
			map.put("payal", 3);
			map.put("payal",5);
			map.put("Reena", 6);
			map.put("Awali", 7);
			
			System.out.println(map);
			

	}

}
