package RemoveDuplicates;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void NaiveApproach(int[] b) {
		int temp[] = new int[b.length];
		int rd = 0;
		temp[rd] = b[0];// 2
		for (int i = 1; i < b.length; i++) {
			if (b[i] != temp[rd]) {
				rd++;
				temp[rd] = b[i];
			}
		}

		System.out.println(Arrays.toString(temp));
	}

	public static int OptimizedremoveDuplicate(int a[]) {

		int rd = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[rd] != a[i]) {
				rd++;
				a[rd] = a[i];
			}
		}

		return rd + 1;
	}

	public static void main(String[] args) {
		int a[] = { 2, 2, 3, 3, 4, 5, 5, 6 };
//		int rd = removeDuplicate(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
		System.out.println(Arrays.toString(a));
		NaiveApproach(a);
		

	}

}
