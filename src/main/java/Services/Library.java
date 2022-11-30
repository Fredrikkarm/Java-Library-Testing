package Services;

import book.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static ArrayList<Book> listOfBooks = new ArrayList<Book>();
    static{
        Book book1 = new Book("The Sword in the Stone","Adventure", "Wolfgang Reitherman","1969-12-18", "3.5", 149, true);
        Book book2 = new Book("Pippi in the South Seas", "Kids", "Astrid Lindgren", "1975-09-010", "4", 169, false);
        Book book3 = new Book("Bambi", "Kids", "Walt Disney", "1942-08-09", "4", 99, true);
        Book book4 = new Book("Harry Potter and the Order of the Phoenix", "Fantasy","J.K. Rowling", "2003-06-21", "4.5", 249, true);
        Book book5 = new Book("The Fellowship of the Ring", "Fantasy","J.R.R. Tolkien","1954-07-29", "4", 249, false);
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
    }
    public List<Book> getBooksFromLibrary(){
        return listOfBooks;
    }
}
