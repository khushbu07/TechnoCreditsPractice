package Strings;

public class AllSubstringsofString {

	public static void main(String[] args) {
		String str="abc";
		System.out.println("All substrings of \""+str+"\":");
		printsubString("abc");

	}
	
	public static void printsubString(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
