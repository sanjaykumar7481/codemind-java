import java.util.*;
class Main{
    static int prime(int n)
    {
        if(n==0)
        return 0;
        if(n==1)
        return 0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0,g=a;
        int d,k=0;
        while(a>0)
        {
            d=a%10;
            if(prime(d)==1)
            c++;
            a/=10;
            k++;
        }
        if(c==k && prime(g)==1)
        System.out.println("Mega Prime");
        else 
        System.out.println("Not Mega Prime");
    }
}