package ArrayBasic;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int a[]= {4,2,6,7};
		int b[]= {3,2,1};
		
		int c[]=mergedArray( a,b);
		
		System.out.println(Arrays.toString(c));
		

	}
	
	public static int[] mergedArray(int a[],int b[]) {
		
		int result[]=new int[a.length+b.length];
		
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		
		return result;
		
	}

}
