package Services;

import book.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SearchServiceTest {

    @InjectMocks
    private BookingService bookingService;
    @Mock
    private SearchService searchService;


    @Test
    public void findBookByTitle(){
        Book book = new Book("The Fellowship of the Ring", "Fantasy","J.R.R. Tolkien","1954-07-29", "4", 249, false);
        when(searchService.searchTitle("The Fellowship of the Ring")).thenReturn(book);
        String expected = "The Fellowship of the Ring";
        String actual = searchService.searchTitle("The Fellowship of the Ring").getTitle();

        assertEquals(expected, actual);
    }

    @Test
    public void findBookByGenre(){
        Book book = new Book("Bambi", "Kids", "Walt Disney", "1942-08-09", "4", 99, true);
        when(searchService.searchGenre("Kids")).thenReturn(book);
        String expected ="Bambi";
        String actual = searchService.searchGenre("Kids").getTitle();

        assertEquals(expected,actual);
    }

    @Test
    public void findBookByAuthor(){
        Book book = new Book("Harry Potter and the Order of the Phoenix", "Fantasy","J.K. Rowling", "2003-06-21", "4.5", 249, true);
        when(searchService.searchAuthor("J.K. Rowling")).thenReturn(book);
        String expected = "Harry Potter and the Order of the Phoenix";
        String actual = searchService.searchAuthor("J.K. Rowling").getTitle();

        assertEquals(expected, actual);
    }

    @Test
    public void findBookByPublicityDate(){
        Book book = new Book("The Sword in the Stone","Adventure", "Wolfgang Reitherman","1969-12-18", "3.5", 149, true);
        when(searchService.searchPublicityDate("1969-12-18")).thenReturn(book);
        String expected = "The Sword in the Stone";
        String actual = searchService.searchPublicityDate("1969-12-18").getTitle();

        assertEquals(expected, actual);
    }

    @Test
    public void findBookByReview(){
        Book book = new Book("The Sword in the Stone","Adventure", "Wolfgang Reitherman","1969-12-18", "3.5", 149, true);
        when(searchService.searchReviews("3.5")).thenReturn(book);
        String expected = "The Sword in the Stone";
        String actual = searchService.searchReviews("3.5").getTitle();

        assertEquals(expected, actual);
    }

}