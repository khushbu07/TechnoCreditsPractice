package ZeroVariations;

import java.util.Arrays;

public class Zeroes2 {
	//ye is o/p k liye nhi chalega 0 0 0 1 1 1 1 1  
	public static void main(String[] args) {
		int a[]= {1,0,0,1,1,0,1,1,0,1};
		// {1,1,1,1,1,1,0,0,0,0};
		int output[]=new int[a.length];
		int count=0;
		for(int num:a) {
			if(num!=0) {
				output[count]=num;
				count++;
			}
		}
		
		for(int result:output) {
			System.out.print(result+" ");
		}
	}

}
