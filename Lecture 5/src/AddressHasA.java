
public class AddressHasA {

	String addressLine1;
	String addressLine2;
	int pincode;

	public AddressHasA(String addressLine1, String addressLine2, int pincode) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressHasA [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", pincode=" + pincode
				+ "]";
	}
	

}
