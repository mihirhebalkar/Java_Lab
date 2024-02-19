import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> intVector = new Vector<Integer>();
		
		// Collection use wrapper classes.
		intVector.add(1);
		intVector.add(2);
		intVector.add(3);
		intVector.add(4);
		
		intVector.remove(2);
		
		System.out.println("\nPrinting Vector elements : ");
		for (int i : intVector) {
			System.out.println(i);
		}
	}
}
