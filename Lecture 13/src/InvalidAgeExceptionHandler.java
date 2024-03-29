import java.util.Scanner;

public class InvalidAgeExceptionHandler {
	
	public static void main(String[] args) {
		System.out.print("Enter your age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}

	}
	

	static void checkAge(int a) throws InvalidAgeException {
		if (a < 18) {
			throw new InvalidAgeException("Age less than 18");
		} else {
			System.out.println("Welcome!");
		}
	}	
}
