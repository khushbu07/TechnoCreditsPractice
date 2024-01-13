package InterviewAsked;

public class Velotio {

	public static void main(String[] args) {
		//Assassination-->Asasination
		
		String str="Assassination";
		String output="";
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)!=str.charAt(i+1)){
				output=output+str.charAt(i);//Asasinatio
			}
			
			
		}
		output=output+str.charAt(str.length()-1);//
		System.out.println(output);
	}

}
