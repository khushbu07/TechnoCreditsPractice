package rotation;

public class RotationByTapAcademyGoodApproachReduceComplxityy {

	
	//left rotate : rotate once then call loop no of required rotation
	//right rotate : when value is negative then it will rotate right
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5 };
		
		System.out.println("Before rotate ");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
		
		rotate(a,3);
		
		System.out.println("\nAfter rotate ");
		
		for (int i = 0; i < a.length; i++) {
		
			System.out.print(a[i] + " ");
		}

	}
	
	public static void rotate(int a[],int k) {
		
		k=k%a.length;
		if(k<0) {
			k=k+a.length;
		}
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
		reverse(a,0,a.length-1);	
}	
	public static void reverse(int a[],int start,int end)	{
		
	 while(start<end) {
		 int temp=a[start];
		 a[start]=a[end];
		 a[end]=temp;
		 start++;
		 end--;
	 }
		
	}
	

	

	

}
