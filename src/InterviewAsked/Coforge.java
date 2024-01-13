package InterviewAsked;

public class Coforge {

	public static void main(String[] args) {
		 String str="Iop am rahul";
	       //output=I ma luhar
	       String arr[]=str.split(" ");
	       String rev="";
	       for(int i=0;i<arr.length;i++){
	    	   
	           String word=arr[i];
	           String revword="";
	           for(int j=word.length()-1;j>=0;j--){
	        	   revword=revword+word.charAt(j); 
	           }
	       
	           rev=rev+revword+" ";
	       }      
	       
	      System.out.println(rev);
	    }
	}
	


