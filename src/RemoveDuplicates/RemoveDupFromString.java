package RemoveDuplicates;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupFromString {

	public static void main(String[] args) {
		String input = "automation";
		// Output = automin

		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < input.length(); i++) {
			char ch=input.charAt(i);
			set.add(ch);
	
		}

		for(char c :set) {
			System.out.print(c);
		}
		
	}

}
