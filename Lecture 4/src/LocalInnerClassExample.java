
public class LocalInnerClassExample {
	//also called methodlocal
	void outerMethod() {
		final int outerVariable = 5;
		
		class LocalInner {
			void display() {
				System.out.println("Local Inner Class method\nOuter variable : "+ outerVariable);
			}
		}
		//create instance of class inside method i.e locally.
		LocalInner localInner = new LocalInner();
		
		localInner.display();
	}
	
	public static void main(String[] args) {
		LocalInnerClassExample outer = new LocalInnerClassExample();
		outer.outerMethod();
	}
}

