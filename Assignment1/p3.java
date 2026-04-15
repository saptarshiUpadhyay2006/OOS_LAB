import java.util.*;
class Stack{
    int arr[];
    int size;
    int top;
    Stack(int s){
        top=-1;
        size=s;
        arr=new int[size];
    }
    void push(int x){
        if(top==(size-1))
        {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top]=x; 
    }
    void pop(){
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Popped element: "+arr[top--]);
    }
    void print(){
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack s=new Stack(30);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(15);
        s.push(9);
        s.print();
        s.pop();
        s.pop();
        s.pop();
        s.print();
    }
}