import java.util.*;
class Demo{
    static int prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    static int palin(int n)
    {
        int t=n,s=0;
        while(n>0)
        {
            int d=n%10;
            s=s*10+d;
            n=n/10;
        }
        if(s==t)
        return 1;
        else
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        int n=p.nextInt();
        n++;
        while(n>0)
        {
        if(palin(n)==1)
        {
            if(prime(n)==1)
            break;
        }
        n++;
        }
        System.out.println(n);
    }
}