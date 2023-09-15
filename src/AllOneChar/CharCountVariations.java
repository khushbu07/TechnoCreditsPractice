package AllOneChar;

public class CharCountVariations {
	
	//Particular char count
	 static void particularCharCount(String str,char ch){
		int count=0;
		for(int index=0;index<str.length();index++){
			if (str.charAt(index)==ch){
				count++;
				}
		}
		System.out.println(str+"-->"+ch+": "+count);
	}
	 //char count in string
	 static void everyCharCount(String str){
		 for(int index=0;index<str.length();index++){
			 int count=0;
			 char ch=str.charAt(index);
			 if(str.indexOf(ch)==index){
			 for(int j=0;j<str.length();j++){
				 if(str.charAt(j)==ch){
					 count++;
				 }
			 }
			 System.out.println(str+"-->"+ch+": "+count);
			 }
		 }
	 }
	 //particular char count in array element
	 static void particularCharCountInArray(String str[],char ch){
		  for(int i=0;i<str.length;i++){
			  particularCharCount(str[i],ch);
		  }
		  
	  }
	 //every char count in Array
	 static void everyCharCountInArray(String arr[]){
		 for(int i=0;i<arr.length;i++){
			 everyCharCount(arr[i]);
		 }
		 
	 }
 
	public static void main(String[] args) {
		
        String arr[]={"Mona","AkshAy","ShreSa", "Mahaviri"};
		String str = "MonalikaaJinJain";
		particularCharCount(str,'J');
		System.out.println("===================");
	    everyCharCount(str);
		System.out.println("=========Array Scenarios=========");
		particularCharCountInArray(arr,'a');
		System.out.println("===================");
		everyCharCountInArray(arr);
	}

}
