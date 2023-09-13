package Collection.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("maulik");
		set.add("krishna");
		set.add("Harsh");
		set.add("krishna");
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		//set.clear();
		System.out.println(set);
		

	}

}
