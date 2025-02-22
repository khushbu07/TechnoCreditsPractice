package InterviewAsked;

import java.io.IOException;

public class Globant_L {

	public static void main(String[] args) {
		System.out.println(getValue(5));
		
	}
		 public static int getValue(int num){
		    try{
		        int x = num/0;
		        return 1;
		    }
		    catch(ArithmeticException are){
		        return 4;

		    }
		    catch(Exception e){
		        return 3;
		    }

		    finally{
			 	 return 5;
			      }
		}
		 
		 
	

}
