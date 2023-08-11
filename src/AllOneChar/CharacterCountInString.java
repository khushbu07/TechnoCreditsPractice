package AllOneChar;

public class CharacterCountInString {

	public static void main(String[] args) {

		String str = "Monaliiikakk";
		
		for(int i=0;i<str.length();i++){
			int count=0;
			char ch=str.charAt(i);
			for(int j=0;j<str.length();j++){
				if(ch==str.charAt(j)){
					count++;
				}
			}
				System.out.println(ch+" : "+count);
			}
		}

	

}
