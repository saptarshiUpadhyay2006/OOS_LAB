import java.util.*;
class TollBooth{
    private int totalCars;
    private int unpaidCars;
    private int totalCash;
    public void payingCar(){
        totalCars++;
        totalCash+=50;
    }
    public void nonPayingCar(){
        totalCars++;
        unpaidCars++;
    }
    public void display(){
        System.out.println("Cars without paying: "+unpaidCars);
        System.out.println("Total Cars: "+totalCars);
        System.out.println("Total cash collected: "+totalCash);
    }
}

public class p15{
    public static void main(String[] args) {
        TollBooth t=new TollBooth();
        t.payingCar();
        t.payingCar();
        t.nonPayingCar();
        t.payingCar();
        t.nonPayingCar();
        t.display();
    }
}