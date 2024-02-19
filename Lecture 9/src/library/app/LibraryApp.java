package library.app;

import library.*;
import library.app.*;
import library.model.*;

public class LibraryApp implements Library, Book {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("Mihir");
        book1.setTitle("Java");
        book1.setISBN("154");

        Book book2 = new Book();
        book2.setAuthor("John");
        book2.setTitle("Python");
        book2.setISBN("155");

        Book[] books = new Book[2];

        books[0] = book1;
        books[1] = book2;


        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println(); // Add a line break for better readability
        }
    }
}
