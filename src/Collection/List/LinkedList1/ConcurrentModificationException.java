package Collection.List.LinkedList1;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationException {

	static void findFreUsingEnhanceForloop(List<String> list, String word) {
		int count = 0;
		for (String str : list)
			if (str.equals(word)) {
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

		findFreUsingEnhanceForloop(list, "Hello");

	}

}
