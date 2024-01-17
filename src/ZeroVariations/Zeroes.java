package ZeroVariations;



public class Zeroes {
 //codewithrajranjan
	public static void main(String[] args) {
		int a[]= {1,0,0,1,1,0,1,1,0,1};
		
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
		int leftele=a[i];
		int rgtele=a[j];
		if(leftele==0) {
			i++;
		}
		if(rgtele==1) {
			j--;
		}
		
		if(leftele==1 && rgtele==0) {
			a[i]=rgtele;
			a[j]=leftele;
			i++;
			j--;
		}
		}

	for(int r:a) {
		System.out.print(r+" ");
	}
		
	}

}
