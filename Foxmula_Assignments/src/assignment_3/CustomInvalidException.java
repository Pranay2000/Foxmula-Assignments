package assignment_3;

public class CustomInvalidException extends Exception {
	
	CustomInvalidException() {
		super("Number is Invalid");
	}
	
	public CustomInvalidException(String msg) {
		super(msg);
	}

}
