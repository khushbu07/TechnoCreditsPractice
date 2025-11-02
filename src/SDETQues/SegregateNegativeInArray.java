package SDETQues;

public class SegregateNegativeInArray {
//	Given an array of integers, write a function to move all the negative numbers to the left end of the array without changing the relative order of the non-negative numbers. The function should do this in place with a minimum number of operations.
//	Example:
//	int[] nums = {1, -1, 3, -2, -3, 5, 6, -7}
//	Output: [-1, -2, -3, -7, 1, 3, 5, 6]
	
	public static void main(String[] args) {
		int[] a = {1, -1, 3, -2, -3, 5, 6, -7};
//		Output: [-1, -2, -3, -7, 1, 3, 5, 6]
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
			int temp=a[i];
			a[i]=a[count];
			a[count]=temp;
			count++;
			}
		}

		
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
