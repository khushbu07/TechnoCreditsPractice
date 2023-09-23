package Collection.SetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

//		TreeSet:
//		Properties: a) It does not allow duplicate values.
//                  b) But it maintains natural order of elements (Alphabetic in String and Ascending order in Integer)
		
    	Set<String> set1 = new TreeSet<String>();
			set1.add("maulik");
			set1.add("krishna");
			set1.add("Harsh");
			set1.add("krishna");
			
		Set<Integer> set2 = new TreeSet<Integer>();
			set2.add(10);
			set2.add(200);
			set2.add(1678);
			set2.add(1);

			System.out.println(set2);
			
			//to iterate set
			Iterator<String>itr=set1.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}

	}


