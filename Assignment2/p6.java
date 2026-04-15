package Assignment2;

class SearchThread extends Thread {
    int arr[];
    int start, end, target;
    int threadIndex;
    SearchThread(int arr[], int start, int end, int target, int threadIndex) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.target = target;
        this.threadIndex = threadIndex;
    }
    public void run()
    {
        int left=start;
        int right=end;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
            {
                System.out.println("Thread " + threadIndex +" found element at index " + mid);
                return;
            }
            else if(arr[mid]<target) {
                left=mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        System.out.println("Thread " + threadIndex + " did not find element.");
    }
}
    
public class p6{    
    public static void main(String args[])
    {
        int arr[]=new int[100];
        for (int i=0;i<100;i++) {
            arr[i]=i+1;
        }
        int target=55;
        int n=arr.length;
        int numThreads=n/10;
        SearchThread threads[]=new SearchThread[numThreads];
        for (int i=0;i<numThreads; i++) {
            int start=i*10;
            int end=start+9;
            threads[i]=new SearchThread(arr, start, end, target, i);
            threads[i].start();
        }
    }
}    