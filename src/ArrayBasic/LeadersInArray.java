package ArrayBasic;

public class LeadersInArray {
	
	//Leader: An element is leader if it is greater than all the ele to its rightside and 
	//the rightmost ele is always leader.

	public static void main(String[] args) {
		int a[] = { 8, 11, 5, 11, 7, 6, 3 };
		optimizeApproach(a);
		System.out.println();
		isLeader(a);
	}

	public static void isLeader(int a[]) {
		for(int i=0;i<a.length;i++) {
			boolean isLeader=true;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<=a[j]) {
					isLeader=false;
					break;
				}
			}
			if(isLeader==true) {
				System.out.print(a[i]+" ");
			}
		}
		
		

	}

	public static void optimizeApproach(int a[]) {
		int currentLeader=a[a.length-1];//3
		System.out.print(currentLeader+" ");
		for(int i=a.length-2;i>=0;i--) {
			if(a[i]>currentLeader) {
				currentLeader=a[i];
				System.out.print(currentLeader+" ");
			}
			
		}
	}
}
