package InterviewAsked;

public class DecimalSeparation {

	public static void main(String[] args) {
		String s = "132567.45";
		int i = Integer.parseInt(s.substring(0, s.indexOf(".")));
		System.out.println(i); // 132

	}

}
