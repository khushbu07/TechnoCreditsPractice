package AllOneChar.WordCount;

public class WordCountInString {

	public static void main(String[] args) {

		String str = "hello gm hi gm gm no hello yes hi";
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			int count = 0;
			if (str.contains(word)) {
				for (int j = 0; j < arr.length; j++) {
					if (word.equals(arr[j])) 
						count++;
					}
				System.out.println(word + " : " + count);
				str=str.replaceAll(word, "  ");
			}

		}
	}
	
}