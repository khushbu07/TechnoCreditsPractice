package Sorting;

public class LinearSearch {

	public static void main(String[] args) {
       //time complexity : o(n)
		int a[] = { 12, 14, 50, 40, 23 };
		int searchKey=45;
		boolean flag=false;
		 for(int i=0;i<a.length;i++){
			 if(a[i]==searchKey){
				 System.out.println("Element fount at index position :"+i);
				 flag=true;
				 break;
			 }
		 }

		if(flag==false)
			 System.out.println("Element not found in given Array");
		 
	}

}
