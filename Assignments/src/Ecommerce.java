
public class Ecommerce {
	
	public static void main(String[] args) {
		Product p1= new Product();
		Order o1 = new Order();
		Customer c1 = new Customer();
		
		p1.product = "Watch";
		p1.productID = 12;
		p1.price = 1800.00;
		
		o1.orderID = 12;
		o1.location = "Warehouse";
		
		c1.name = "John";
		c1.address = "B-2 Home";
		c1.phone = 5455431;
		c1.balance = 500;
		
	}
	
}

class Product {
	private String product;
	private int productID;
	private float price;
	
}

class Order {
	private int orderID;
	public String location;
}

class Customer {
	private String name;
	private String address;
	private int phone;
	private int balance;
}
