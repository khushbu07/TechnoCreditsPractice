package ArrayScenarios;

public class MultiplyArrayElements {
//	Write a java program to given array arr[1,2,3,4] to multiple three number and ignore one for next ignore another one number and 
//	continue same so we will get output [24,12,8,6]
	public static void main(String[] args) {

      int arr[]={1,2,3,4};
      int result[]=new int[arr.length];
      for(int i=0;i<arr.length;i++){
    	  int temp=1;
    	  for(int j=0;j<arr.length;j++){
    		  if(j!=i){
    			  temp=temp*arr[j];//
    		  }
    	  }
      
      result[i]=temp;
      }
      
      for(int itr:result){
    	  System.out.print(itr+" ");
      }
	}

}
