package ArrayBasic;

public class NthHighestInArray {

	public static void main(String[] args) {
		int k = 2;
		int a[] = { 5, 8, 12, 7, 6, 2, 4 };
		//DESC--12 8 5 7 6 2 4===deepak programs
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			if (i == k-1) {
				System.out.println(a[i]);
				break;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
