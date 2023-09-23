package Collection.List.LinkedList1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.omg.Messaging.SyncScopeHelper;

public class ArrayListLinkedListIteration {

	public static void main(String[] args) {

		// LinkedList and ArrayList both are Same,only memory structure wise
		// they are different.
		// ArrayList-search operation-complexity o(1),insertion/deletion o(n)
		// LinkedList-search operation-complexity o(n),insertion/deletion o(1)

		List<String> ar = new ArrayList<String>();

		List<String> list = new LinkedList<String>();
		list.add("Techno");
		list.add("Credits");

		System.out.println("========1. Using for loop==============");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("========2 .Using Enhanced for loop==============");

		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("========3. Using while loop==============");
		int index = 0;
		while (index < list.size()) {
			System.out.println(list.get(index));
			index++;

		}
		System.out.println("========4. Using do while loop==============");
		index = 0;
		do {
			System.out.println(list.get(index));
			index++;
		} while (index < list.size());

		System.out.println("========5. Using Iterator==============");

		// iterator method interator interface ka ref return krti h

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("===================6.Using previous traversing=============");

		ListIterator<String> itr1 = list.listIterator(list.size());
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}

		
		System.out.println("===================6.Using lambda=============");
		
		list.forEach(e->System.out.println(e));

	}

}
