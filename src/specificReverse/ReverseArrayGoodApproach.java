package specificReverse;

public class ReverseArrayGoodApproach {

	public static void main(String[] args) {
	
		int a[]= {2,4,6,8,10,12};
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		
		for(int num:a) {
			System.out.print(num+" ");
		}
	}

}
