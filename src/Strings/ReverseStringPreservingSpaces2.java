
package Strings;

public class ReverseStringPreservingSpaces2 {

	public static void main(String[] args) {
		
		String stri="I Am Not String";
		
      char str[]=stri.toCharArray();
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
		 
		 
		 StringBuilder sb=new StringBuilder();
         for(char s:str){
             sb.append(s);
             
         }
		System.out.println(sb);
	}

}
