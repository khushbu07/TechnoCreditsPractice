package Collection.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
	
	   //LinkedHashSet:
		//Properties: a) It does not allow duplicate values. b) But it maintains insertion order

	public static void main(String[] args) {
		Set<String> set1 = new LinkedHashSet<String>();
		set1.add("maulik");
		set1.add("krishna");
		set1.add("Harsh");
		set1.add("krishna");

		System.out.println(set1);
	}

}
