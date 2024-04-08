package InterviewAsked;

import java.util.HashMap;
import java.util.Map;

public class ImpetusANDCignity {

	public static void approch1(String str) {
		String str1 = "aabbccc";
		// output=a2b2c3;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				aCount++;
			} else if (str.charAt(i) == 'b') {
				bCount++;
			} else if (str.charAt(i) == 'c') {
				cCount++;
			}
		}
		System.out.println("a" + "" + aCount + "b" + "" + bCount + "c" + "" + cCount);
	}

	public static void generalApproach(String str) {
		 Map<Character,Integer> stringMap = new HashMap<Character,Integer>();
	        
	        for(int i = 0 ; i < str.length(); i++) {
	            char value = str.charAt(i);
	            if (stringMap.containsKey(value)) {
	                int count = stringMap.get(value)+1;
	                stringMap.put(value,count);
	            }else{
	                stringMap.put(value,1);
	            }
	        }
	        
	        String res = "";
	        for (Map.Entry<Character,Integer> entry : stringMap.entrySet()) {
	            res = res + ""+entry.getKey() + entry.getValue();
	            //System.out.println(""+entry.getKey() + entry.getValue()); 
	        } 
	        System.out.println(res);
	        
	        for(Character key:stringMap.keySet()) {
				System.out.print(key+""+stringMap.get(key));
			}
	    }
		
	

	public static void main(String[] args) {
		//approch1("aabbcccdddd");
		generalApproach("aabbcccdddE");

	}
}
