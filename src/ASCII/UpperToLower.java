package ASCII;

public class UpperToLower {

	// Assignment 31 Convert UpperCase into a LowerCase using ASCII
	// Given String = "TechnoCreditS"
	// Expected String = "technocredits"

	public static void main(String[] args) {

		String input = "TechnoCreditS";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int temp = ch;
			
			if (temp >=65 && temp <=90) {
				temp = temp + 32;
				
			} 
//			else if (temp > =97 && temp < =122) {
//				temp = temp - 32;
//			}
			 output=output+(char)temp;
			 
		}
		System.out.println(output);
	}

}
