package ArrayScenarios;

import java.util.Arrays;

public class DuplicateElementInArray {

	static void duplicateInteger(int a[]) {
		System.out.print("Duplicate from Int array :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (i < j) {
						System.out.print( a[i] + " ");
						break;
					} else if (i > j)
						break;

				}

			}
		}
	}

	static void duplicateString(String a[]) {
		System.out.print("Duplicate from string array :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					if (i < j) {
						System.out.print( a[i] + " ");
						break;
					} else if (i > j)
						break;

				}

			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 0, 3, 1, 2, 3, 3, 4, 0, 6, 2 };
		System.out.println("Integer Array "+Arrays.toString(a));
		duplicateInteger(a);
		String b[] = { "techno", "Hi", "Hello", "Hi", "gm", "gm" };
		System.out.println("\nString araay "+Arrays.toString(b));
		duplicateString(b);

	}
}
