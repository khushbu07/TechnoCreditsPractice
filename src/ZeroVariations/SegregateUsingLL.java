package ZeroVariations;

import java.util.LinkedList;


public class SegregateUsingLL {

	public static void main(String[] args) {
		int a[]= {1,0,0,1,1,0,1,1,0,1};
		// {1,1,1,1,1,1,0,0,0,0};
		//using doubly linkedlist
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				ll.addFirst(a[i]);
			}
			
			else {
				ll.addLast(a[i]);
			}
		}
		System.out.println(ll);

	}

}
