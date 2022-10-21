import java.util.*;
class Main{
    static int fun(int a)
    {
        int d,c=0,k=a,p=1;
        while(a!=0)
        {
            d=a%10;
            p=1;
            while(d>0)
            {
                p*=d;
                d--;
            }
            c+=p;
            a/=10;
        }
        if(k==c)
        return 1;
        else
        return 0;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(fun(a)==1)
        System.out.printf("The number %d is a strong number",a);
        else
        System.out.printf("The number %d is not a strong number",a);
        
    }
}