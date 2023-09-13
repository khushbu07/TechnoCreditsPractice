package Collection.List;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maulik");
		al1.add("Prasad");
		al1.add("Krishna");


		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Harsh");
		al2.add("Krishna");
		al2.add("Rahul");
		
		
		//al1.addAll(al2);  //it adds all element including duplicate
		//System.out.println(al1); 
		
		
//		al1.remove(0);
//		System.out.println(al1);
		
//		al1.removeAll(al2);// it removes common elements 
//		System.out.println(al1);
		
		al1.retainAll(al2);//it retains common element
		System.out.println(al1);
	}

}
