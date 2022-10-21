import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Vector<String>v=new Vector<String>(a);
        int [] arr=new int[a];
        int max=-10;
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            max=arr[i];
        }
        int k=sc.nextInt();
        for(int i:arr)
        {
            if(i+k>=max)
            v.add("True");
            else
            v.add("False");
        }
        for(String i:v)
        System.out.print(i+" ");
    }
}