package Assignments;

public class Assignment11 {

	double sum(double x, double y, double z) {
		double sumAns = x + y + z;
		return sumAns;
	}

	double average(double x, double y, double z) {
		double sumAns = sum(x, y, z);
		double avg = sumAns / x + y + z;
		return avg;
	}

	boolean isAnswerAboveExpecation(int avg) {
		boolean flag=false;
		if(avg>50 || avg%2==0){
			flag=true;
		}
     return flag;
	}
	
	boolean getYourGrade(int avg){
		//int avgAnswer=average();
		return false;
	}

	public static void main(String[] args) {
		

	}

}
