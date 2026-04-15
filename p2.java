import java.util.*;
class Student{
    String name;
    double m1,m2,m3;
    Student(String n,double a,double b,double c){
        name=n;
        m1=a;
        m2=b;
        m3=c;
    }
    double average(){
        return (m1+m2+m3)/3;
    }
    void display(){
        System.out.println("name="+name);
        System.out.println("Marks in sub 1:"+m1);
        System.out.println("Marks in sub 2:"+m2);
        System.out.println("Marks in sub 3:"+m3);
    }
    public static void main(String[] args) {
        Student s=new Student("Spuk", 97, 98, 95);
        s.display();
    }
}