import java.util.*;
class Book{
    private String author,title,publisher;
    private double cost;
    private int stock;
    public Book(String author, String title, String publisher,double cost, int stock) 
    {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.cost = cost;
        this.stock = stock;
    }
    public boolean search(String t, String a) {
        return title.equalsIgnoreCase(t) && author.equalsIgnoreCase(a);
    }
    public void sell(int copies) {
        if (copies <= stock) {
            System.out.println("Total Cost: Rs. " + (copies * cost));
            stock -= copies;
        } 
        else 
        {
            System.out.println("Required copies not in stock");
        }
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Cost: " + cost);
        System.out.println("Stock: " + stock);
    }
}

public class p17
{
    public static void main(String[] args) {
        Book b = new Book("Joseph Murphy", "Algorithms", "MIT", 650, 10);
        if (b.search("Algorithms", "Joseph Murphy")) {
            b.display();
            b.sell(2);
        } 
        else 
        {
            System.out.println("Book not available");
        }
    }
}