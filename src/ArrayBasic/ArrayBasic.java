package ArrayBasic;

public class ArrayBasic {

	int maximum(int num[]) {
		int max = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] > max) {
				max = num[index];
			}
		}
		return max;
	}

	int minimum(int[] num) {
		int min = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] < min) {
				min = num[index];
			}
		}

		return min;
	}

	int sum(int num[]) {
		int totalSum = 0;
		for (int index = 0; index < num.length; index++) {
			totalSum = totalSum + num[index];
		}
		return totalSum;
	}

	int average(int[] num) {
		int avg = sum(num) / num.length;
		return avg;
	}

	void display(int num[]) {
		for (int index = 0; index < num.length; index++) {
			System.out.print(num[index]+" ");
		}

	}
	
	void reverseDisplay(int num[]) {
		System.out.println();
		for (int index=num.length-1; index >=0; index--) {
			System.out.print(num[index]+" ");
		}

	}

	public static void main(String[] args) {
		int num[] = { 1, 3, -4, 7, 9, 6 };
		ArrayBasic arrayBasic = new ArrayBasic();
		int maxNum = arrayBasic.maximum(num);
		System.out.println(maxNum);

		int minNum = arrayBasic.minimum(num);
		System.out.println(minNum);

		int sum1 = arrayBasic.sum(num);
		System.out.println(sum1);

		int average1 = arrayBasic.average(num);
		System.out.println(average1);

		arrayBasic.display(num);
		
		arrayBasic.reverseDisplay(num);
	}

}
