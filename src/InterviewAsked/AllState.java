package InterviewAsked;

public class AllState {

	public static void main(String[] args) {
		int a[] = { 2, 3, 3, 1, 2, 3, 4, 5, 6, 6, 7, 8, 8 };
//		{2,3}
//		{1,2,3,4,5,6}
//		{7,8}

		for (int i = 0; i < a.length-1; i++) {
			 if(a[i]==a[i+1]) {
				 System.out.print(a[i]+" "); 
				System.out.println();
				i++;
				
			 }
			 else {
				 System.out.print(a[i]+" "); 
			 }
			
			
			
			
			

		}

	}
}