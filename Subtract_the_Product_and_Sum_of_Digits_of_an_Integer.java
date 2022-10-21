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
        return Math.abs(p-c);
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print(fun(a));
    }
}