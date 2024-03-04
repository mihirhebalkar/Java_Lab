import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String s = sc.nextLine().toLowerCase();

        String rs = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rs += s.charAt(i);
        }
        
        if(rs.equals(s)) {
        	System.out.println(s + " is a palindrome.");
        } else {
        System.out.println(s + " is not a palindrome.");
        }
    }
}
