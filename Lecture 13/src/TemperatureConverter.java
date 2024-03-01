import java.util.Scanner;

public class TemperatureConverter {
	
	String temperature;
	
	public float convertToF(String temp) {
		float celsius = Float.parseFloat(temp);
		float fahrenheit = (9 * celsius)/5 + 32;

		return fahrenheit;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TemperatureConverter t = new TemperatureConverter();
		
		System.out.print("Enter your temperature in Celsius(float) : ");
		t.temperature = sc.next();
		
		try {
			checkTemperatureType(t.temperature);
			float f = t.convertToF(t.temperature);
			checkTemperatureRange(f);
			System.out.println("Converted : " + f + " F");
			
		} catch(OutOfRangeTemperatureException e) {
			e.printStackTrace();
		} catch(InvalidTemperatureException e) {
			e.printStackTrace();
		}

	}
	
	static void checkTemperatureRange(float temp) throws OutOfRangeTemperatureException {
		if(temp>100 || temp<-100) {
			throw new OutOfRangeTemperatureException("Range Exceeded!");
		} else {
			System.out.println("Correct Range Entered!");
		}
	}
	
	static void checkTemperatureType(String temp) throws InvalidTemperatureException {
	    float value;
	    try {
	        value = Float.parseFloat(temp);
	    } catch (NumberFormatException e) {
	        throw new InvalidTemperatureException("Please enter a valid float value!");
	    }

	    if (!Float.isFinite(value)) {
	        throw new InvalidTemperatureException("Please enter a valid finite float value!");
	    } else {
	        System.out.println("Valid input!");
	    }
	}

}
