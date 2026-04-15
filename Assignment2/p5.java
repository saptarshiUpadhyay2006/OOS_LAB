package Assignment2;

class OddSum extends Thread{
    int sum=0;
    public void run(){
        for(int i=1;i<=100;i+=2)
        {
            sum+=i;
        }
    }
}

class EvenSum extends Thread{
    int sum=0;
    public void run(){
        for(int i=2;i<=100;i+=2)
        {
            sum+=i;
        }
    }
}

public class p5{
    public static void main(String[] args) throws InterruptedException
    {
        OddSum t1=new OddSum();
        EvenSum t2=new EvenSum();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        int total=t1.sum+t2.sum;
        System.out.println("Final sum: "+total);
    }
}