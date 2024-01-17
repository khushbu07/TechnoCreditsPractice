package ArrayBasic;

public class MajorityElement {

	public static void majority(int a[]) {

		int temp=0;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}

			if (count > (a.length) / 2) {
				temp= a[i];
			
		}
		}
		System.out.println(temp);
		
	}
	
	
	
	public static void main(String[] args) {
		int a[] = { 8, 5, 8, 1, 2, 8, 8 };
		majority(a);

	}
}
