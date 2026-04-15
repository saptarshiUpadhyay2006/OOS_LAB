package Assignment3;

class p1{
    public static <T extends Comparable<T>> void sortArr(T arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,2,8,1,3};
        sortArr(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println("");
    }
}