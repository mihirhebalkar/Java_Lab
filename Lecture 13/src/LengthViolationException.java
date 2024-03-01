
public class LengthViolationException extends Exception{
	String message;
	
	public LengthViolationException(String message) {
		super(message);
	}
}
