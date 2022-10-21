import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int a=0;
        int b=1;
        int c=0;
        int p=0,k=0;
        while(a<=n)
        {
            p=a;
            // System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            k=a;
        }
        if(Math.abs(p-n)<Math.abs(k-n))
        System.out.print(p);
        else if(Math.abs(p-n)==Math.abs(k-n))
        System.out.print(p+" "+k);
        else
        System.out.print(k);
        
    }
}