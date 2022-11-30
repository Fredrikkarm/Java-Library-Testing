package Services;


import book.Book;

public class BookingService {

    private SearchService searchService;
    private PaymentService paymentService;

    public BookingService(SearchService searchService, PaymentService paymentService) {
        this.searchService = searchService;
        this.paymentService = paymentService;
    }

    public boolean checkAvailability(BookingRequest bookingRequest){
        Book book = searchService.searchTitle(bookingRequest.getTitle());
        return book.isAvailability();
    }

    public void bookABook(BookingRequest bookingRequest){
        Book bookTitle = searchService.searchTitle(bookingRequest.getTitle());
        //Book bookAuthor = searchService.searchAuthor(bookingRequest.getTitle());
        //Book bookPublicityDate = searchService.searchPublicityDate(bookingRequest.getTitle());
        if(bookTitle.isAvailability() == true){
            bookTitle.setAvailability(false);
            paymentService.pay(bookTitle.getPrice());
        }
    }
}
