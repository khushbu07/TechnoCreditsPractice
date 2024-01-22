package InterviewAsked;

public class Accolite3 {

	//find the index of first and last index of 5 in sorted array
	public static void main(String[] args) {
		int a[]= {1,3,5,5,5,5,67,123};
		int fIndex=0;
		int lIndex=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==5) {
				fIndex=i;
				break;
			}
		}
		for(int j=a.length-1;j>=0;j--) {
			if(a[j]==5) {
				lIndex=j;
				break;
			}
		}

		System.out.println(fIndex+","+lIndex);
	}
	
	public static void getFirstAndLastIndex(int a[],int targetElement) {
		
		
		
	}
	
	

}
