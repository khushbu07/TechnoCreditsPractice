package ArrayBasic;

public class MinMaxAvgPrint {
	// write a single program having different methods.
	// Assignment - 12
	// a) To find Min number from given array
	// b) To find Max number from given array
	// c) To find Avg of all numbers from give array
	// d) To display all numbers [0 to length]
	// e) To display all numbers [length to 0]
	// g) Method to find average of min and max number from array.

	static int max(int a[]) {
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}

	static int min(int a[]) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		return min;
	}

	static int average(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int avg = sum / a.length;
		return avg;

	}

	static int avgOfMinMax(int a[]) {
     int max1=max(a);
     int min1=min(a);
     int bothavg=(max1+min1)/2;
      return bothavg;
	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 5, 6, 4,6,4,10 };
		System.out.println("Max : "+max(a));
		System.out.println("Min : "+min(a));
		System.out.println("Avarage of Array : "+average(a));
		System.out.println("avgOfMinMax :"+avgOfMinMax(a));
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
