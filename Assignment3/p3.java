package Assignment3;

class p3<T>{
    public void dup(T arr[]){
        boolean b[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(b[i]==true)
                continue;
            boolean found=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    b[j]=true;
                    found=true;
                }
            }
            if(found==true)
                System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Integer arr[]={1,2,3,2,4,1,5};
        p3<Integer> ob=new p3<>();
        ob.dup(arr);
    }
}