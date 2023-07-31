package ASCII;

public class ViceVersa {

	// Do Sum of all numbers and Convert Uppercase into lowercase, lowercase-Assignment32(2)
	// into uppercase using ASCII.
	// Given String = "Te1ch8n9oC6reDi5TS1"
	// Expected String = "30tECHNOcREdIts"

	public static void main(String[] args) {

		String str = "Te1ch8n9oC6reDi5TS1";
		String output = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (Character.isDigit(ch)) {
				sum = sum + Integer.parseInt(String.valueOf(ch));


				
			}
			int temp = ch;
			if (temp >= 65 && temp <= 90) {
				temp = temp + 32;
			} else if (temp >= 97 && temp <= 122) {
				temp = temp - 32;
			}

			output = output+(char) temp;
			
		}

		System.out.println(sum+output);
		System.out.println(sum);
	}
	
}
