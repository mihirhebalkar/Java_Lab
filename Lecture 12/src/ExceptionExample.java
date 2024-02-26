
public class ExceptionExample {
	public static void main(String[] args) {
		
		
		int[] arrayA = new int[2];
		arrayA[0] = 1;
		arrayA[1] = 2;
		

		try {
			System.out.println(arrayA[2]); //only suspected line
			int i = 50;
			int c = i/0;
			
		} catch (ArithmeticException e){
			System.out.println(e);
			
		} catch (ArrayIndexOutOfBoundsException e) { // or catch(Exception e)
			System.out.println(e);
			System.out.println("Exception Occurred!");
		}
		
		System.out.println("Output : ");
		System.out.println(arrayA[1]);
		System.out.println(arrayA[0]);
		


	}
}
