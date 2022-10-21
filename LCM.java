import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm=(a>b)?a:b;
        while(lcm>0)
        {
            if(lcm%a==0 && lcm%b==0)
            break;
            lcm++;
        }
        System.out.print(lcm);
    }
}