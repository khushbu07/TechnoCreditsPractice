package AllOneChar;

import java.util.HashMap;
import java.util.Map;

public class WordCountInStringUsingHashMap {

	public static void main(String[] args) {

		String str="hello gm hi gm gm no hello yes hi";
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		String arr[]=str.split(" ");
		
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}

}
