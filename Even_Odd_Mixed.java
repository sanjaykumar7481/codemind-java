import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int e=0,o=0,m=0;
        while(a!=0)
        {
            if((a%10)%2==0)
            e++;
            else
            o++;
            a/=10;
        }
        if(e==0)
        System.out.print("Odd");
        else if(o==0)
        System.out.print("Even");
        else
        System.out.print("Mixed");
    }
}