import java.util.Scanner;

public class ExceptionAssignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter integer 1 value : ");
        num1 = sc.nextInt();

        System.out.println("Enter integer 2 value : ");
        num2 = sc.nextInt();

        try {
            int ans = num1 / num2;
            System.out.println("Answer generated without exception : " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred!");
            System.out.println(e);
        }
    }
}
