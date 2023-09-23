package Strings;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "#$%^&*) h099(MONA))(_:?";

		s=s.replaceAll("[^A-Z0-9a-z]", "");
		System.out.println(s);
	}

}
