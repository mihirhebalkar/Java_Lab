abstract class Remote {
	static int noofRemotes = 0;
	
	Remote() {
		noofRemotes++;
	}
	
	abstract void on();
	abstract void off();
	
	static void displayRemotes() {
		System.out.println("\nTotal remotes : " + noofRemotes);
	}
}


class TV extends Remote {

	
	@Override
	void on() {
		// TODO Auto-generated method stub
		System.out.println("TV is on");
		
	}

	@Override
	void off() {
		// TODO Auto-generated method stub
		System.out.println("TV is Off");
	}
	
	void increaseVolume() {
		System.out.println("Volume increased.");
	}
	void decreaseVolume() {
		System.out.println("Volume decreased.");
	}
	
	
}

class AC extends Remote {

	int roomTemp = 21;
	@Override
	void on() {
		// TODO Auto-generated method stub
		System.out.println("\nAC is on");
	}

	@Override
	void off() {
		// TODO Auto-generated method stub
		System.out.println("AC is off");
	}
	
	void increaseTemp() {
		roomTemp++;
		System.out.println("\nTemp increased.");
		System.out.println("Temp : " + roomTemp + "\n");
	}
	void decreaseTemp() {
		roomTemp--;
		System.out.println("\nTemp decreased.");
		System.out.println("Temp : " + roomTemp + "\n");
	}
	
}

public class AbstractionRemote {
	public static void main(String[] args) {
		TV tv1 = new TV();
		AC ac1 = new AC();
		
		tv1.on();
		tv1.increaseVolume();
		tv1.off();
		
		ac1.on();
		ac1.decreaseTemp();
		ac1.off();
		
		Remote.displayRemotes();
	}
}


