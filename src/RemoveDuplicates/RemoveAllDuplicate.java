package RemoveDuplicates;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class RemoveAllDuplicate {
	
	  public static void main(String[] args) {
	        String s= "Monalika";
	 //remove all values that is duplicate
	         //o/p: Monlik
	          Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	          for(int i=0;i<=s.length()-1;i++){
	              char ch=s.charAt(i);
	              if(map.containsKey(ch)){
	                  map.put(ch,map.get(ch)+1);
	              }
	              else{
	                  map.put(ch,1); 
	              }
	              
	        }
	            
	           //System.out.println(map);  
	           
	           Set<Entry<Character,Integer>> e1=map.entrySet();
	           for(Entry<Character,Integer> e: e1){
	               if(e.getValue()==1){
	                   System.out.print(e.getKey()); 
	               }
	               
	           }

}
	  

}
