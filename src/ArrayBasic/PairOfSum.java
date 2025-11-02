package ArrayBasic;

public class PairOfSum {
  
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int targetSum = 10;
		findPairs(arr, targetSum);

	}
	
	public static void findPairs(int a[],int targetSum) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == targetSum) {
					System.out.println("Pair found: (" + a[i] + ", " + a[j] + ")");
				}
			}
		}
	}

}
