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
        while(a-->0)
        {
            int n=sc.nextInt();
            if(palin(n)==1)
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}