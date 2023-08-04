package ArrayBasic;
import java.util.Arrays;

public class SmallestLargest {

	public static void main(String[] args) {
		
     int num[]={1,5,11,45,980};
     
      int largest=num[0];
      int smallest=num[0];
       
      for(int i=1;i<num.length;i++){
    	  
    	  if(num[i]>largest){
    		  largest=num[i];
    		  
    	  }
    	  else   if(num[i]<smallest){
    		  smallest=num[i];
    		  
    	  }
    		  
      }
       
      System.out.println("Print given array :" +Arrays.toString(num));
      System.out.println("Largest num : "+largest);
      System.out.println("Smallest num : "+smallest);

	}

}
