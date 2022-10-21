import java.util.*;
class Demo{
    static int prime(int n)
    {
        if(n<=1)
        return 0;
        if(n==2)
        return 1;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        int h=p.nextInt();
        int s=p.nextInt();
        h=h+s+1;
        int c=1;
        while(c>0)
        {
            if(prime(h)==1)
            {
                System.out.print(c);
                break;
            }
            h+=1;
            c++;
        }
    }
}