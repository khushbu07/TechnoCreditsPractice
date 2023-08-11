package Swapping;

public class SwapTwoInt {

	public static void main(String[] args) {
	
		int x=12;
		int y=15;
		
		//using third variable
	
		//1st solu
		int t;
		//t=x;
		//x=y;
		//y=t;
		
		
		//2nd solu
		//x=x+y;//27
		//y=x-y; //12
		//x=x-y; //15
		
		
		//3rd solu
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println(x);
		System.out.println(y);
				

	}

}
