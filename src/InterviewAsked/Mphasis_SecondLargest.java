package InterviewAsked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mphasis_SecondLargest {

	public static void main(String[] args) {
	       String str="India is our country";
	  
	  String words[]=str.split(" ");
	 List<String> list=Arrays.asList(words);
	  

	String maxWord="";
	String slarge="";
	for(String word:words){
	    if(word.length()> maxWord.length()){
	        slarge=maxWord;
	        maxWord=word;
	        
	    }
	}
	System.out.println(slarge);
	  }
	  
	  
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  