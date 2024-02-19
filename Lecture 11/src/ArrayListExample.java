import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> listOfWords = new ArrayList<String>();
		// <> stores datatype i.e generics
		
		listOfWords.add("Hello");
		listOfWords.add("World");
		listOfWords.add("I");
		listOfWords.add("am");
		listOfWords.add("Learning");
		listOfWords.add("Java");
		
		System.out.println("ArrayList size = " + listOfWords.size());
		
		listOfWords.add(2,",");
		
		listOfWords.get(2);
		
		System.out.println("\nPrinting ArrayList : ");
		for (String word : listOfWords) {
			System.out.println(word);
		}
	}
}
