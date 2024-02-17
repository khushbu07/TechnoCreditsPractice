package CustomException;

public class AgeNotException extends RuntimeException {
	
	//if want to  create custom exception,extends class from exception hierarchy 
	//and make the constructor of that class default constructor / parameterized constructor.
	
	AgeNotException(){
		super();
	}
	
	AgeNotException(String message){
		super(message);
	}
	

}
