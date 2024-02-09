interface Movable {
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}

class MovablePoint implements Movable {

	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		y=y+ySpeed;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		y=y-ySpeed;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		x=x-xSpeed;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		x=x+xSpeed;
	}
	
	void displayPos() {
		System.out.println("( "+x+","+y+" )");
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}


	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		System.out.println();
	}
}

class MovableCircle implements Movable {
	int radius;
	MovablePoint center;
	
	MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MovablePoint(x,y,xSpeed,ySpeed);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		center.moveUp();
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		center.moveRight();
	}

}

public class InterfaceAssignment {
	public static void main(String[] args) {
		Movable center = new MovablePoint(0, 0, 5, 10);
		Movable circle = new MovableCircle(0, 0, 0, 0 ,10);
		center.displayPos();
		
	}
}
