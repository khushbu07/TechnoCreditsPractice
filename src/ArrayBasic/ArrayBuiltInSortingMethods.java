package ArrayBasic;

import java.util.Arrays;
import java.util.Collections;

public class ArrayBuiltInSortingMethods {

	public static void main(String[] args) {

		int a[] = { 30, 50, 20, 10, 60 };
		
		System.out.println("Arrays before sorting : "+Arrays.toString(a));
		
		Arrays.parallelSort(a); //Approach1 :to sort element in asc order
		//Arrays.sort(a); //Approach2 :to sort element in asc order
		
		System.out.println("Arrays After sorting : "+Arrays.toString(a));
		
		
		
		Integer a1[] = { 30, 50, 20, 10, 60 };
		//sort the element in desc/reverse order :
		Arrays.sort(a1,Collections.reverseOrder()); 
		//Collection.reverseOrder method not supported to primitive datatype so used Integer while 
		//declaring the array
		
		System.out.println("Arrays After reverse sorting using collections.reverse : "+Arrays.toString(a1));
	}

}
