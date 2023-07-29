package Integers;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 12345;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;// 1234

		}
		System.out.println("Reverse Number : "+rev);
	
	
	
	 int num1=12222298;
	 System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
}


}

