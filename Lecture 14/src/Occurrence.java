import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String s1 = sc.nextLine().toLowerCase();

        System.out.print("Enter letter to find: ");
        char key = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (key == ch) {
                count++;
            }
        }

        System.out.println("Number of occurrences of " + key + " : " + count);
    }
}
