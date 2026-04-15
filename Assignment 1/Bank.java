import java.util.*;
class BankAccount{
    private int AccountNumber;
    private double balance;
    private String ownerName;
    public BankAccount(int AccountNumber,double balance,String ownerName)
    {
        this.AccountNumber=AccountNumber;
        this.balance=balance;
        this.ownerName=ownerName;
    }
    public double balance(){
        return balance;
    }
    public void add(double amt)
    {
        if(amt>0)
            balance+=amt;
    }
    public void subtract(double amt)
    {
        if(amt>balance)
            System.out.println("Insufficient balance");
        else
        {
            balance-=amt;
            System.out.println("Current balance after withdrawal: "+balance);
        }
    }
    public int getAccountNumber(){
        return AccountNumber;
    }
    public void display()
    {
        System.out.println("Account No.: "+AccountNumber);
        System.out.println("Owner name: "+ownerName);
        System.out.println("Balance: "+balance);
    }
}

class AccountManager{
    private BankAccount[] accounts;
    private int cnt;
    public AccountManager(int size){
        accounts=new BankAccount[size];
        cnt=0;
    }
    public void create(int accNo,String name,double balance)
    {
        accounts[cnt++]=new BankAccount(accNo, balance, name);
    }
    public void delete(int accNo)
    {
        for(int i=0;i<cnt;i++)
        {
            if(accounts[i].getAccountNumber()==accNo)
            {
                accounts[i]=accounts[cnt-1];
                accounts[cnt-1]=null;
                cnt--;
                System.out.println("Account Deleted: "+accNo);
                return;
            }
        }
    }
    public void deposit(int accNo,double amt){
        for(int i=0;i<cnt;i++)
        {
            if(accounts[i].getAccountNumber()==accNo)
            {
                accounts[i].add(amt);
                return;
            }
        }
    }
    public void withdraw(int accNo,double amt){
        for(int i=0;i<cnt;i++)
        {
            if(accounts[i].getAccountNumber()==accNo)
            {
                accounts[i].subtract(amt);
                return;
            }
        }
    }

    public void displayAll(){
        for(int i=0;i<cnt;i++)
        {
            accounts[i].display();
        }
    }
}

class Bank{
    public static void main(String[] args) {
        AccountManager am=new AccountManager(5);
        am.create(100, "Person1", 10000);
        am.create(101, "Person2", 14000);
        am.create(102, "Person3", 12300);
        am.create(103, "Person4", 13200);
        am.create(104, "Person5", 12100);
        System.out.println("Bank Acc Details: ");
        am.displayAll();
        am.deposit(101, 2000);
        am.withdraw(103, 5000);
        am.delete(104);
        System.out.println("Bank Acc Details: ");
        am.displayAll();
    }
}