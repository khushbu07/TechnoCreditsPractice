package InterviewAsked;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Accolite1 {
 //find the non repeating first character's index;
	public static void main(String[] args) {
		String str="wewflcometoaccolite";
		//String str = "HeHloWorld";
		char[] ch=str.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(char c:ch) {
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
				
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		int index = 0;
		char exp=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                index = i;
                exp=c;
                break;
            }
        }

        System.out.println("The index of the first non-repeating character is: " + exp+ " : "+ index);
    }

}
