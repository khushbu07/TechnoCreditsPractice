package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Manisha");
		list.add("Amit");
		list.add("Shreya");
		list.add("Manisha");
		list.add("Monalika");
		list.add("Manisha");
		System.out.println("===========for loop====================");
      int count1 = 0;
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).contains("Manisha")) {
				count1++;
			}
		}
		System.out.println(count1);
		
		System.out.println("==============Enhanced for =================");
		int count2=0;
		for(String str:list){
			if(str.equals("Manisha")){
				count2++;
			}
		}
		System.out.println(count2);
		
		System.out.println("==============contains & remove=================");
//		int count3=0;
//		while(list.contains("Manisha")){
//			list.remove("Manisha");
//			count3++;
//		}
//		System.out.println(count3);
		
		System.out.println("==========indexOf=====================");
		
//	   int count4=0;
//	   while(list.indexOf("Manisha")!=-1){
//		   list.remove("Manisha");
//		   count4++;
//	   }
//	   System.out.println(count4);
		
	   System.out.println("=========indexOf and lastIndexOf======================");
	   int count5=0;
	   if(list.contains("Manisha"))
		  count5++;
	   while(list.indexOf("Manisha")!=list.lastIndexOf("Manisha")){
		   list.remove("Manisha");
		   count5++;
	   	 }
	   System.out.println(count5);
	   
}
}