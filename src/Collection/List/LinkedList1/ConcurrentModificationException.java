package Collection.List.LinkedList1;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationException {
	//collection part5
	//normal loop(for,while ,do while) fail safe -we can modify while iterating
	//enhance for loop fail fast-we can not perform modification(only remove)[ set or add k case me nhi hoga] while itrating ,it gives concurrentmodifiction exception(Unchecked exception)

	static void findFreUsingEnhanceForloop(List<String> list, String word) {
		int count = 0;
		for (String str : list)
			if (str.equals(word)) {
				list.remove(word);
				count++;
			}

		System.out.println("Freq of " + word + " is : " + count);

	}
	
	static void findFreUsingForloop(List<String> list, String word) {
		int count = 0;
		for(int i=0;i<list.size();i++){
			if (list.get(i).equals(word)) {
				//list.remove(word);
				count++;
			}
		}
		System.out.println("Freq of " + word + " is : " + count);

	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("Krishna");
		list.add("Krishna");
		list.add("Hello");
		list.add("Credits");
		list.add("Maulik");
		list.add("Krishna");
		list.add("Hello");
		list.add("Hello");
	

	//	findFreUsingEnhanceForloop(list, "Hello");
		findFreUsingForloop(list,"Hello");

	}

}
