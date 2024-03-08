import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or paragraph:");

        String input = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
        String[] words = input.split("\\s+");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency Count:");
        wordFrequencyMap.forEach((word, frequency) ->
                System.out.println(word + ": " + frequency));
    }
}
