package Integers;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		/* Question 14: Write a java program to find given strings are Anagram or not.
		Input:
		           String str1 = “Tesla”;  String str2 = “Slate”;
		Output:
		             Yes
		 */
		
//		1. conert lowercase
//		2. convert into char array
//		3. sort the char array
//		4. compare array
		
		 String str1 = "Tesla";  
		 String str2 = "Slate";
		 
		 char ch1[]=str1.toLowerCase().toCharArray();
		 char ch2[]=str2.toLowerCase().toCharArray();
		 
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		if( Arrays.equals(ch1, ch2)) {
			 System.out.println("Given words are anagram");
        } else {
            System.out.println("Given words are not anagram");
        }
		

	}

}
