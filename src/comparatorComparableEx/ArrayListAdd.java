package comparatorComparableEx;

import java.util.ArrayList;
import java.util.Collections;



//a) Comparable interface has only one abstract method -> int compareTo(T o)
//b) Comparator interface has only one abstract method -> int compare(T o1, T o2)
//user defind object pr sort krna ho to comparable interface ko implement krna hota h,
//but with comparable hm sirf kisi ek Attribute k basis pr hi sort kr pate h
//multiple ovariable k basis pr sort krna ho to comparator use krte h
public class ArrayListAdd {

	public static void main(String[] args) {
		
		ArrayList<EmployeeDetails> Arrylistobj=new ArrayList<EmployeeDetails>();
		
		EmployeeDetails obj4=new EmployeeDetails(4,"emp4",30000);
		EmployeeDetails obj1=new EmployeeDetails(1,"emp1",60000);
		EmployeeDetails obj2=new EmployeeDetails(2,"emp2",15000);
		EmployeeDetails obj3=new EmployeeDetails(3,"emp3",20000);
		
		  
		Arrylistobj.add(obj1);
		Arrylistobj.add(obj2);
		Arrylistobj.add(obj3);
		Arrylistobj.add(obj4);
		
		Collections.sort(Arrylistobj);
		System.out.println(Arrylistobj);


	}

}
