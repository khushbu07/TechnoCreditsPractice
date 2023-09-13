package Collection.List;

import java.util.ArrayList;
//Assignment - 42 :
//Program 1 : Retains all common elements between both list.
public class InterSection_Assignment42 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maulik");
		al1.add("Prasad");
		al1.add("Krishna");
		al1.add("Ritika");
		al1.add("Suvela");
		al1.add("Prasad");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Harsh");
		al2.add("Krishna");
		al2.add("Rahul");
		al2.add("Prasad");
		
		al1.retainAll(al2);
		System.out.println(al1); //[Prasad, Krishna, Prasad]
		
		
		
		

	}

}
