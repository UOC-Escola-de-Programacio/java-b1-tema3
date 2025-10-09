public class Book extends Product {
    private String author;

    public Book(int id, String name, double price, String author) {
        super(id, name, price);
        // TODO: call setAuthor
    }

    public Book(int id, String name, double price) {
        // TODO: call other constructor using "Unknown"
        super(id, name, price);
    }

    public void setAuthor(String author) {
        // TODO: if author is null or empty, print "Author name cannot be empty." and assign "Unknown"
        // else assign the value
    }

    public String getAuthor() {
        // TODO: return author
      
    }

    @Override
    public String toString() {
        // TODO: return the string in the format:
        // <id> - <name>: <price>€ - Author: <author>
       
    }
}
