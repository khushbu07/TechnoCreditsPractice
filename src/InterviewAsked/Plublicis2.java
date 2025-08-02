package InterviewAsked;

import java.util.ArrayList;
import java.util.List;

public class Plublicis2 {

	public static void main(String[] args) {
		String S="1010111$^&%(*)101011";
		   //ouput- 0000111111111
		
		S=S.replaceAll("[^01]", "");
		System.out.println(S);
		
		char ch[]=S.toCharArray();
		List<Character> zeroes=new ArrayList<Character>();
		List<Character> ones=new ArrayList<Character>();
		for(char c:ch) {
			if(c=='0') {
				zeroes.add(c);
			}
			else {
				ones.add(c);
			}
		}
	
		zeroes.addAll(ones);
	System.out.println(zeroes);
		StringBuilder sb=new StringBuilder();
		for (Character c : zeroes) {
			sb.append(c);
		}
		System.out.println(sb.toString());
}
}