

package ArrayBasic;

public class MissingNumInArray2 {


	public static void main(String[] args) {
		int arr[]= {10,11,12,14,15,20};
		missingNumber(arr,10,20);
		
		
}
	
	public static void missingNumber(int arr[],int strt,int endNum) {
		for(int i =strt;i<endNum;i++) {
			boolean flag=true;
			for(int num:arr) {
				if(num==i) {
					flag=false;
					break;
				}
	}
		
		if(flag) {
			System.out.println("Missing number : "+i);
		}
		
	}
}}