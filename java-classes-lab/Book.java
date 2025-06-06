public class Book {
    // Encapsulated fields
    private String title;
    private String author;
    private double price;
    private String publisher = "Unknown";

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Overloaded constructor (title and author only)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }


    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() { 
        return publisher; 
    } 



    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setPublisher(String publisher) { 
        if (publisher.length()>0){ 
            this.publisher = publisher; 
        } else
            this.publisher = "No Publisher Listed"; 
    }  


    // Overloaded method: getDetails
    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price + ", Publisher: " + publisher;
    }

    public String getDetails(boolean includePrice) {
        if (includePrice) {
            return getDetails();
        }
        return "Title: " + title + ", Author: " + author;
    }
}

