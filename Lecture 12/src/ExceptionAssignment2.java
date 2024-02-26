import java.util.Scanner;

public class ExceptionAssignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer in the format of a string: ");
        String inputString = sc.nextLine();

        try {
            int convertedNumber = Integer.parseInt(inputString);
            System.out.println("Successfully converted to integer: " + convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred!");
            System.out.println(e);
        }
    }
}
