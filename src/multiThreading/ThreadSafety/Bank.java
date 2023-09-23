package multiThreading.ThreadSafety;

public class Bank {

	

	synchronized void deposit() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + " :" + i);
		}
	}

}
