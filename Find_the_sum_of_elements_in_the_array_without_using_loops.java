import java.util.*;
class Demo{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        int n=p.nextInt();
        int[] a=new int[n];
        int f=0;
        for(int i=0;i<n;i++)
        {
            a[i]=p.nextInt();
            if(a[i]>n)
            {
                f=1;
            }
        }
        int sum=0;
        for(int s:a)
        {
            sum+=s;
        }
        System.out.println(sum);
    }
}