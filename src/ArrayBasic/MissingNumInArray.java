package ArrayBasic;

public class MissingNumInArray {
//	Find the missing number in integer array of 1 to 10? Assignment 30
//	Hint: You have given an integer array which contains numbers from 1 to 10 but exactly one number is missing, 
//you need to write a Java program to find that missing number in an array.
	public static void main(String[] args) {
		//array should not have duplicates 
		//array should be sorted
		//array should be in range
		
		int a[]={1,2,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<a.length;i++){
			 sum=sum+a[i];
		}
        
        int rangeSum=0;
        for(int i=1;i<=10;i++){
        	rangeSum=rangeSum+i;
		}
        
        int missingNum=rangeSum-sum;
        System.out.println("Missing number is : "+missingNum);


	}

}
