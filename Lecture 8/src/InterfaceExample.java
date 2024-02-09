interface Switchable {
	void turnOn();
	void turnOff();
}

class Fan implements Switchable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Fan is ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Fan is OFF");
	}
	
}

class Television implements Switchable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV is ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV is OFF");
		
	}
	
}

public class InterfaceExample {
	
	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.turnOn();
		
		Switchable fan1 = new Fan();
		fan1.turnOn();
		Switchable tv1 = new Television();
		tv1.turnOn();
	}
}
