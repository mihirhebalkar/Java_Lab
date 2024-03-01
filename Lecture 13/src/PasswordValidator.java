import java.util.Scanner;

public class PasswordValidator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password : ");
		String password = sc.next();
		
		try {
			checkPasswordLength(password);
			checkPasswordStrength(password);
			
		} catch (LengthViolationException e){
			e.printStackTrace();
		} catch (WeakPasswordException e) {
			e.printStackTrace();
		}
		
	}
	
	static void checkPasswordLength(String password) throws LengthViolationException {
		if(password.length() < 8) {
			throw new LengthViolationException("Password is short.");
		} else {
			System.out.println("Good Password Length!");
		}
	}
	
	
	static void checkPasswordStrength(String password) throws WeakPasswordException{
		if(!(password.length() > 12)) {
			throw new WeakPasswordException("Not a Strong Password.");
		} else {
			System.out.println("Strong password!");
		}
	}
}
