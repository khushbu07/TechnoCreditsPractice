package Integers;

public class FactorialNum {

	public static void main(String[] args) {

		System.out.println(facto(5));
	
	}

	public static int facto(int num) {
		
		if(num==0){
			return 1;
		}

		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact = fact * i;

		}
		  return fact;
	}

}
