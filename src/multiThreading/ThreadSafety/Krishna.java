package multiThreading.ThreadSafety;

public class Krishna extends Thread {
	Bank bank;

	Krishna(Bank bank) {
		this.bank = bank;

	}

	public void run() {
		bank.deposit();
	}
}
