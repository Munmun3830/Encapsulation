 
package book1; 
    class Book { 
    private String title;
    private String author;
    private double price;
    public String getTitle() {
        return title;
    } 
    public void setTitle(String title) {
        this.title = title;
    } 
    public String getAuthor() {
        return author;
    } 
    public void setAuthor(String author) {
        this.author = author;
    } 
    public double getPrice() {
        return price;
    } 
    public void setPrice(double price) {
        this.price = price;
    } 
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price -= this.price * (percentage / 100);
        }
    }
 }
public class Book1 { 
    public static void main(String[] args) { 
         Book book = new Book();      
        book.setTitle("Python for Beginners");
        book.setAuthor("Alex Johnson");
        book.setPrice(46.67); 
        book.applyDiscount(10); 
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());
    }
 }
 