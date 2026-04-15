import java.util.*;
class Complex{
    private int real;
    private int img;
    public Complex(){
        real=0;
        img=0;
    }
    public Complex(int r){
        real=r;
        img=0;
    }
    public Complex(int r,int i)
    {
        real=r;
        img=i;
    }
    public Complex add(Complex c){
        return new Complex(this.real+c.real,this.img+c.img);
    }
    public Complex multiply(Complex c)
    {
        int r=this.real*c.real-this.img*c.img;
        int i=this.real*c.img+this.img*c.real;
        return new Complex(r,i);
    }
    public void display()
    {
        if(img>=0)
            System.out.println(real+"+"+img+"i");
        else
            System.out.println(real+"-"+(-img)+"i");
    }
}

public class p5{
    public static void main(String[] args) {
        Complex c1=new Complex(3, 2);
        Complex c2=new Complex(4, -2);
        Complex s=c1.add(c2);
        Complex pdt=c1.multiply(c2);
        System.out.println("Sum: ");
        s.display();
        System.out.println("Product: ");
        pdt.display();
    }
}