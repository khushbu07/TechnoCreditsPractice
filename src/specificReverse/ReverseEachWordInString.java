package specificReverse;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str = "Welcome to India";
		System.out.println(str);
		String wordsArr[] = str.split(" ");
		
		String revString = "";
		for (int index = 0; index <wordsArr.length; index++) {
			String word=wordsArr[index];
			String revWord="";
			for (int i =word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			revString = revString + revWord+" ";
		}
		
		System.out.println(revString);
	
}
}
