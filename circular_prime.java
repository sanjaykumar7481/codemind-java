import java.util.*;
class Main{
    static int prime(int n)
    {
        if(n<=1)
        return 0;
        if(n==2)
        return 1;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,r=0,k=n;
        while(n>0)
        {
            r=r*10+(n%10);
            n/=10;
        }
        if(prime(k)==1)
        {
            if(prime(r)==1)
            System.out.print("circular prime");
            else
            System.out.print("prime but not a circular prime");
        }
        else
        System.out.print("not prime");
    }
}