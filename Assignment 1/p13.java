class Automobile {
    protected String make, type, registrationNumber;
    protected int maxSpeed;
    protected double price, mileage;
    public Automobile(String make, String type, int maxSpeed,double price, double mileage, String regNo) {
        this.make = make;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.mileage = mileage;
        this.registrationNumber = regNo;
    }
    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Type: " + type);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage);
        System.out.println("Reg No: " + registrationNumber);
    }
}
    
class Truck extends Automobile {
    private int capacity, noOfWheels;
    private String hoodType;
    public Truck(String make, String type, int maxSpeed, double price,double mileage, String regNo,int capacity, String hoodType, int noOfWheels) 
    {
        super(make, type, maxSpeed, price, mileage, regNo);
        this.capacity = capacity;
        this.hoodType = hoodType;
        this.noOfWheels = noOfWheels;
    }
    public void display() {
        super.display();
        System.out.println("Capacity: " + capacity);
        System.out.println("Hood Type: " + hoodType);
        System.out.println("Wheels: " + noOfWheels);
    }
}
    
class Car extends Automobile 
{
    private int noOfDoors, seatingCapacity;
    public Car(String make, String type, int maxSpeed, double price,double mileage, String regNo,int doors, int seats) {
        super(make, type, maxSpeed, price, mileage, regNo);
        this.noOfDoors = doors;
        this.seatingCapacity = seats;
    }
    public void display() {
        super.display();
        System.out.println("Doors: " + noOfDoors);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}
    
public class p13
{
    public static void main(String[] args) {
        Truck t = new Truck("Tata", "Truck", 80, 1212300, 6, "WB12A",10, "Flat", 6);
        Car c = new Car("Honda", "Car", 180, 8002312, 18, "WB45B",4, 5);
        t.display();
        System.out.println();
        c.display();
    }
}    