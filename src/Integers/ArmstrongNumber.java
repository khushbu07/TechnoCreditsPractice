package Integers;

public class ArmstrongNumber {
	// 0 and 9 are also armstrong number
	// 1634-1^4+6^4+3^4+4^4
	//
	public static void main(String[] args) {
		System.out.println(power(153));
		System.out.println(isArmStrong(153));
		// System.out.println(isArmStrong(154));
		// System.out.println(isArmStrong(1634)) ;
		// System.out.println(isArmStrong(371));
		// System.out.println(isArmStrong(8));
		// System.out.println(isArmStrong(-8));
	}

	static boolean isArmStrong(int num) {

		if (num < 0) {
			return false;
		}

		if (num >= 0 && num <= 9) {
			return true;
		}

		int orgNum = num;
		int sum = 0;
		int power = power(num);
		while (num!= 0) {
			int d = num % 10;
			int factor = 1;
			for (int i = 0; i < power; i++) {
				factor = factor * d;
			}

			sum = sum + factor;
			num = num / 10;
		}
		if (sum == orgNum) {
			return true;
		}
		return false;

	}

	private static int power(int num) {

		int n = 0;
		while (num != 0) {
			n++;
			num = num / 10;
		}
		return n;
	}
}