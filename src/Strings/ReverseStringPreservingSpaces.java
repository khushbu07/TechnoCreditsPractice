package Strings;

public class ReverseStringPreservingSpaces {

	public static void main(String[] args) {
		
		String str="I Am Not String";
		
		//g ni rtS toNmAI
		
		String res=reverseStringPreservingSpaces(str);
		System.out.println(res);

     }
	
	public static String reverseStringPreservingSpaces(String input) {
		char str[]=input.toCharArray();
		 int i=0;
		 int j=str.length-1;
		 while(i<j) {
			 if(str[i]==' ') {
				 i++;
			 }
			 else if (str[j]==' ') {
				 j--;
			 }
			 else {
				 char temp=str[i];
				 str[i]=str[j];
				 str[j]=temp;
				 i++;
				 j--;
			 }
		 }
		 
		return new String(str);
	}

}
