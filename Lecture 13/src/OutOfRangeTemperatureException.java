
public class OutOfRangeTemperatureException extends Exception {

	String message;
	
	public OutOfRangeTemperatureException(String message) {
		super(message);
	}
}
