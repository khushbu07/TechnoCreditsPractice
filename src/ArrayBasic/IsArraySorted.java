package ArrayBasic;

public class IsArraySorted {

	public static void main(String[] args) {

		int a[] = {2,4,6,5,7,9 };
		System.out.println(7/2);
		System.out.println(isSorted(a));
	}

	public static boolean isSorted(int a[]) {

		for (int i = 1; i < a.length; i++) {

			if (a[i ] < a[i-1]) {
				return false;
			}

		}
		
		return true;
	}

}
