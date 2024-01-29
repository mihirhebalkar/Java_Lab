
public class StaticInnerClassExample {
	private static int outerStaticVariable = 5;
	
	
	static class StaticNested {
		void display() {
			//can access only static members
			System.out.println("Static Nested class method,\nOuter class variable is : " + outerStaticVariable);	
		}
	}
	
	void useStaticNestedClass() {
		StaticNested staticNestedObject = new StaticNested();
		staticNestedObject.display();
	}
	public static void main(String[] args) {
		
		//directly(doesn't need instance of outer class)
		StaticInnerClassExample.StaticNested directStaticNestedObject = new StaticNested();
		directStaticNestedObject.display();
		
		//using outer class
		StaticInnerClassExample s1 = new StaticInnerClassExample();
		s1.useStaticNestedClass();
	}
}
