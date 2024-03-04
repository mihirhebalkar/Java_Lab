import java.util.Scanner;

public class RaggedArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        int[][] raggedArray = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int numElements = scanner.nextInt();

            raggedArray[i] = new int[numElements];

            System.out.println("Enter the elements for row " + (i + 1) + ":");
            for (int j = 0; j < numElements; j++) {
                raggedArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ragged Array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
