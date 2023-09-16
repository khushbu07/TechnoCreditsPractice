package Strings;

public class ConsecutiveNumberHiPrint {

	public static void main(String[] args) {
	int a[]={1,2,3,5,8,9,11,12,13,14,15,18,19,20};
	
	for(int i=0;i<a.length-2;i++){
		 if(a[i]+a[i+1]+a[i+2]-(3*a[i]+3)==0)
	        System.out.println(a[i]+","+a[i+1]+","+a[i+2]+"--> Hi");
		
	}
	

	}

}
