import java.util.*;
class Main{
    static int palin(int n)
        {
            n=Math.abs(n);
            int r=0,t=n;
            while(n!=0)
            {
                r=r*10+(n%10);
                n/=10;
            }
            return r;
        }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        System.out.print("-"+palin(n));
        else
        System.out.print(palin(n));
    }
}