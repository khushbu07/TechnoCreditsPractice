package rotation;

public class RightRotateByOnePosition {

	public static void main(String[] args) {

		String str = "ARUN";
		
		char ch[] = str.toCharArray();

		char lastChar = ch[str.length() - 1];
		for (int i = str.length() - 1; i > 0; i--) {
			ch[i] = ch[i - 1];
		}
		ch[0] = lastChar;

		StringBuffer sb = new StringBuffer();
		for (char c : ch) {
			sb.append(c);
		}
		System.out.println(sb);
	}
		

}
