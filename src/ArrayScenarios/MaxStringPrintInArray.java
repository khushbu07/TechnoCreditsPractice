package ArrayScenarios;

public class MaxStringPrintInArray {

	public static void main(String[] args) {

		String str[]={"Akshay","Monalika","Shubham","sarnot", "Amkb","TeaToastCafe" };
		int MaxStringIndex=0;
		int MaxStringLen=str[0].length();
		for(int i=1;i<str.length;i++){
			if(str[i].length()> MaxStringLen){
				MaxStringIndex=i;
				MaxStringLen=str[i].length();
			}
			System.out.println(str[i].length());
		}
      System.out.println(str[MaxStringIndex]+"-->"+MaxStringLen);
	}

}
