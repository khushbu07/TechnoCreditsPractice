package ZeroVariations;

import java.util.LinkedList;
import java.util.List;

public class SegregateUsingLL {

	public static void main(String[] args) {
		int a[]= {1,0,0,1,1,0,1,1,0,1};
		// {1,1,1,1,1,1,0,0,0,0};
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				ll.addFirst(a[i]);
			}
			
			if(a[i]!=0) {
				ll.addLast(a[i]);
			}
		}
		System.out.println(ll);

	}

}
