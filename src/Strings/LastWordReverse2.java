package Strings;

public class LastWordReverse2 {

	public static void main(String[] args) {
		String str="I love java programming";
		 
		String words[]=str.split(" ");
		String lastWord=words[words.length-1];
		String reversedLastWord=new StringBuilder(lastWord).reverse().toString();
		
		words[words.length-1]=reversedLastWord;
	   System.out.println(String.join(" ",words));
		

	
	
}
}