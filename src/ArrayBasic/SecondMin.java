package ArrayBasic;

//Find second maximum from array without sorting the array.

public class SecondMin {

	public static void main(String[] args) {

		int a[] = { 9,11,3,17,14,99};
      //sort 3,9,11,14,17,99
		int count = 0;
        
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					count++;
				}
				
			}
		
        if (count ==2) {
		  System.out.println("Second Min Value : " + a[i]);
		}
	}
	}
}
