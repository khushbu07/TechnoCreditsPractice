package Strings;

public class LastWordReverse {

	public static void main(String[] args) {
		String str="I love java programming";
		str=str.trim();
		int lastSpaceIndex=str.lastIndexOf(' ');
		//System.out.println(lastSpaceIndex);
		
		if(lastSpaceIndex==-1) {
			new StringBuilder(str).reverse().toString();
		}
		else {
			String beforeLastWord=str.substring(0,lastSpaceIndex+1);
			//System.out.println(beforeLastWord);
			String lastWord=str.substring(lastSpaceIndex+1);
			String reverselastWord=new StringBuilder(lastWord).reverse().toString();
			System.out.println(beforeLastWord+reverselastWord);
		}

	}

	
	
}
