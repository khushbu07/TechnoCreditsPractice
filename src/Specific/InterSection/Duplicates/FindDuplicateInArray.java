package Specific.InterSection.Duplicates;

public class FindDuplicateInArray {

	static public void findDupString(String str[]) {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					if (i < j) {
						System.out.println(str[i]+" ");
					}
				}
			}
		}

	}

	static public void findDupNum(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==(arr[j])) {
					if (i < j) {
						System.out.println(arr[i]+" ");
					}
				}
			}
		}

	}
	public static void main(String[] args) {
		String str[]={"gm","gn","yes","yes","hello","gn"};
		findDupString(str);
		
		int a[]={12,16,14,6,5,7,6,45,7};
		findDupNum(a);

	}

}
