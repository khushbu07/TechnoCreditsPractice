package multiThreading;

public class Employee1 extends Thread {
	
	
	//Thread class has start method,that starts thread
	//start method has run method that has nothing,thats why we hv to override run method
	@Override
	public void run(){
		processData();
	}
	
	void processData(){
		for(int i=1;i<=100;i++){
			System.out.println("Employee1 :"+i);
		}
	}

}
