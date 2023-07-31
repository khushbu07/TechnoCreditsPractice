package ArrayBasic;

public class SecondMaxInArray {

	public static void main(String[] args) {

		int a[] = { 26, 39, 5, 60, 400, 671, 456, 1000 };

		int max = a[0]; //2
		int sMax = a[1];  //3
		for (int i = 2; i < a.length; i++) {
			if (a[i] > max) {
				sMax = max; //2
				max = a[i]; //5
			} else if (a[i] > sMax) {
				sMax = a[i];

			}
		}
		System.out.println("Second Max :" + sMax);
	}

}
