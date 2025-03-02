package Strings;

public class PalindromeStringSimple {

	public static void main(String[] args) {
		String str= "racecar";
		
		Boolean result =isPalindromeString(str);
		if (result) 
			System.out.println(str + " :  The String is a palindrome.");
		 else 
			System.out.println(str + " : The String is not a palindrome.");
		
		
		

	}
	
	public static boolean isPalindromeString(String str) {
		 int i=0;
		 int j=str.length()-1;
		
		 while(i<j) {
			 if(str.charAt(i)!=str.charAt(j)) {
				return false;
			 }
			 i++;
			 j--;
		 }
		return true;
	}

}
