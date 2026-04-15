import java.util.*;
abstract class Publication{
    protected int np;
    protected double price;
    protected String publisherName;
    public Publication(int np,double price,String publisherName)
    {
        this.np=np;
        this.price=price;
        this.publisherName=publisherName;
    }
    public abstract void printDetails();
}

class Book extends Publication{
    private String title;
    private String author;
    public Book(String title,String author,int pages,double price,String publisher)
    {
        super(pages,price,publisher);
        this.title=title;
        this.author=author;
    }
    public void printDetails(){
        System.out.println("Book:"+title+" Author: "+author+" Pages: "+np+" Price: "+price+" Publisher: "+publisherName);
    }
}

class Journal extends Publication{
    private String topic;
    public Journal(String topic,int pages,double price,String publisher)
    {
        super(pages,price,publisher);
        this.topic=topic;
    }
    public void printDetails(){
        System.out.println("Journal Topic: "+topic+" Pages: "+np+" Price: "+price+" publisher: "+publisherName);
    }
}

class Library{
    private List<Publication> arr=new ArrayList<>();
    public void addPublication(Publication p)
    {
        arr.add(p);
    }
    public void printAll(){
        for(Publication p:arr)
            p.printDetails();
    }
}

public class p7{
    public static void main(String[] args) {
        Library l=new Library();
        l.addPublication(new Book("Java", "P1", 300, 200, "Pearson"));
        l.addPublication(new Book("OOS", "P2", 230, 430, "MCG"));
        l.addPublication(new Book("DSA", "P3", 320, 860, "JU"));
        l.addPublication(new Journal("Jour 1", 30, 230, "CU"));
        l.addPublication(new Journal("Jour 2", 10, 320, "SO"));
        l.printAll();
    }
}