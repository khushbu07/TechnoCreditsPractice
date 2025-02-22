

package ArrayBasic;

//Find second maximum from array without sorting the array.

public class SecondMinArray {

	public static void main(String[] args) {

		int a[] = { 1, 7, 4, 9, 5, 2, 8, 3 };
		int max = 0;
		int sMax = 0;

		if (a[0] > a[1]) {
			max = a[0]; // 2
			sMax = a[1]; // 3
		} else {
			max = a[1]; // 2
			sMax = a[0]; // 3
		}
		for (int i = 2; i < a.length; i++) {
			if (a[i] < max) {
				sMax = max; // 2
				max = a[i]; // 5
			} else if (a[i] < sMax) {
				sMax = a[i];

			}
		}
		System.out.println("Second Max :" + sMax);
	}

}
