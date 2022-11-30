package book;

public class Book {
    private String title;
    private String genre;
    private String author;
    private String publicityDate;
    private String reviews;
    private int price;
    private boolean availability;

    public Book(String title, String genre, String author, String publicityDate, String reviews, int price, boolean availability) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publicityDate = publicityDate;
        this.reviews = reviews;
        this.price = price;
        this.availability = availability;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicityDate() {
        return publicityDate;
    }

    public void setPublicityDate(String publicityDate) {
        this.publicityDate = publicityDate;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "org.example.Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", publicityDate='" + publicityDate + '\'' +
                ", reviews='" + reviews + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}
