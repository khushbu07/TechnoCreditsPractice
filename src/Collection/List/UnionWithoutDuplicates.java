package Collection.List;

import java.util.ArrayList;

public class UnionWithoutDuplicates {
 
	//output : [Maulik, Prasad, Krishna, Ritika, Suvela, Harsh, Rahul]
	//[Maulik, Krishna, Ritika, Suvela, Rahul, Prasad, Harsh]

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
		al1.add("Rahul");
		al1.add("Prasad");

		al2.removeAll(al1); 
		al1.addAll(al2);
		
		System.out.println(al1);
		
		//if want to remove all "prasad"
//		ArrayList<String> al3 = new ArrayList<String>();
//		al3.add("Prasad");
//		al1.removeAll(al3);
//		System.out.println(al1);
		
		while(al1.indexOf("Prasad")!=al1.lastIndexOf("Prasad")){
				al1.remove("Prasad");
		}
		System.out.println(al1);

	}

}
