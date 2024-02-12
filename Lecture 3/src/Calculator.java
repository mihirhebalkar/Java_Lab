public class Calculator {
    public static void main(String[] args) {
        Calculatorfunc calc = new Calculatorfunc();
        calc.setOp1(10);
        calc.setOp2(5);

        System.out.println("The Addition is: " + calc.add(calc.getOp1(), calc.getOp2()));
        System.out.println("The Multiplication is: " + calc.mul(calc.getOp1(), calc.getOp2()));
        System.out.println("The Division is: " + calc.div(calc.getOp1(), calc.getOp2()));
        System.out.println("The Subtraction is: " + calc.sub(calc.getOp1(), calc.getOp2()));
    }
}

class Calculatorfunc {
    private int op1;
    private int op2;

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    int add(int op1, int op2) {
        return op1 + op2;
    }
    
    int mul(int op1, int op2) {
    	return op1 * op2;
    }
    
    float div(int op1, int op2) {
    	return (float) op1 / op2;
    }
    
    int sub(int op1, int op2) {
    	return op1 - op2;
    }
}
