package RemoveDuplicates;

public class RemoveDuplicatesFromSortedArray {
	
	
	public static int removeDuplicate(int a[]) {
	
		
		int  rd=0;
		for(int i=1;i<a.length;i++) {
			if(a[rd]!=a[i]) {
				rd++;
				a[rd]=a[i];
			}
		}
		
		return rd+1;
	}

	public static void main(String[] args) {
		int a[]= {2,2,3,3,4,5,5,6};
		int rd=removeDuplicate(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
