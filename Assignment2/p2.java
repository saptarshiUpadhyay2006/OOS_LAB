package Assignment2;

class Number{
    int n=1,maxi=8;
    synchronized void printOdd(){
        while(n<=maxi)
        {
            if(n%2==0)
            {
                try{
                    wait();
                }
                catch(Exception e){}
            }
            else{
                System.out.print(n+" ");
                n++;
                notify();
            }
        }
    }
    synchronized void printEven(){
        while(n<=maxi)
        {
            if(n%2==1)
            {
                try{
                    wait();
                }
                catch(Exception e){}
            }
            else{
                System.out.print(n+" ");
                n++;
                notify();
            }
        }
    }
}


class OddThread extends Thread{
    Number np;
    OddThread(Number np)
    {
        this.np=np;
    }
    public void run(){
        np.printOdd();
    }
}

class EvenThread extends Thread{
    Number np;
    EvenThread(Number np)
    {
        this.np=np;
    }
    public void run()
    {
        np.printEven();
    }
}

public class p2{
    public static void main(String[] args) {
        Number np=new Number();
        new OddThread(np).start();
        new EvenThread(np).start();
    }
}