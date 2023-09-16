package Specific.InterSection.InterSection;

public class InterSection {
      
//	Find intersection(common elements) of two arrays.
//	Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
//	arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
//
//	Output: 10.45, 18.35
	
	public static void main(String[] args) {
		double arr1[]={10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double arr2[] = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		getUnionOfArray( arr1, arr2);

	}
	
	
	static void getUnionOfArray(double[] arr1, double[] arr2){
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr1[i]==arr2[j]){
					if(i<j)
					System.out.print(arr1[i]+",");
				}
			}
	}
			

}
}