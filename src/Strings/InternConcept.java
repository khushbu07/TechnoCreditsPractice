

package Strings;

public class InternConcept {

	public static void main(String[] args) {
		String str1="abc";
		String str2=new String("abc");
		str2=str2.intern();
		String str3="abc";
		String str4=new String("abc");
		
		String str=" A";
		
		System.out.println(str.isBlank()); //letter chk kregi only
		System.out.println(str.isEmpty()); //empty mtlb ""
		
	//System.out.println(str1.compareTo(str2));
	
       // System.out.println(str1==str2);
	

	}

}
