package Assignment3;

class p2{
    public static <T> void freq(T arr[]){
        boolean b[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(b[i]==true)
                continue;
            int num=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    num++;
                    b[j]=true;
                }
            }
            System.out.println(arr[i]+" "+num);
        }
    }
    public static void main(String[] args) {
        String arr[]={"A","B","A","C","B","A"};
        freq(arr);
    }
}