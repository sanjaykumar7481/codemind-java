import java.util.*;
class Main{
    static int fun(int a)
    {
        int d,c=0,k=a,p=0;
        while(a!=0)
        {
            d=a%10;
            if(k%d==0)
            c++;
            a/=10;
            p++;
        }
        if(c==p)
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
            if(i%10!=0 && fun(i)==1)
            System.out.print(i+" ");
        }
    }
}