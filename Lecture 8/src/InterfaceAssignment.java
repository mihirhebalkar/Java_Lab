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

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        y = y - ySpeed;
    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
    }

    void displayPos() {
        System.out.println("( " + x + "," + y + " )");
    }

    @Override
    public String toString() {
        return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
    }
}

class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    void displayPos() {
        System.out.println("Center position: ( " + center.x + ", " + center.y + " )");
    }

    @Override
    public String toString() {
        return "MovableCircle [radius=" + radius + ", center=" + center + "]";
    }
}

public class InterfaceAssignment {
    public static void main(String[] args) {
        Movable center = new MovablePoint(0, 0, 5, 10);
        Movable circle = new MovableCircle(0, 0, 0, 0, 10);

        // Display positions
        ((MovablePoint) center).displayPos(); // Cast to MovablePoint to access displayPos
        ((MovableCircle) circle).displayPos(); // Cast to MovableCircle to access displayPos
    }
}
