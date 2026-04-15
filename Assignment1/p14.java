import java.util.*;
interface Shape{
    double area();
    void draw();
    void rotate();
    void move(int dx,int dy);
}

class Circle implements Shape{
    private int x,y;
    private double radius;
    public Circle(int x,int y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public void draw(){
        System.out.println("Circle");
    }
    public void move(int dx,int dy)
    {
        x+=dx;
        y+=dy;
    }
    public void rotate(){
        System.out.println("Circle rotated");
    }
    public void display(){
        System.out.println("Circle at x:"+x+" ,y: "+y);
        System.out.println("Area: "+area());
    }
}

class Rectangle implements Shape{
    private int x,y;
    private double l,b;
    public Rectangle(int x,int y,double l,double b){
        this.x=x;
        this.y=y;
        this.l=l;
        this.b=b;
    }
    public double area(){
        return l*b;
    }
    public void draw(){
        System.out.println("Rectangle");
    }
    public void move(int dx,int dy)
    {
        x+=dx;
        y+=dy;
    }
    public void rotate(){
        System.out.println("Rectangle rotated");
    }
    public void display(){
        System.out.println("Rectangle at x:"+x+" ,y: "+y);
        System.out.println("Area: "+area());
    }
}

public class p14{
    public static void main(String[] args) {
        Circle c1=new Circle(0, 0, 5);
        Circle c2=new Circle(4, 1, 2);
        Rectangle r1=new Rectangle(0, 0, 2, 4);
        Rectangle r2=new Rectangle(2, 0, 5, 2);
        Rectangle r3=new Rectangle(0, 3, 21, 3);
        c1.display();
        c1.move(1, 3);
        c1.display();
        r1.display();
        r1.move(1, 1);
        r1.display();
    }
}