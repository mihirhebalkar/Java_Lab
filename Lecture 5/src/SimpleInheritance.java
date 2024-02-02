class Parent {//pojo class
	int a = 20;
	void displayParent() {
		System.out.println("Parent A = "+ a);
		
	}
}

class Child extends Parent {
	int b = 30;
	
	void displayChild() {
		System.out.println("Parent A = "+ a);
		System.out.println("Child B = "+ b);
	}
}


public class SimpleInheritance {
	
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.a);
		child.displayParent();
	}
	
}
