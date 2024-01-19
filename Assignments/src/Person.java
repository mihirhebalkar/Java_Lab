
public class Person {
	
	private String name;
	private int age;
	private String occupation;
	
	public void printDetails() {
		System.out.println(this.name + " is " + this.age + " years old and is a " + this.occupation);
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "Mihir";
		p1.age = 19;
		p1.occupation = "Student";
		
		p2.name = "John";
		p2.age = 45;
		p2.occupation = "Engineer";
		
		p3.name = "Doe";
		p3.age = 28;
		p3.occupation = "Teacher";
		
		p1.printDetails();
		p2.printDetails();
		p3.printDetails();
	}
}
