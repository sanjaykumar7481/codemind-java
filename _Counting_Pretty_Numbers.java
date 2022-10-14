import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0,d;
            for(int i=a;i<=b;i++)
            {
                d=i%10;
                if(d==2 || d==3 ||d==9)
                c++;
            }
            System.out.println(c);
            n--;
        }
    }
}