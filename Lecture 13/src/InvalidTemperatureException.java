// check datatype
public class InvalidTemperatureException extends Exception {
	String message;
	
	public InvalidTemperatureException(String message) {
		super(message);
	}
}
