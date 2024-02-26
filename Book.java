package Problem1;

// created class Book for all book attributes,constructors,setters and getters
public class Book
{

    // Attributes for Class Book
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    //Constructor for class Book to initialize book attributes

    public Book(int bookId, String title, String author, boolean isAvailable)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Getters and setters for all book attributes

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
