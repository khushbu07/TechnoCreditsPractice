package PatternByTapAcademy;

public class IncreasedRectangle {

	public static void main(String[] args) {
 
		int n=5;
		
		for(int i=0;i<n;i++) {
			int count=i+1;
			for(int j=0;j<n;j++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}


	}

}
