import java.util.*;
class Account{
    protected int accountNumber;
    protected String holderName;
    protected double balance;
    public Account(int accountNumber,String holderName,double balance)
    {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void setBalance(double bal){
        balance=bal;
    }
    public double getBalance(){
        return balance;
    }
    public void printDetails(){
        System.out.println("Account no.: "+accountNumber);
        System.out.println("Account name: "+holderName);
        System.out.println("Balance:"+balance);
    }
}

class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(int accNo,String name,double bal,double interestRate)
    {
        super(accNo, name, bal);
        this.interestRate=interestRate;
    }
    public double calculateYearlyInterest(){
        return (interestRate*balance/100);
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Interest Rate: "+interestRate);
        System.out.println("");
    }
}

class currentAccount extends Account{
    public currentAccount(int accNo,String name,double bal)
    {
        super(accNo,name,bal);
    }
}

class Manager{
    private List<Account> arr=new ArrayList<>();
    public void addAccount(Account a)
    {
        arr.add(a);
    }
    public void printAll(){
        for(Account a:arr)
            {
                a.printDetails();
                System.out.println();
            }
    }
}

public class p8{
    public static void main(String[] args) {
        Manager m=new Manager();
        m.addAccount(new Account(101, "P1", 10000));
        m.addAccount(new Account(102, "P2", 12003));
        m.addAccount(new Account(103, "P3", 14213));
        m.printAll();
    }
}