package Integers;

public class FiboonacciSeries {

	// Assignment - 37 : 10th Dec'2020
	// Print Fibonacci series for first 10 numbers.Sum of 2 preceding number
	// output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		System.out.print( n1+" "+n2+" ");
		for (int i = 2; i < 10; i++) {
			int sum = n1 + n2; // 1  
			System.out.print(sum+" ");
			n1 = n2; // 1
			n2 = sum; // 1
		
           
		}

	}

	void fiboSeries(int num) {

	}

}
