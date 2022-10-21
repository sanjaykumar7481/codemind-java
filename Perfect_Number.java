import java.util.*;
class Main{
    static void fun(int a)
    {
        int d=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            d+=i;
        }
        if(d==a)
        System.out.print("True");
        else
        System.out.print("False");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        fun(a);
    }
}