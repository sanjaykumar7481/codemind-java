import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n;
        n=n*n;
        int c=0;
        while(n>0)
        {
            c+=(n%10);
            n/=10;
        }
        if(c==k)
        System.out.print("Neon Number");
        else
        System.out.print("Not Neon Number");
    }
}