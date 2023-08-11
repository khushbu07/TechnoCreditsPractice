package AllOneChar;

public class CharacterCountInStringUsingIndex {

	public static void main(String[] args) {

			
    	//using indexof we overcome the repetition
    	String str="Monalikaalioooooooookk";
    	
    	
    	for(int i=0;i<str.length();i++) {
    		int count=0;
    		char ch=str.charAt(i);
    		if(str.indexOf(ch)!=i)
    	       break;		
    		for(int j=0;j<str.length();j++) {
    			if(str.charAt(j)==ch)
    				count++;
    		}
    		
    		System.out.println(ch+":"+count);

    	}
    }
	}


