
public class WrapperExample {

	public static void main(String[] args) {
		int a=20;
		Integer i = Integer.valueOf(a);
		Integer j = a;
		
		int x1 = j.intValue();
		int x2 = j;
		float f1 = j.floatValue();
		float f2 = j;
		double d1 = j;
		long l1 = j;
		System.out.println("Autoboxing : " + a + " " + i + " " + j);
		System.out.println("Auto-Unboxing : " +x1 + " " + f1 + " " +x2 + " " + f2 + " " + d1+" "+ l1);
	}
}
