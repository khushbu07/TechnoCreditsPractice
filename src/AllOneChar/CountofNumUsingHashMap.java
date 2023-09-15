package AllOneChar;

import java.util.HashMap;
import java.util.Map;

public class CountofNumUsingHashMap {
//	Assignment 44 Program 2:
//		Find frequency of each number from the Array
//		Integer arr[] = {23,12,45,67,23,12,67,33};
	public static void main(String[] args) {

		int a[] = { 23, 12, 45, 67, 23, 12,12,67, 33 };
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i])){
				map.put(a[i],map.get(a[i])+1);
			}
			else{
				map.put(a[i],1);
			}
		}
		System.out.println(map);

	}
}