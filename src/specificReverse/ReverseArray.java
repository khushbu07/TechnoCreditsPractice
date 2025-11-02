package specificReverse;

import java.util.Arrays;

public class ReverseArray {
  //Deepak solution
	public static void main(String[] args) {
		
		int a[] = { 12, 35, 1, 10, 34, 1 };
		System.out.print(Arrays.toString(a));
		reverse(a);
		System.out.println("\n"+ Arrays.toString(a));
	}

	public static void reverse(int a[]) {

		int len = a.length;//6
		int count = len / 2; //3
		for (int i = 0; i <count; i++) {
			int temp = a[i];
			a[i] = a[len - 1 - i];
			a[len - 1 - i] = temp;
		}

	}
}
