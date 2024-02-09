abstract class Shape {
	static int numberofShapes = 0;
	
	Shape() {
		numberofShapes++;
	}
	
	abstract void draw();
	
	static void displayTotalShapes() {
		System.out.println("Total number of shapes : " + numberofShapes);
	}
	
	void displayInfo() {
		System.out.println("This is a shape.");
	}
}


class Circle extends Shape{

	@Override
	//annotation to access java docs i.e information on how to use
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}
}
class Square extends Shape{
	
	@Override
	//annotation to access java docs i.e information on how to use
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing square");
	}
}


public class AbstractExample { //driver class
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		Square square = new Square();
		
		circle.draw();
		circle.displayInfo();
		
		square.draw();
		square.displayInfo();
		
		Shape square1 = new Square(); //upcasting
		square1.draw();
		Shape circle1 = new Circle();
		circle1.draw();
		
		
		Shape.displayTotalShapes();
	}
}


