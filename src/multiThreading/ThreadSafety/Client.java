package multiThreading.ThreadSafety;

public class Client {
	      //multithreading envirmont me jab hum thread safty chahte h to..method ko sysnchronized bnate h
			//lock object bank pr lgta h-islye wo sequentailly run hote h
			//synchrozed hmesha method hoti h
			//variable and constructor synchronized nhi hote h
	


	public static void main(String[] args) {
		Bank bank = new Bank();
		Maulik maulik=new Maulik(bank);
		Krishna krishna=new Krishna(bank);
		
		maulik.start();
		krishna.start();
	
	}	

}
