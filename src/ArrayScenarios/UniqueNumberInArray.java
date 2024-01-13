package ArrayScenarios;

import java.util.Arrays;
import java.util.List;

public class UniqueNumberInArray {

	public static void main(String[] args) {
//		//Input:
//		{4,7,8,5,4,5}
//		Output:
//		{7,8}
		
		Integer a[]={4,7,8,5,4,5};
	
		List<Integer> list=Arrays.asList(a);
		
		for(Integer num:list) {
			//if(Arrays.asList(a).indexOf(num)==Arrays.asList(a).lastIndexOf(num))
				if(list.indexOf(num)==list.lastIndexOf(num))
			{
				System.out.print(num+" ");
			}
		}


	}}
	
	
//public class UniqueNumberInArray {
//    public static void main(String[] args) {
//        Integer[] a = {4, 7, 8, 5, 4, 5};
//        for (Integer integer : a) {
//            if (Arrays.asList(a).indexOf(integer) == Arrays.asList(a).lastIndexOf(integer)) {
//                System.out.print(integer + " ");
//            }
//        }
//    }
//}


