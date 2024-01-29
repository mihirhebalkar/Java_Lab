
public class InnerClassExample {
	
	private int outerVariable= 10;
	
	public int getOuterVariable() {
		return outerVariable;
	}
	
	
	class Inner {
		public void displayOuterVariable() {
			System.out.println("I am method of Inner Class");
			System.out.println("Value of outer class variable is "+ outerVariable);
		}
	}
	
	//InnerClass example is an outer class
	//to use inner class methods, we have to use an instance of outer class.
	public static void main(String[] args) {
		InnerClassExample o1 = new InnerClassExample();
		System.out.println("Using outer class method : " + o1.getOuterVariable());
		
		InnerClassExample.Inner i1 = o1.new Inner();
		System.out.println("\nUsing inner Class : ");
		i1.displayOuterVariable();
	}
}
