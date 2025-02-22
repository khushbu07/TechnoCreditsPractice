package InterviewAsked;

import java.util.Arrays;
import java.util.*;
import java.util.Map.Entry;

public class Globant_L2 {

	public static void main(String[] args) {


		
		String str="the4book5nameda2bc4is7good8book7having0good0stories";
				String words[]=str.split("[0-9]");
				System.out.println(Arrays.toString(words));
				
				
				Map<String,Integer> map=new LinkedHashMap<String,Integer>();

				for(int i=0;i<=words.length-1;i++){
				String word=words[i];
				if(map.containsKey(word)){
				map.put(word,map.get(word)+1);
				}
				else{
				map.put(word,1);

				}
				}
				Set<Entry<String,Integer>> e1=map.entrySet();
				for(Entry<String,Integer> e:e1){
				if(e.getValue()>1){
				System.out.println(e.getKey());
				}

	}

}
}