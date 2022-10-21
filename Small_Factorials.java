import java.util.*;
class Demo{
    static int fact(int n)
    {
        if(n<=1)
        return 1;
        else
        return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        int n=p.nextInt();
        for(int i=1;i<=n;i++)
        {
            int h=p.nextInt();
            System.out.println(fact(h));
        }
    }
}