package RemoveDuplicates;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupFromIntArray {

	public static void main(String[] args) {
		 int input[] = {2,3,6,5,8,2,3};
		//Output = [2,3,6,5,8]
		 
		 Set<Integer> set=new LinkedHashSet<Integer>();
		 
		 for(int i=0;i<input.length;i++) {
			 set.add(input[i]);
		 }
		 
		Iterator<Integer>itr=set.iterator();
		while(itr.hasNext()) {
			int value=itr.next();
			System.out.print(value+" ");
		}
	

	}

}
