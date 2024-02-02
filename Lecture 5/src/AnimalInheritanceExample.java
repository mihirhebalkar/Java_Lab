class Animal {
	String typeofanimal;
	String habitat;
	
	void displayAnimal() {
		System.out.println("Animal class");
		System.out.println("typeofanimal : "+ typeofanimal);
		System.out.println("habitat : " + habitat);
		System.out.println("\n");
	}
}

class Dog extends Animal{
	int nooflegs;
	int age;
	
	void displayDog() {
		System.out.println("Dog class");
		System.out.println("typeofanimal : "+ typeofanimal);
		System.out.println("habitat : " + habitat);
		
		System.out.println("nooflegs : "+ nooflegs);
		System.out.println("age : " + age);
		System.out.println("\n");
	}
}

class Labrador extends Dog {
	boolean isStray;
	int weight;
	
	void displayLabrador() {
		System.out.println("Lab class");
		System.out.println("typeofanimal : "+ typeofanimal);
		System.out.println("habitat : " + habitat);
		
		System.out.println("nooflegs : "+ nooflegs);
		System.out.println("age : " + age);
		
		System.out.println("isStray : "+isStray);
		System.out.println("Weight : " + weight);
		System.out.println("\n");
	}
}


public class AnimalInheritanceExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.typeofanimal = "Mammal";
		dog.habitat = "Land";
		
		dog.nooflegs = 4;
		dog.age = 15;
		
		dog.displayDog();
		
		
		
		Labrador lab = new Labrador();
		
		lab.typeofanimal = "Mammal";
		lab.habitat = "Land";
		
		lab.nooflegs = 4;
		lab.age = 15;
		
		lab.isStray = false;
		lab.weight = 25;
		
		lab.displayLabrador();
			
	}
}
