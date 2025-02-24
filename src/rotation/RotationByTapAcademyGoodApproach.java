package rotation;

public class RotationByTapAcademyGoodApproach {
	
	//left rotate : rotate once then call loop no of required rotation
	//right rotate : when value is negative then it will rotate right
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5 };
		
		System.out.println("Before rotate ");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
		
		rotate(a,4);
		
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
		for (int i = 1; i<=k; i++) {
			rotateOne(a);
		}
		
	}

	

	public static void rotateOne(int a[]) {

		int temp = a[0];
		for (int i = 1; i <a.length; i++) {
			a[i - 1] = a[i];
		}
		a[a.length - 1] = temp;
	}

}
