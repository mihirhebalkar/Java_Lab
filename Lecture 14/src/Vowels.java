import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your string : ");
		String s1 = sc.nextLine().toLowerCase();
		int c=0;
		for(int i=0;i<s1.length();i++) {
			
			char ch = s1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				c++;
			}
		}
		
		System.out.println("Number of vowels = " + c);
		
	}
}
