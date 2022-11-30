package Services;

import book.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookingServiceTest {

    @InjectMocks
    private BookingService bookingService;
    @Spy
    private PaymentService paymentServiceMock;
    @Mock
    private SearchService searchService;
    @Captor
    private ArgumentCaptor<Integer> intCaptor;


    @Test
    public void bookIfBookIsAvailable(){
        BookingRequest bookingRequest = new BookingRequest("Bambi");
        Book book = new Book("Bambi", "Kids", "Walt Disney", "1942-08-09", "4", 99, true);
        when(searchService.searchTitle("Bambi")).thenReturn(book);
        assertTrue(bookingService.checkAvailability(bookingRequest));
    }

    @Test
    public void dontBookIfBookIsNotAvailable(){
        BookingRequest bookingRequest = new BookingRequest("Bambi");
        Book book = new Book("Bambi", "Kids", "Walt Disney", "1942-08-09", "4", 99, false);
        when(searchService.searchTitle("Bambi")).thenReturn(book);
        assertFalse(bookingService.checkAvailability(bookingRequest));
    }

    @Test
    public void shouldPayRightAmountIfBookIsAvailable(){
        BookingRequest bookingRequest = new BookingRequest("Bambi");
        Book book = new Book("Bambi", "Kids", "Walt Disney", "1942-08-09", "4", 99, true);
        when(searchService.searchTitle("Bambi")).thenReturn(book);
        bookingService.bookABook(bookingRequest);
        verify(paymentServiceMock,times(1)).pay(intCaptor.capture());
        int amountToPay = intCaptor.getValue();
        assertEquals(99,amountToPay);
    }
}