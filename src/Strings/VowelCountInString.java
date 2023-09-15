package Strings;

public class VowelCountInString {

	public static void main(String[] args) {
       
		String str="techNoCredItsAaU";
		
		int aCount=0,eCount=0,iCount=0,oCount=0,uCount=0;
		for(int i=0;i<str.length();i++) {
			char vowel=str.charAt(i);
			switch(vowel){
			case 'A' :
			case 'a' :
				aCount++;
				 break;
			case 'I' :
			case 'i' :
				iCount++;
				break;	
			case 'E' :
			case 'e' :
				eCount++;
				break;	
			case 'O' :
			case 'o' :
				oCount++;
				break;	
			case 'U' :
			case 'u' :
				uCount++;
				break;	
			}
		}	
			System.out.println("A count "+aCount);
			System.out.println("E count "+eCount);
			System.out.println("I count "+iCount);
			System.out.println("O count "+oCount);
			System.out.println("U count "+uCount);
			
	}

}
