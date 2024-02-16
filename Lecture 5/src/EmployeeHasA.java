
public class EmployeeHasA {
	
	int empId;
	String name;
	
	AddressHasA address;

	public EmployeeHasA(int empId, String name, AddressHasA address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {
		AddressHasA address = new AddressHasA("B-105","B-2",411021);
		EmployeeHasA employee = new EmployeeHasA(120, "Mihir", address);
																		
	}
		
}

