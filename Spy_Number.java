import java.util.*;
class Main{
    static int fun(int a)
    {
        int d,c=0,k=a,p=1;
        while(a!=0)
        {
            d=a%10;
            c+=d;
            p*=d;
            a/=10;
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
        if(fun(a)==1)
        System.out.print("Spy Number");
        else
        System.out.print("Not Spy Number");
    }
}