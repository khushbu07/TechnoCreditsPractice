

package RemoveDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayUsingSet {

	public static void main(String[] args) {

		String str[] = { "techno", "Hi", "Hello", "Hi", "gm", "gm" };

		System.out.println("Print with Duplicates : " + Arrays.toString(str));

		List<String> list = new ArrayList<String>(Arrays.asList(str));

		Set<String> set = new LinkedHashSet<String>(list);

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() );

		}
		System.out.println("Without duplicates :" + set);
	}

}
