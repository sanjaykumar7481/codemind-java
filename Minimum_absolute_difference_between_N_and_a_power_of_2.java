import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        int i=1;
        while(p<=n)
        {
            p*=2;
        }
        int k=p/2;
        if(Math.abs(k-n)<=Math.abs(p-n))
        System.out.print(Math.abs(k-n));
        else
        System.out.print(Math.abs(p-n));
        
    }
}