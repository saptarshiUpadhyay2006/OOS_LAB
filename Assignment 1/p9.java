import java.util.*;
class Person{
    protected int age;
    protected double wt,ht;
    protected String dob,address;
    public Person(int age,double wt,double ht,String dob,String address)
    {
        this.age=age;
        this.wt=wt;
        this.ht=ht;
        this.dob=dob;
        this.address=address;
    }
}

class Employee extends Person{
    protected double salary;
    protected String doj;
    protected int exp;
    public Employee(int age,double wt,double ht,String dob,String address,double salary,String doj,int exp)
    {
        super(age, wt, ht, dob, address);
        this.salary=salary;
        this.doj=doj;
        this.exp=exp;
    }
}

class Technician extends Employee{
    public Technician(int age,double wt,double ht,String dob,String address,double salary,String doj,int exp){
        super(age, wt, ht, dob, address, salary, doj, exp);
    }
}

class Professor extends Employee{
    private List<String> cs=new ArrayList<>();
    private List<String> la=new ArrayList<>();
    public Professor(int age,double wt,double ht,String dob,String address,double salary,String doj,int exp)
    {
        super(age, wt, ht, dob, address, salary, doj, exp);
    }
    public void addCourse(String c){
        cs.add(c);
    }
    public void addAdvisee(String a)
    {
        la.add(a);
    }
    public void remCourse(String c){
        cs.remove(c);
    }
    public void remAdvisee(String a)
    {
        la.remove(a);
    }
}

class Student extends Person{
    private int roll;
    Map<String,Integer> subs=new HashMap<>();
    public Student(int age,double wt,double ht,String dob,String address,int roll)
    {
        super(age, wt, ht, dob, address);
        this.roll=roll;
    }
    public void add(String sub,int marks)
    {
        subs.put(sub,marks);
    }
    public char calculateGrade(){
        int s=0;
        for(int m:subs.values())
            s+=m;
        int avg=s/subs.size();
        if(avg>=90)
            return 'S';
        if(avg>=80)
            return 'B';
        if(avg>=70)
            return 'C';
        if(avg>=60)
            return 'D';
        if(avg>=50)
            return 'E';
        return 'X';
    }
}


public class p9{
    public static void main(String[] args) {
        Student s=new Student(20, 50, 5.6, "14th Jan 2006", "Belgharia", 101);
        s.add("OOS",97);
        s.add("Maths", 95);
        s.add("GTC", 98);
        Professor p=new Professor(48, 60, 6.2, "12th Jan 1927", "Kolkata", 102210, "2003",14);
        p.addAdvisee("Vocal Strength");
        p.addCourse("OOS");
        Technician t=new Technician(35, 65, 5.7, "03-03-1990",
                "Delhi",35000, "2015", 10);
        System.out.println("Student Grade: " +s.calculateGrade());
        System.out.println("Objects created");
    }
}