
class Vehicle {
	
	String modeoftransport;
	int manufacturingYear;

	void displayVehicle() {
		System.out.println("manufacturingYear" + manufacturingYear);
	}
}

class Car extends Vehicle {
	
	int noofWheels;
	String manufacturer;
	
	void displayCar() {
		System.out.println("manufacturingYear : " + manufacturingYear);
		System.out.println("noofWheels : " + noofWheels);
		System.out.println("manufacturer : " + manufacturer);
	}
	

}

class SportsCar extends Car {

	int topspeed;
	boolean isConvertible;
	
	void displaySportsCar() {
		System.out.println("manufacturingYear : " + manufacturingYear);
		System.out.println("noofWheels : " + noofWheels);
		System.out.println("manufacturer : " + manufacturer);
		System.out.println("topspeed : "+ topspeed);
		System.out.println("isConvertible : " + isConvertible);
	}
	
}


public class MultiLevelInheritanceExample {
	public static void main(String[] args) {		
		SportsCar sports = new SportsCar();
		

	}
}

