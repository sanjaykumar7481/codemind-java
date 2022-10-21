import java.util.*;
class Demo{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        int h=p.nextInt();
        int n=p.nextInt();
        int k=p.nextInt();
        int c=0;
        for(int i=h;i<=n;i++)
        {
            if(i%k==0)
            c++;
        }
        System.out.print(c);
    }
}