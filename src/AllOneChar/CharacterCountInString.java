package AllOneChar;

public class CharacterCountInString {

	public static void main(String[] args) {

		String str = "Monaliiikakk";  
		
		for(int index=0;index<str.length();index++){
			int count=0;
			char ch=str.charAt(index);
		
			for(int j=0;j<str.length();j++){
				if(str.charAt(j)==ch){
					count++;
				}
			}
				System.out.println(ch+" : "+count);
			}
		}

	

}
