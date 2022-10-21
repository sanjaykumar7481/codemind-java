import java.util.*;
class Main{
    static int palin(int n)
    {
        int r=0,t=n;
        while(n!=0)
        {
            r=r*10+(n%10);
            n/=10;
        }
        if(t==r)
        return 1;
        else
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(palin(i)==1)
            System.out.print(i+" ");
        }
        
    }
}