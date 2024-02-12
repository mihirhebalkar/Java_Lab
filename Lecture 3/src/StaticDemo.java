
class StaticDemon {
	static int count = 0;
	
	int a = 10;
	
	public StaticDemon(int a) {
		
		System.out.println("New Object created");
		this.a = a;
		count++;
	}
	
	static int returnCount() {
		return count;
	}
	
}


public class StaticDemo {
	
	public static void main(String[] args) {
		StaticDemon s1 = new StaticDemon(10);
		System.out.println(StaticDemon.returnCount());
		
		StaticDemon s2 = new StaticDemon(10);
		System.out.println(StaticDemon.returnCount());
		
		StaticDemon s3 = new StaticDemon(10);
		System.out.println(StaticDemon.returnCount());
		
		StaticDemon s4 = new StaticDemon(10);
		System.out.println(StaticDemon.returnCount());
		
		
	}
	
}
