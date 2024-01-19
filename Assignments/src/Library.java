
public class Library {
	
	private String book[];
	private String author[];
	private int isbn[];

	public Library() {
		book = new String[5];
		author = new String[5];
		isbn = new int[5];
	}
	
	public static void main(String[] args) {
		Library l1 = new Library();
		Library l2 = new Library();

	
		l1.book[0]="Atomic Habits";
		l1.author[0]="James Clear";
		l1.isbn[0]=541;
		
		l1.book[1]="Harry Potter";
		l1.author[1]="J.K Rowling";
		l1.isbn[1]=452;
		
		
		l2.book[0]="Atomic";
		l2.author[0]="Clear James";
		l2.isbn[0]=751;
		
		l2.book[1]="Potter";
		l2.author[1]="Just Kidding";
		l2.isbn[1]=950;
		
		
		
	}

}
