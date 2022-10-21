import java.util.*;
class Main{
    static int fun(int a)
    {
        int d=0;
        while(a!=0)
        {
            d+=a%10;
            a/=10;
        }
        if(d<10)
        return d;
        else
        return fun(d);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(fun(a));
    }
}