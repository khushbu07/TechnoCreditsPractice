package ArrayBasic;

public class FindTwoArrayEqualorNot {

	public static void main(String[] args) {

		int a1[] = { 1, 3, 5, 7 };
		int a2[] = { 1, 3, 5, 6 };
		
		boolean isEqual= true;
		if(a1.length==a2.length){
			for(int i=0;i<a1.length;i++){
			if(a1[i]!=a2[i]){
			isEqual=false;
			break;
		}}}
		
		if(isEqual)
			System.out.println("Arrays are Equal");
		else
			System.out.println("Arrays are not Equal");
}
}