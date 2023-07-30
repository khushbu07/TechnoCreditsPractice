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

	static void max(int a[]) {
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max > a[i]) {
              a[i]=max;
			}
		}
		System.out.println("Max Number in given Array : "+max);
	}

	
	static void min(int a[]) {
		int min = a[0];
       for (int i = 0; i < a.length; i++) {
			if (min < a[i]) {
              a[i]=min;
			}
		}
		System.out.println("Min Number in given Array : "+min);
	}
	public static void main(String[] args) {
		int a[]={2,3,5,6,4};
		max(a);
		min(a);
		
		

	}

}
