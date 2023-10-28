package Assignments.collectionRelated;

public class Assignment47 {
//
//Replace second last occurance of "Hi" with your name.
//String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
//output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno
//
//Hint :
//1) lastIndexOf()
//2) subString()
//3) replace
	public static void main(String[] args) {
		String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		
		String arr[]=msg.split(" ");
		int count=0;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i].equals("Hi")){
				count++;
				if(count==2){
					arr[i]="Maulik";
				}
			}
		}

		
		String output="";
		for(String e:arr){
			output=output+e+" ";
		}
		
		System.out.println(output.trim());
	}

}
