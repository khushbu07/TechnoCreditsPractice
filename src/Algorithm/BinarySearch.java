package Algorithm;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		// Element should be in sorted order in array

		int a[] = { 1,5,7,9,10,99};
		boolean flag = false;
		int key = 9;
		int l = 0;
		int h = a.length - 1;
		while (l <= h) {

			int m = (l + h) / 2;
			if (a[m] == key) {
				System.out.println("Element found at index "+m);
				flag = true;
				break;
			}
			if (a[m] < key) {
				l = m + 1;
			}

			if (a[m] > key) {
				h = m - 1;

			}
		}

		
		if(flag==false){
			System.out.println("Element not found");
		}
		
		
		//Array method : Arrays.binarySearch(array,value): return index if not element then return neg value
		System.out.println(Arrays.binarySearch(a, key));
		
	}

}
