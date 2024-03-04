import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String s = sc.nextLine();
		
		String rs ="";
		
		for(int i=0;i<s.length();i++) {
			rs+=s.charAt(5-i-1);
		}
		System.out.println("Reversed String : " + rs);
		
	}
}
