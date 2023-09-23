package multiThreading;

public class Employee2 extends Thread {
	
	
	@Override
	public void run(){
		processData();
	}
	
	void processData(){
		for(int i=101;i<=200;i++){
			System.out.println("Employee1 :"+i);
		}
	}

}
