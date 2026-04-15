import java.util.*;
class Book{
    private String title,author,publisher;
    private double cost;
    private int stock;
    public Book(String title,String author,String publisher,double cost,int stock)
    {
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.cost=cost;
        this.stock=stock;
    }
    public boolean isMatch(String t,String a)
    {
        return title.equalsIgnoreCase(t) && author.equalsIgnoreCase(a);
    }
    public void sell(int copies)
    {
        if(copies<=stock)
        {
            System.out.println("Total Cost: " + (copies * cost));
            stock -= copies;
        } 
        else 
        {
        System.out.println("Required copies not in stock");
        }
    }
    public void printDetails() {
        System.out.println(title + "," + author + "," +publisher + ",Cost: " + cost + ",Stock: " + stock);
    }
}
public class p10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book("Java", "James", "Pearson", 500, 10);
        System.out.print("Enter title: ");
        String t = sc.nextLine();
        System.out.print("Enter author: ");
        String a = sc.nextLine();
        if (b.isMatch(t, a)) {
            b.printDetails();
            System.out.print("Enter copies required: ");
            int c = sc.nextInt();
            b.sell(c);
        } 
        else 
        {
            System.out.println("Book not available");
        }

    }
}