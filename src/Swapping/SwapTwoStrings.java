package Swapping;

public class SwapTwoStrings {

	public static void main(String[] args) {
		
		
	String a="Hello";
	String b="World";
	
	System.out.println("Before Swapping ");
	
	System.out.println("Before Swapping a :"+a);
	System.out.println("Before Swapping b :"+b);
	
	
	a=a+b;  //helloworld
	//b=a.substring(5);
	b=a.substring(0,(a.length()-b.length()));
	a=a.substring(b.length());
	
	
	System.out.println("after Swapping a :"+a);
	System.out.println("after Swapping b :"+b);
	}

}
