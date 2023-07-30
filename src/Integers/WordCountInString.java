package Strings;

public class WordCountInString {

	
	 void countWord(String input) {
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			String word = arr[i];
			if (input.contains(word)) {
				for (int j = 0; j < arr.length; j++) {
					if (word.equals(arr[j]))
						count++;
			}
			System.out.println(word+" --> "+count);
			input = input.replaceAll(word," ");
			
			}
			
	}
	 }
	public static void main(String[] args) {
		WordCountInString wc=new WordCountInString();
		String str = "Hi Hello gm gn Hi Hello gm gm gn techno";
		wc.countWord(str);
	
	}
}
