package Strings;

public class SecondLarInString {
//in digit 1025 :second largest print 2
	public static void main(String[] args) {
        int k=1;
		String str = "str1025rts";
		String digit = "";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + ch;

			}
		}

		System.out.println(digit);
		
		int digitArray[]=new int[digit.length()];
		
		for(int i=0;i<digitArray.length;i++) {
			digitArray[i]=digit.charAt(i)-'0';
		}
		
		for(int e:digitArray) {
			System.out.print(e+" ");
		}

		
		for(int i=0;i<digitArray.length;i++) {
			for(int j=i+1;j<digitArray.length;j++) {
				
			if(digitArray[i]<digitArray[j]) {
				int temp=digitArray[i];
				digitArray[i]=digitArray[j];
				digitArray[j]=temp;
				
			}
				
			}
			
		
		System.out.println();
		
//		for(int l=0;l<digitArray.length;l++) {
//			System.out.print(digitArray[l]+" ");
//			
//		}

		if(i==k-1) {
			System.out.println(digitArray[i]);
			break;
		}

}
}
}