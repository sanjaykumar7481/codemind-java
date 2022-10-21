import java.util.*;
class Main{
    static long prime(long a)
    {
        if(a<=1)
        return 0;
        if(a==2)
        return 1;
        for(long i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long k=1,g;
        long n=sc.nextLong();
        for(long i=1;i<=n;i++)
        {
            if(prime(i)>0)
            k=i;
        }
        g=n+1;
        while(g>0)
        {
            if(prime(g)>0)
            break;
            g++;
        }
        if(prime(n)>0)
        System.out.print(0);
        else{
        if(Math.abs(k-n)<Math.abs(g-n))
        System.out.println(Math.abs(k-n));
        else if(Math.abs(k-n)==Math.abs(g-n))
        System.out.println(Math.abs(k-n));
        else
        System.out.println(Math.abs(g-n));
        }
    }
}