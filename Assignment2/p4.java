package Assignment2;

import java.io.*;
import java.util.*;

class SharedBuffer{
    private Queue<Integer> buff=new LinkedList<>();
    private boolean b=false;
    public synchronized void produce(int val) throws InterruptedException
    {
        buff.add(val);
        notify();
    }
    public synchronized int consume() throws InterruptedException{
        while(buff.isEmpty()){
            if(b)
                return -1;
            wait();
        }
        return buff.poll();
    }

    public synchronized void setFinish(){
        b=true;
        notifyAll();
    }
}

class Producer extends Thread 
{
    private SharedBuffer buffer;
    private String fileName;
    Producer(SharedBuffer buffer,String fileName)
    {
        this.buffer=buffer;
        this.fileName=fileName;
    }
    public void run()
    {
        try(Scanner sc=new Scanner(new File(fileName)))
        {
            while(sc.hasNextInt())
            {
                int num=sc.nextInt();
                buffer.produce(num);
            }
            buffer.setFinish();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
    
class Consumer extends Thread {
    private SharedBuffer buffer;
    Consumer(SharedBuffer buffer)
    {
        this.buffer = buffer;
    }
    public void run() {
        int sum = 0;
        try {
            while (true) {
                int value = buffer.consume();
                if (value == -1)
                    break;
                sum += value;
            }
            System.out.println("Final Sum: " + sum);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
public class p4{
    public static void main(String args[])
    {
        SharedBuffer buffer=new SharedBuffer();
        Producer p=new Producer(buffer, "numbers.txt");
        Consumer c=new Consumer(buffer);
        p.start();
        c.start();
    }
}