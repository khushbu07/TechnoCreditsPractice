package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 4, 2, 1, 5, 3 };

		System.out.println("Array before Sorting : " + Arrays.toString(a));

		int len = a.length;

		for (int i = 0; i < len - 1; i++) {// number of passes should be len-1
			for (int j = 0; j < len - 1; j++) { //iteration in each pass

				if (a[j] > a[j+1]) {  //for asc <-- for desc a[j]< a[j+1]
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;

				}
			}

		}
		System.out.println("Array After Sorting : " + Arrays.toString(a));
	}
}