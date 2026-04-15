package Assignment2;

class Denominator extends Thread{
    static double fac[]=new double[11];
    public void run(){
        fac[0]=1;
        for(int i=1;i<=10;i++)
        {
            fac[i]=fac[i-1]*i;
        }
    }
}

class Series extends Thread{
    public void run(){
        double sum=1.0;
        for(int i=1;i<=10;i++)
        {
            sum+=1.0/Denominator.fac[i];
        }
        System.out.println("Sum= "+sum);
    }
}

public class p3{
    public static void main(String[] args) throws Exception
    {
        Denominator t1=new Denominator();
        Series t2=new Series();
        t1.start();
        t1.join();
        t2.start();
    }
}