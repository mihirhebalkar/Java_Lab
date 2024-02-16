
public class SimpleConstructor {
	int a;
	
	public SimpleConstructor() {
		System.out.println("Default Constructor Called");
		a=10;
	}
	
	public SimpleConstructor(int a) {
		System.out.println("Parameterized Constructor Called");
		this.a=a;
	}
	
	
	public static void main(String[] args) {
		SimpleConstructor constructor = new SimpleConstructor();
		SimpleConstructor constructor1 = new SimpleConstructor(50);
		
		
		System.out.println("Default : " + constructor.a);
		System.out.println("Parameterised : " + constructor1.a);
		
	}
}
