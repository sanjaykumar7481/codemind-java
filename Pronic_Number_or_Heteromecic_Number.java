import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                int k=n/i;
                if(Math.abs(i-k)==1)
                {
                    s=1;
                    break;
                }
            }
        }
        if(s==1)
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}