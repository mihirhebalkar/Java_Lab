import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String s = sc.nextLine();

        String rs = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rs += s.charAt(i);
        }
        
        rs = rs.substring(0,1).toUpperCase() + rs.substring(1);
        
        System.out.println("Reversed String plus first Letter capital : " + rs);
    }
}
