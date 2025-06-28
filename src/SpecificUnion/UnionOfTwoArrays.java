package SpecificUnion;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoArrays {
//	Assignment : 36
//
//	               Program 1: Find union of two arrays.
//	               Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
//	               arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
//                 Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
//	               Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
	
	
	
	//The toArray() method in Java is used to convert a collection (like an ArrayList or a Set) into an array. 
	//It's a member of the java.util.Collection interface and is implemented by its sub-interfaces and classes.
	
	public static void main(String[] args) {

		int a[]= {3,50,60,20,40};
		int b[]= {70,40,56,20,50};
		
		Object arr[]=union(a,b);
		for (Object e:arr) {
			System.out.print(e+" ");
		}
		

	}
	
	public static Object[] union(int a[],int b[]) {
		
		Set<Integer> set =new TreeSet<Integer>();
		for(int a1:a) {
			set.add(a1);
		}
		for( int a2:b) {
			set.add(a2);
		}
		
		
		
		return set.toArray() ;
	
	

}
}