package Collection.List.LinkedList1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FreqOfWordInArrayList {

	static void findFre(List<String> list, String word) {
		int count = 0;
		while (list.indexOf(word) != -1) {
			list.remove(word);
			count++;
		}

		System.out.println("Freq of " + word + " is : " + count);

	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("Hello");
		list.add("Credits");
		list.add("Maulik");
		list.add("Krishna");
		list.add("Hello");

		findFre(list, "Hello");

	}

}
