import java.util.*;
interface Fruit{
    boolean hasAPeel();
}

interface Vegetable{
    boolean hasARoot();
}

class Tomato implements Fruit,Vegetable{
    public boolean hasAPeel(){
        return true;
    }
    public boolean hasARoot(){
        return false;
    }
    public void display(){
        System.out.println("----Tomato----");
        System.out.println("Has a peel: "+hasAPeel());
        System.out.println("Has a root: "+hasARoot());
    }
}

public class p16{
    public static void main(String[] args) {
        Tomato t=new Tomato();
        t.display();
    }
}