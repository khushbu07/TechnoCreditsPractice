package InterviewAsked;

public class Coforge2 {

	public static void main(String[] args) {
//		Question3. Write a java program to given array arr[1,2,3,4] to multiple three number and ignore one for next ignore another one number and continue same 
//		so we will get output [24,12,8,6]
		int a[]= {1,2,3,4};
		int result[]=new int[a.length];
		for(int i=0;i<a.length;i++) { //i=2
			int temp=1;
			for(int j=0;j<a.length;j++) { //j=0
				if(i!=j) {
					temp=temp*a[j]; //2*3*4//1*3*4//1*2*4
				}
			}
			
			result[i]=temp;
		}
	
		for(int r:result) {
			System.out.print(r+" ");
		}
	}

}
