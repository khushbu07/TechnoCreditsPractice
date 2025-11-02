package Strings;

public class IndexFind {
	// Find me the first and last occurrence of the letter ‘a’ in amazonaanazzz with
	// index number
	public static void main(String[] args) {

		String str = "amazonaanazzz";
		
		int ind=str.lastIndexOf('a');
		int fIndex=str.indexOf('a');
		System.out.println(fIndex);
		System.out.println(ind);
		

	}

}
