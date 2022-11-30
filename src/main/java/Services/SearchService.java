package Services;

import book.Book;

public class SearchService {

    private Book bookNotFound;
    private Library library;

    public SearchService(Library library) {
        this.bookNotFound = new Book();
        this.bookNotFound.setTitle("book not found");
        this.library = library;
    }

    public Book searchTitle(String search){
        for(Book book: library.getBooksFromLibrary()){
            if(book.getTitle().equals(search)){
                return book;
            }
        } return bookNotFound;
    }

    public Book searchGenre(String search){
        for(Book book: library.getBooksFromLibrary()){
            if(book.getGenre().equals(search)){
                return book;
            }
        } return bookNotFound;
    }

    public Book searchAuthor(String search){
        for(Book book: library.getBooksFromLibrary()){
            if(book.getAuthor().equals(search)){
                return book;
            }
        } return bookNotFound;
    }

    public Book searchPublicityDate(String search){
        for(Book book: library.getBooksFromLibrary()){
            if(book.getPublicityDate().equals(search)){
                return book;
            }
        } return bookNotFound;
    }
    public Book searchReviews(String search){
        for(Book book: library.getBooksFromLibrary()){
            if(book.getReviews().equals(search)){
                return book;
            }
        } return bookNotFound;
    }

}
