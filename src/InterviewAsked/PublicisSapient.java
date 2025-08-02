package InterviewAsked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PublicisSapient {

	public static void main(String[] args) {
		
		String s="I love to code java programming";
		String words[]=s.split(" ");
		List<String> al=Arrays.asList(words);
		String maxWord="";
		/*
		 * for (int i = 0; i < al.size(); i++) { if (al.get(i).length() >
		 * maxWord.length()) { maxWord = al.get(i); } }
		 */
	
		for(String word:al) {
			if (word.length() > maxWord.length()) {
				maxWord = word;
			}
			
		}
        System.out.println("Longest word: " + maxWord);
	}

}
