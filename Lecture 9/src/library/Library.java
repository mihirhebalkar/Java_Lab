package library;


import java.util.Arrays;

import library.model.Book;

public class Library {
	private Book[] book;
	
	
	public Book[] getBook() {
		return book;
	}
	public void setBook(Book[] book) {
		this.book = book;
	}
	public void borrowBook() {
		
	}
	public void addBook() {
		
	}
	@Override
	public String toString() {
		return "Library [book=" + Arrays.toString(book) + "]";
	}
	
	
	
}
