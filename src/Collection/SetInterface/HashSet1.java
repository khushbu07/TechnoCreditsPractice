package Collection.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		
		//we can iterate set via iterator / enhanced for loop because set does not have any get method
		
		//HashSet: Properties: a) It does not allow duplicate values.
		                     //b) It does not maintain insertion order. 
		Set<String> set1 = new HashSet<String>();
		set1.add("maulik");
		set1.add("krishna");
		set1.add("Harsh");
		set1.add("krishna"); // it will not be added
		
		
		System.out.println(set1);
		System.out.println(set1.size());
		System.out.println(set1.isEmpty());
		//set.clear();
		//System.out.println(set1);
		
		
		Set<String> set2 = new HashSet<String>();
		set2.add("Harsh");
		set2.add("Krishna");
		set2.add("Rahul");
		set2.add("Prasad");
		
		set1.addAll(set2);
		System.out.println(set1);

	}

}
