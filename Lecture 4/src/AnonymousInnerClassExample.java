//Interface with a single method
interface Calculator {
	int performOperation(int a, int b);
}
public class AnonymousInnerClassExample {
	
	public static void main(String[] args) {
		
		Calculator addition = new Calculator() {
			
			@Override
			public int performOperation(int a, int b) {
				return a + b;
			}
		};	
		int result =  addition.performOperation(5,93);
		System.out.println(result);
	}	
}
