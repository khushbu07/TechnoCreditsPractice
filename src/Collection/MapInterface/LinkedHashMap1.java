package Collection.MapInterface;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	
	//It maintains insertion order
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Deepa", 1);
		map.put("payal", 3);
		map.put("payal",5);
		map.put("Reena", 6);
		map.put("Awali", 8);

		
		System.out.println(map);
		
		
	}

}
