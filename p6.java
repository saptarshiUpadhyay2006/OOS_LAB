import java.util.*;
class Employee{
    private  double salary;
    private String name;
    private String address;
    private int id;
    public Employee(int id,String address,String name,double salary)
    {
        this.id=id;
        this.address=address;
        this.name=name;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("address: "+address);
        System.out.println("salary: "+salary);
    }
    public int getId() {
        return id;
    }
}

class Dept{
    private String dName;
    private String loc;
    private Employee[] employees;
    private int cnt;
    public Dept(String dName,String loc,int size)
    {
        this.dName=dName;
        this.loc=loc;
        employees=new Employee[size];
        cnt=0;
    }
    public void add(Employee e)
    {
        if(cnt<employees.length)
        {
            employees[cnt]=e;
            cnt++;
        }
    }
    public void remove(int id)
    {
        for(int i=0;i<cnt;i++)
        {
            if(employees[i]!=null && employees[i].getId()==id)
            {
                employees[i]=employees[cnt-1];
                employees[cnt-1]=null;
                cnt--;
                break;
            }
        }
    }
    public double annual(){
        double t=0;
        for(int i=0;i<cnt;i++)
        {
            t+=employees[i].getSalary()*12;
        }
        return t;
    }
    public void displayDept(){
        System.out.println("Dept:"+dName);
        System.out.println("Location"+loc);
        System.out.println("Employees");
        for(int i=0;i<cnt;i++)
        {
            employees[i].display();
        }
    }
}

public class p6{
    public static void main(String[] args) {
        Dept d=new Dept("Information Technology", "Salt Lake", 5);
        d.add(new Employee(101, "kolkata", "P1", 100320));
        d.add(new Employee(102, "Mumbai", "P2", 100012));
        d.add(new Employee(103, "Delhi", "P3", 103100));
        d.add(new Employee(104, "Chennai", "P4", 103210));
        d.add(new Employee(105, "Pune", "P5", 101200));
        d.displayDept();
        System.out.println("Yearly Expenditure: "+d.annual());
    }
}