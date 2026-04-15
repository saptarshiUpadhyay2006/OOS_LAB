package Assignment2;

class ChildThread extends Thread{
    public void run()
    {
        System.out.println("In child thread");
    }
}

public class p1{
    public static void main(String[] args) {
        ChildThread t=new ChildThread();
        t.start();
        System.out.println("In main thread");
    }
}