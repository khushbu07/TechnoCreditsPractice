package Strings;

public class DigitIdentify {

	public static void main(String[] args) {
		  // Coforge interview quest : Input = “Test10.23QA” , output = 10.23
	       String str="Test10.23QA";
	          String temp="";
	       for(int i=0;i<str.length();i++){
	           char ch=str.charAt(i);
	           if(Character.isDigit(ch) || ch=='.'){
	               temp=temp+ch;
	           }
	       }
	       System.out.println(temp);
	    }
	}


