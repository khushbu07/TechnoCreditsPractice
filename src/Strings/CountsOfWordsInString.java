package Strings;

public class CountsOfWordsInString {

	public static void main(String[] args) {

		String str="Welcome to new begining of this world java is learning rtty";
		int count = 1;
		for (int index = 0; index < str.length(); index++) {

			if ((str.charAt(index) == ' ') && (str.charAt(index + 1) != ' ')) {
				count++;
			}

		}
		System.out.println("Word count in entered String is : " + count);

		//second approach
		String arr[]=str.split(" ");
		System.out.println(arr.length);
	}

}
