import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0)
        {
            int n=sc.nextInt();
            if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n)
            System.out.println("True");
            else
            System.out.println("False");   
        }
    }
}