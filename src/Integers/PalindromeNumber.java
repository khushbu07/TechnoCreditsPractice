package Integers;

public class PalindromeNumber {

	public static void main(String[] args) {
		isPlaindrome(12345);
		isPlaindrome(1221);
	}

	static void isPlaindrome(int num) {
        int orgNum=num;
		int rev = 0;
		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if(orgNum==rev){
			System.out.println(orgNum+" is plaindrome");
		}
		else{
			System.out.println(orgNum+" is not plaindrome");
		}
			
		

	}
}