

package ZeroVariations;

public class TapAcademy {

	public static void main(String[] args) {
		
		
		 int arr[] = {0, 1, 2, 0, 4, 3, 0, 5, 0 };
		//int arr[] = {0, 1,  };
		int size=arr.length;
		if(size==0 || size==1) {
			return;
		}
		
		int nz=0;
		int z=0;
		while(nz<size) {
			if(arr[nz]!=0) {
				int temp=arr[nz];
				arr[nz]=arr[z];
				arr[z]=temp;
				nz++;
				z++;
				
			}
			else {
				nz++;
			}
		}

		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
