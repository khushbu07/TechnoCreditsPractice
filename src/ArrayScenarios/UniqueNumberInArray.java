package ArrayScenarios;

import java.util.Arrays;

public class UniqueNumberInArray {

	public static void main(String[] args) {
//		//Input:
//		{4,7,8,5,4,5}
//		Output:
//		{7,8}
		
		Integer a[]={4,7,8,5,4,5};
	
		for(Integer num:a) {
			if(Arrays.asList(a).indexOf(num)==Arrays.asList(a).lastIndexOf(num)) {
				System.out.print(num+" ");
			}
		}


	}}
	
	
	  


