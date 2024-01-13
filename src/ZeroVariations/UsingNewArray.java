package ZeroVariations;

public class UsingNewArray {

	//ye is o/p k liye nhi chalega 0 0 0 4 3 2 5 1  
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
		//1 2 4 3 5 0 0 0 
		int result[] = new int[arr.length];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[count] = arr[i];
				count++;
			}
		}

		for (int num : result) {
			System.out.print(num + " ");
		}

	}

}
