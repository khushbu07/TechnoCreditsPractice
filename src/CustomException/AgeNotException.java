package CustomException;

public class AgeNotException extends Exception {
	
	//if want to make create custom exception,extends class from exception hierarchy 
	//and make the constructor of that class default constructor or parameterized constructor.
	
	AgeNotException(){
		super();
	}
	
	AgeNotException(String message){
		super(message);
	}
	

}
