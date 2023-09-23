package Collection.List.LinkedList1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NoSuchElementExceptionInJava {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("Techno");
		list.add("Credits");
		list.add("Maulik");
		list.add("Krishna");
		list.add("Harsh");

		// java.util.NoSuchElementException :if we are iterating ele wothout
		// condition chk,then we got this exception

//		Iterator<String> itr = list.iterator();
//		while (itr.hasNext()) {
//			if (itr.next() != null) {
//				System.out.println(itr.next());
//			}
//		}
		
		// enhance forloop and iterator both working on top to bottom and notworking on index
		// diff: iterator fail safe and enhanced for loop fail fast
		// enhanced for loop me jb hm iteration krte time pr modification krte hto, ye concurrent
		//Iterator me 3 methods : hasNext ,next,remove 
		//jb readonly mode hi ho sirf print krwana to tb enhance for loop use krna chaiye,
		//iteration pr modification krna ho to iterator use krna chaiye
		
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			if (temp.length() < 3) {
				itr.remove();
			}
		}
			System.out.println(list);
		}
	}


