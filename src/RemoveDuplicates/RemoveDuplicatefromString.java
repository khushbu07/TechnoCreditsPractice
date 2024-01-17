package RemoveDuplicates;

import java.util.LinkedHashSet;

public class RemoveDuplicatefromString {

	public static void main(String[] args) {
		String str="java";
		char ch[]=str.toCharArray();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(char c:ch) {
			set.add(c);
		}

	
		StringBuilder result=new StringBuilder();
		
		for(char c:set) {
			result.append(c);
		}
		
		System.out.println(result);
	}

}
