package InterviewAsked;

public class Impetus {

	public static void main(String[] args) {
		String str="aabbccc";
		//output=a2b2c3;
		int aCount=0;
		int bCount=0;
		int cCount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				aCount++;
			}
			else if (str.charAt(i)=='b') {
				bCount++;
			}
			else if(str.charAt(i)=='c') {
				cCount++;
			}
		}
		System.out.println("a"+""+aCount+"b"+""+bCount+"c"+""+cCount);
	}

}
